from __future__ import division
import GPS
import os
import pygtk
pygtk.require('2.0')
import gtk
import re
import warnings
import kiasan.gui
import kiasan.logic
import urllib
import subprocess
import gtk, gobject


def run_kiasan_plugin():
	"""This method runs Kiasan plugin and load generated reports data into integrated GPS window."""
	try:
		project_path = get_project_path()	#normalized project path
		remove_previous_reports = GPS.Preference("sireum-kiasan-delete-previous-kiasan-reports-before-re-running").get()
		prepare_directories_for_reports(project_path, remove_previous_reports)	
		run_kiasan_tool()
		
		#read generated json
		kiasan_logic = kiasan.logic.KiasanLogic()
		report_file_path = project_path + "/.sireum/kiasan/kiasan_sireum_report.json"
		report_file_url = urllib.pathname2url(report_file_path)
		report = kiasan_logic.extract_report_file(report_file_url)
		
		# load data into GUI
		gui = kiasan.gui.KiasanGUI(report)
		
		# attach GUI to GPS
		if GPS.MDI.get('kiasan') is not None:
			GPS.MDI.get('kiasan').hide()	# hide previous Kiasan results
		GPS.MDI.add(gui._pane, "Kiasan", "kiasan")
		win = GPS.MDI.get('kiasan')
		win.split(reuse=True) # reuse=True: bottom from code window, reuse=False: top from code window
		win.float(float=False)	# float=True: popup, float=False: GPS integrated window
	except IndexError:
		GPS.MDI.dialog("Build project, before run Kiasan.")


def get_project_path():
	""" Get project path from GPS API. """
	return os.path.dirname(GPS.current_context().project().file().name()).replace("\\", "/")

	
def prepare_directories_for_reports(project_path, remove_previous_reports):
	"""
	If option 'Delete previous Kiasan reports before re-runing' is enabled then delete entire directory, and create new empty.
	Check if directory sireum and sireum/kiasan exists - if not create them.
	"""	
	if remove_previous_reports:
		REMOVE_DIR_CMD = "rd /s /q" if os.name=="nt" else "rm -rf"
		os.system(REMOVE_DIR_CMD + " " + "\"" + project_path + "/.sireum/kiasan" + "\"")
	if not os.path.isdir(project_path + "/.sireum"):
		os.system("mkdir \"" + project_path + "/.sireum\"")	
	if not os.path.isdir(project_path + "/.sireum/kiasan"):
		os.system("mkdir \"" + project_path + "/.sireum/kiasan\"")


def run_kiasan_tool():
	""" Runs Kiasan based on preferences and clicked entity. """	
	# get package name (we assume that package_name = file_name_without_extension)
	file_name = GPS.current_context().file().name().replace("\\","/")
	match = re.search(r'(?<=\/)(\w+)\.ad[bs]', file_name)
	package_name = match.groups()[0]
	warnings.warn('Maybe better solution is fetch package from entities list? (like methods)')
	
	SIREUM_PATH = get_sireum_path()
	
	load_sireum_settings(SIREUM_PATH)
	
	# get methods as list
	if GPS.current_context().entity().category() == "subprogram":
		methods_list = [GPS.current_context().entity().name()]
	elif GPS.current_context().entity().category() == "package/namespace":
		# fetch all methods from file (method=subprogram) 
		methods_list = []
		for entity in GPS.current_context().file().entities(False):
			if entity.category() == 'subprogram':
				methods_list.append(entity.name())
	
	source_paths = GPS.current_context().directory().replace("\\","/")
	output_dir = os.path.dirname(GPS.current_context().project().file().name()).replace("\\","/") + "/.sireum/kiasan"
	
	#init progress bar
	win_pb, pb = init_progressbar()
	GPS.MDI.add(win_pb, "KiasanProgress", "kiasanprogress")	
	win = GPS.MDI.get('kiasanprogress')
	win.float(float=True)	# float=True: popup, float=False: GPS integrated window
	
	# run Kiasan tool for each method except last one
	kiasan_run_cmd = get_run_kiasan_command(SIREUM_PATH, package_name, source_paths, output_dir, False)	
	method_no = 0
	print 'got', len(methods_list)
	for method in methods_list[:-1]:
		#update progress bar
		pb.set_fraction(float(method_no)/len(methods_list))
		pb.set_text(str(float(method_no)*100/len(methods_list)) + " %")
		method_no += 1
		#run kiasan
		print " ".join(kiasan_run_cmd + [method])
		subprocess.call(kiasan_run_cmd + [method])		
	
	# run Kiasan tool for last method and generate report
	kiasan_run_cmd_with_report = get_run_kiasan_command(SIREUM_PATH, package_name, source_paths, output_dir, True)
	print " ".join(kiasan_run_cmd_with_report + [methods_list[-1]])
	subprocess.call(kiasan_run_cmd_with_report + [methods_list[-1]])
	
	#update progress bar and hide progress it
	GPS.MDI.get('kiasanprogress').hide()


def init_progressbar():
	pane = gtk.VPaned()

	progressbar = gtk.ProgressBar()
	
	pane.add1(progressbar)

	return pane, progressbar


def get_sireum_path():
	""" This method is fetching sireum path from SIREUM_HOME environmental variable or from the PATH (if SIREUM_HOME not set) """
	
	SPLITTER = ";" if os.name=="nt" else ":"
	SIREUM_HOME = "SIREUM_HOME"
	
	sireum_path = ""
	# check if SIREUM_HOME is set
	if SIREUM_HOME in os.environ:
		sireum_path = os.environ[SIREUM_HOME].replace("\\","/").replace("\n","")
	# check if Sireum is in the PATH
	else:
		output = os.environ['PATH'].replace("\\","/")
		paths = output.split(SPLITTER)
		sireum_paths = [i for i in paths if 'Sireum' in i]
		if len(sireum_paths)>0:
			r_index = sireum_paths[0].rfind('Sireum')
			if r_index>-1:
				sireum_path = sireum_paths[0][:r_index+len('Sireum')]
	
	sireum_path = os.path.abspath(sireum_path)	# normalize path (remove / at the end if exists)	
	
	if sireum_path == "":
		raise Exception('Sireum path not found')
	
	return sireum_path


def load_sireum_settings(SIREUM_PATH):
	""" Set preferences (if not set). """
	
	# set HTML Output dir
	html_output_dir = GPS.Preference("sireum-kiasan-html-output-directory")
	if html_output_dir.get()=="":
		home_path = os.environ['HOME'].replace("\\","/")
		default_html_output_path = home_path + "/Documents/Kiasan"
		html_output_dir.set(default_html_output_path)
	
	# set theorem prover and dot exec paths	
	if SIREUM_PATH != "":
		dot_exec = GPS.Preference("sireum-kiasan-location-of-dot-executable")
		if dot_exec.get() == "":
			default_dot_exec_path = SIREUM_PATH + "/apps/graphviz/bin/dot"
			dot_exec.set(default_dot_exec_path)
		
		theorem_prover = GPS.Preference("sireum-kiasan-theorem-prover-bin-directory")
		if theorem_prover.get() == "":
			default_theorem_prover_path = SIREUM_PATH + "/apps/z3/bin"
			theorem_prover.set(default_theorem_prover_path)
	

def get_run_kiasan_command(SIREUM_PATH, package_name, source_paths, output_dir, generate_report):
	""" Create command for run Kiasan. """
	kiasan_lib_dir = SIREUM_PATH + "/apps/bakarv1/eclipse/plugins/org.sireum.spark.eclipse/lib/"	
	spark_source_files = ",".join(get_spark_source_files())
	
	run_kiasan_command = []
	run_kiasan_command.append(SIREUM_PATH + "/apps/platform/java/bin/java")
	run_kiasan_command.append("-jar")
	run_kiasan_command.append(kiasan_lib_dir + "BakarKiasan.jar")
	run_kiasan_command.append("--topi-lib-dir")
	run_kiasan_command.append(kiasan_lib_dir)
	run_kiasan_command.append("--outdir")
	run_kiasan_command.append(output_dir)
	run_kiasan_command.append("--array-bound")
	run_kiasan_command.append(str(GPS.Preference("sireum-kiasan-array-indices-bound").get()))
	run_kiasan_command.append("--loop-bound")
	run_kiasan_command.append(str(GPS.Preference("sireum-kiasan-loop-bound").get()))
	run_kiasan_command.append("--invoke-bound")
	run_kiasan_command.append(str(GPS.Preference("sireum-kiasan-call-chain-bound").get()))
	run_kiasan_command.append("--timeout")
	run_kiasan_command.append(str(GPS.Preference("sireum-kiasan-timeout").get()))
	if GPS.Preference("sireum-kiasan-constrain-scalar-values").get():
		run_kiasan_command.append("--constrain-values")
	run_kiasan_command.append("--smt")
	run_kiasan_command.append(GPS.Preference("sireum-kiasan-theorem-prover").get())
	run_kiasan_command.append("--constraint-solver")
	run_kiasan_command.append(GPS.Preference("sireum-kiasan-theorem-prover").get())
	run_kiasan_command.append("--topi-bin-dir")
	run_kiasan_command.append(GPS.Preference("sireum-kiasan-theorem-prover-bin-directory").get())
	run_kiasan_command.append("--source-paths=" + source_paths)
	
	
	#run_kiasan_command.append("--source-files=" + package_name + ".adb" + "," + package_name + ".ads")
	run_kiasan_command.append("--source-files=" + spark_source_files)
	
	run_kiasan_command.append("--print-trace-bound-exhausted")
	warnings.warn('run_kiasan_command.append("--gen-bound-exhaustion-cases")')
	if generate_report:
		if GPS.Preference("sireum-kiasan-generate-claim-report").get():
			run_kiasan_command.append("--generate-claim-coverage-report")
			run_kiasan_command.append("--modular-analysis")
		run_kiasan_command.append("--generate-pogs-report")
		run_kiasan_command.append("--generate-sireum-report")
		warnings.warn('run_kiasan_command.append("--generate-sireum-report-only")') 
		run_kiasan_command.append("--generate-xml-report")
		if GPS.Preference("sireum-kiasan-generate-json-output").get():
			run_kiasan_command.append("--generate-json-report")
		if GPS.Preference("sireum-kiasan-generate-aunit").get():
			run_kiasan_command.append("--generate-aunit-test-cases")
		if GPS.Preference("sireum-kiasan-generate-html-report").get():
			run_kiasan_command.append("--generate-html-report")
			run_kiasan_command.append("--html-report-dir")
			html_output_dir = GPS.Preference("sireum-kiasan-html-output-directory").get()
			if html_output_dir == "":
				html_output_dir = output_dir
			run_kiasan_command.append(html_output_dir)
			run_kiasan_command.append("--dot-location")
			run_kiasan_command.append(GPS.Preference("sireum-kiasan-location-of-dot-executable").get())
			run_kiasan_command.append("--dot-format") 
			run_kiasan_command.append("XDOT") 
	run_kiasan_command.append(package_name)
	
	return run_kiasan_command


def get_spark_source_files():
	""" Get SPARK source files using GPS API. """	
	spark_files_list = []
	project_files = GPS.current_context().project().sources()
	for proj_file in project_files:
		spark_files_list.append(os.path.basename(proj_file.name()))
	return spark_files_list


def run_examiner(current_file):
	import spark_support
	spark_support.spark.examine_file(GPS.File(current_file))
	


GPS.parse_xml ("""
	<filter_and name="Source editor in Ada" >
    	<filter language="ada" />
    	<filter id="Source editor" />
    	<filter 
    		shell_lang="python" 
    		shell_cmd="GPS.current_context().entity().category() in ['subprogram', 'package/namespace'] " />
  	</filter_and>
	<action name="run Kiasan">
		<filter id="Source editor in Ada" />
		<shell lang="python">sireum.run_kiasan_plugin()</shell>
	</action>	
	<action name="run Examiner">
		<filter id="Source editor in Ada" />
		<shell lang="python">sireum.run_examiner(%f)</shell>
	</action>
    <submenu before="Window">
        <title>Sireum</title>
        <menu action="run Kiasan">
            <title>Run Kiasan</title>
        </menu>	            	
    </submenu>
	<contextual action="run Kiasan" >
    	<Title>Sireum/Run Kiasan</Title>
  	</contextual>
  	<button action="run Examiner">
    	<title>Run Examiner</title>
    	<pixmap>/Users/jj/Programs/gnat/share/gps/plug-ins/icons/run_examiner.png</pixmap>
  	</button>
  	
  	<preference name = "sireum-kiasan-array-indices-bound"
   				page = "Sireum/Kiasan"
   				label = "Array indices bound"
   				type = "integer" 
   				default = "5"
   				/>
   	<preference name = "sireum-kiasan-loop-bound"
   				page = "Sireum/Kiasan"
   				label = "Loop bound"
   				type = "integer" 
   				default = "10"
   				/>
   	<preference name="sireum-kiasan-call-chain-bound"
   				page="Sireum/Kiasan"
   				label="Call chain bound"
   				type="integer" 
   				default = "10"
   				/>
   	<preference name="sireum-kiasan-timeout"
   				page="Sireum/Kiasan"
   				label="Timeout (minutes)"
   				type="integer" 
   				default = "10"
   				/>
   	<preference name="sireum-kiasan-constrain-scalar-values"
   				page="Sireum/Kiasan"
   				label="Constrain Scalar Values"
   				type="boolean" 
   				default = "True"
   				/>
   	<preference name="sireum-kiasan-save-dirty-editors-before-running-kiasan"
   				page="Sireum/Kiasan"
   				label="Save dirty editors before running Kiasan"
   				type="boolean" 
   				default = "False"
   				/>
   	<preference name="sireum-kiasan-always-run-spark-examiner-before-running-kiasan"
   				page="Sireum/Kiasan"
   				label="Always run Spark Examiner before running Kiasan"
   				type="boolean" 
   				default = "True"
   				/>
   	<preference name="sireum-kiasan-delete-previous-kiasan-reports-before-re-running"
   				page="Sireum/Kiasan"
   				label="Delete previous Kiasan reports before re-running"
   				type="boolean" 
   				default = "True"
   				/>
   	<preference name="sireum-kiasan-warn-if-configuration-not-provided"
   				page="Sireum/Kiasan"
   				label="Warn in configuration not provided"
   				type="boolean" 
   				default = "True"
   				/>
   	<preference name="sireum-kiasan-generate-claim-report"
   				page="Sireum/Kiasan"
   				label="Generate Claim Report"
   				type="boolean" 
   				default = "False"
   				/>
   	<preference name="sireum-kiasan-generate-html-report"
   				page="Sireum/Kiasan"
   				label="Generate HTML report"
   				type="boolean" 
   				default = "False"
   				/>
   	<preference name="sireum-kiasan-html-output-directory"
   				page="Sireum/Kiasan"
   				label="HTML Output Directory"
   				type="string" 
   				default = "~/Documents/Kiasan"
   				/>
   	<preference name="sireum-kiasan-location-of-dot-executable"
   				page="Sireum/Kiasan"
   				label="Location of Dot Executable"
   				type="string" 
   				default = ""
   				/>
   	<preference name="sireum-kiasan-theorem-prover"
   				page="Sireum/Kiasan"
   				label="Theorem prover"
   				type="choices" 
   				default = "1">
   				<choice>Yices</choice>
   				<choice>Z3</choice> <!--  The default choice -->
	</preference>
   	<preference name="sireum-kiasan-theorem-prover-bin-directory"
   				page="Sireum/Kiasan"
   				label="Theorem Prover Bin Directory"
   				type="string" 
   				default = ""
   				/>
   	<preference name="sireum-kiasan-generate-aunit"
   				page="Sireum/Kiasan"
   				label="Generate AUnit (Experimental)"
   				type="boolean" 
   				default = "False"
   				/>
   	<preference name="sireum-kiasan-generate-json-output"
   				page="Sireum/Kiasan"
   				label="Generate JSON Output (Experimental)"
   				type="boolean" 
   				default = "True"
   				/>
""")
