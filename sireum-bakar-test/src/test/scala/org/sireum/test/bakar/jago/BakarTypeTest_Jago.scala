package org.sireum.test.bakar.jago

import java.io.Writer
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.sireum.bakar.jago.typ.BakarTypTranslatorModule
import org.sireum.example.bakar.Project
import org.sireum.option.TypeTarget
import org.sireum.pipeline.PipelineConfiguration
import org.sireum.pipeline.PipelineJob
import org.sireum.pipeline.PipelineStage
import org.sireum.test.bakar.framework.BakarTestFileFramework
import org.sireum.util.FileResourceUri
import org.sireum.util.ilistEmpty

@RunWith(classOf[JUnitRunner])
class BakarTypeTest_Jago extends BakarTestFileFramework[Project] {

  this.execute(new Project {
    val projectName = "typ"
    val testName = "typ"
    val files = ilistEmpty[FileResourceUri]
  })

  override def pre(c: Configuration): Boolean = {
    import BakarTypTranslatorModule.ProducerView._
    c.job.jagoTypeTarget = TypeTarget.Coq

    return true
  }

  override def pipeline =
    PipelineConfiguration(
      "bakar jago type translator test pipeline",
      false,
      PipelineStage(
        "translator stage",
        false,
        BakarTypTranslatorModule))

  override def generateExpected = false
  override def outputSuffix = "coq"

  override def writeTestString(job: PipelineJob, w: Writer) = {
    import BakarTypTranslatorModule.ConsumerView._
    val results = job.jagoTypeResults
    w.write(results)
    //println(results)
  }
}