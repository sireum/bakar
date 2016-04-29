package org.sireum.test.bakar.jago

import java.io.Writer
import org.junit.runner.RunWith
import org.sireum.bakar.jago.program.BakarProgramTranslatorModule
import org.sireum.bakar.xml.module.Gnat2XMLWrapperModule
import org.sireum.bakar.xml.module.ParseGnat2XMLModule
import org.sireum.example.bakar.BakarExamplesAnchor
import org.sireum.option.ProgramTarget
import org.sireum.pipeline.PipelineConfiguration
import org.sireum.pipeline.PipelineJob
import org.sireum.pipeline.PipelineStage
import org.sireum.test.bakar.framework.BakarSmfProjectProvider
import org.sireum.test.bakar.framework.BakarTestFileFramework
import org.sireum.test.bakar.framework.ProjectFile
import org.sireum.test.bakar.framework.Projects
import org.sireum.util._
import org.scalatest.junit.JUnitRunner
import scala.util.matching.Regex
import org.sireum.util.Exec.StringResult
import java.io.File

@RunWith(classOf[JUnitRunner])
class CoqAstTranslatorTest extends BakarTestFileFramework[ProjectFile] {
  import org.sireum.bakar.xml.module.Gnat2XMLWrapperModuleDef._
  
  def set() : Option[FileResourceUri] = {
    val sireumHome = System.getenv("SIREUM_HOME")
    if (sireumHome != null) {
      // under sireum/apps/, build a symbolic link to the installed gnat by following steps:
      // cd sireum/apps/
      // ln -s /Users/zhi/gnatpro/gnat-gpl-2015-darwin ./gnat
      var gnatPath = "/apps/gnat/bin/gnat2xml" + ext
      val f = new File(sireumHome, gnatPath)
      if (f.canExecute()) 
        return Some(new File(sireumHome, "/apps/gnat/bin/").getAbsolutePath)
    }
    None
  }
  
  // ignore all tests if not using wavefront version
  override def ignores = {
    if(set.isDefined) super.includes
    else msetEmpty + ".*"
  }
  
  // register(Projects.getProjects(BakarSmfProjectProvider, BakarExamplesAnchor.GNAT_2012_DIR + "/jago_test", true))
  register(Projects.getProjects(BakarSmfProjectProvider, BakarExamplesAnchor.GNAT_2012_DIR + "/jago", true))

  override def pre(c : Configuration) : Boolean = {
    import BakarProgramTranslatorModule.ProducerView._
    c.job.jagoProgramTarget = ProgramTarget.Coq

    Gnat2XMLWrapperModule.setSrcFiles(c.job.properties, c.project.files)
    Gnat2XMLWrapperModule.setDestDir(c.job.properties, Some(FileUtil.toUri(c.resultsDir)))
    
    Gnat2XMLWrapperModule.setGnatBin(c.job.properties, set)

    return true;
  }

  override def pipeline =
    PipelineConfiguration(
      "gnat2xml test pipeline",
      false,
      PipelineStage(
        "gnat2xml stage",
        false,
        Gnat2XMLWrapperModule),
      PipelineStage(
        "scalaxb stage",
        false,
        ParseGnat2XMLModule),
      PipelineStage(
        "translator stage",
        false,
        BakarProgramTranslatorModule))

  override def generateExpected = false 
  override def outputSuffix = "v"

  override def writeTestString(job : PipelineJob, w : Writer) = {
    import BakarProgramTranslatorModule.ConsumerView._
    val results = job.jagoProgramResults
    results.foreach { f =>
      w.write(f)
      w.write("\n")
      w.write("\n")
      //println(f)
    }
  }
}