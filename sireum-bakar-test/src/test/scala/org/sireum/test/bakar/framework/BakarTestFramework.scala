package org.sireum.test.bakar.framework

import org.sireum.util._
import org.sireum.pipeline._
import org.sireum.test.framework.TestFramework
import java.io.Writer
import java.io.StringWriter
import java.io.FileWriter
import java.io.File
import java.net.URI
import org.sireum.example.bakar.BakarExamples
import scala.util.matching.Regex
import org.sireum.example.bakar.Project

trait BakarTestFramework extends TestFramework {

  def BakarTest : this.type = this

  val base = FileUtil.fileUri(this.getClass, "").replace("/bin/", "/src/test/resources/")
  def EXPECTED_DIR = base + "/expected/"
  def RESULTS_DIR = base + "/results/"

  implicit def str2re(s : String) = s.r

  def disableIncludes = false
  def disableExcludes = false
  val includes = msetEmpty[Regex]
  val excludes = msetEmpty[Regex]

  def accept(name : String, files : ISeq[FileResourceUri]) : Boolean = {

    return (disableIncludes || includes.isEmpty ||
      includes.exists(r => r.findFirstMatchIn(name).isDefined)) &&
      (disableExcludes || excludes.isEmpty ||
        !excludes.exists(r => r.findFirstMatchIn(name).isDefined)
      )
  }

  def register(projects : ISeq[Project]) {
    projects.foreach(p =>
      if (accept(p.testName, p.files))
        execute(p.testName, p.files)
      else
        reject(p.testName, p.files)
    )
  }

  def register(map : MMap[String, ISeq[FileResourceUri]]) {
    val sorted = isortedMapEmpty[String, ISeq[FileResourceUri]] ++ map
    sorted.foreach(f =>
      if (accept(f._1, f._2))
        execute(f._1, f._2)
      else
        reject(f._1, f._2)
    )
  }

  def execute(testName : String, files : ISeq[FileResourceUri])

  def reject(testName : String, files : ISeq[FileResourceUri]) = {
    ignore(testName) {}
  }
}

trait BakarTestFileFramework extends BakarTestFramework {
  // abstract methods
  def generateExpected : Boolean
  def outputSuffix : String
  def writeTestString(job : PipelineJob, w : Writer)
  def pipeline : PipelineConfiguration

  def pre(c : Configuration) : Boolean = true
  def post(c : Configuration) : Boolean = true

  case class Configuration(
    testName : String,
    sources : ISeq[FileResourceUri],
    expectedDir : File,
    resultsDir : File,
    job : PipelineJob)

  override def execute(testName : String, files : ISeq[FileResourceUri]) = {
    test(testName) {
      val testNamelc = testName.toLowerCase

      val edir = new File(new URI(EXPECTED_DIR))
      val efile = new File(edir, testNamelc + "." + outputSuffix)
      if (!edir.exists && !edir.mkdirs)
        throw new RuntimeException("Could not create " + edir)

      val rdir = new File(new URI(RESULTS_DIR))
      val rfile = new File(rdir, testNamelc + "." + outputSuffix)
      if (!rdir.exists) {
        if (!rdir.mkdirs)
          throw new RuntimeException("Could not create " + rdir)
        createGitIgnore(rdir)
      }

      val c = Configuration(testName, files, edir, rdir, PipelineJob())
      assert(pre(c))

      pipeline.compute(c.job)

      val tags = if (!c.job.tags.isEmpty) c.job.tags else c.job.lastStageInfo.tags

      if (!tags.isEmpty) {
        println(tags)
        assert(false)
      } else {
        try {
          val sw = new StringWriter
          writeTestString(c.job, sw)
          val results = sw.toString

          if (generateExpected) {
            val fw = new FileWriter(efile)
            fw.write(results)
            fw.close
            println("wrote: " + efile.getAbsolutePath)
          } else {
            val fw = new FileWriter(rfile)
            fw.write(results)
            fw.close
            if (efile.exists) {
              val (expected, _) = FileUtil.readFile(efile.toURI.toString)
              results should equal(expected)

              assert(post(c))
            } else {
              fail("Couldn't locate expected results")
            }
          }
        } catch {
          case e : Throwable =>
            e.printStackTrace
            assert(false)
        }
      }
    }

      def createGitIgnore(dir : File) {
        try {
          val fw = new FileWriter(new File(dir, ".gitignore"))
          fw.write("*\n\n!.gitignore")
          fw.close
        } catch {
          case e : Throwable => e.printStackTrace
        }
      }
  }
}
