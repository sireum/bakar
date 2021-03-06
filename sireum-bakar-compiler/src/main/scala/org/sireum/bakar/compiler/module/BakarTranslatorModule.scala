// Do not edit this file. It is auto-generated from org.sireum.bakar.compiler.module.BakarTranslator
// by org.sireum.pipeline.gen.ModuleGenerator

package org.sireum.bakar.compiler.module

import org.sireum.util._
import org.sireum.pipeline._
import java.lang.Integer
import java.lang.String
import org.sireum.bakar.xml.CompilationUnit
import org.sireum.pilar.ast.Model
import scala.collection.immutable.Map
import scala.collection.immutable.Seq

object BakarTranslatorModule extends PipelineModule {
  def title = "Bakar Vistor"
  def origin = classOf[BakarTranslator]

  val globalRegressionKey = "Global.regression"
  val globalIntBitsKey = "Global.intBits"
  val globalParseGnat2XMLresultsKey = "Global.parseGnat2XMLresults"
  val globalModelsKey = "Global.models"

  def compute(job : PipelineJob, info : PipelineJobModuleInfo) : MBuffer[Tag] = {
    val tags = marrayEmpty[Tag]
    try {
      val module = Class.forName("org.sireum.bakar.compiler.module.BakarTranslatorModuleDef")
      val cons = module.getConstructors()(0)
      val params = Array[AnyRef](job, info)
      val inst = cons.newInstance(params : _*)
    } catch {
      case e : Throwable =>
        e.printStackTrace
        tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker, e.getMessage);
    }
    return tags
  }

  override def initialize(job : PipelineJob) {
    if(!(job ? BakarTranslatorModule.globalIntBitsKey)) {
      val intBits = Class.forName("org.sireum.bakar.compiler.module.BakarTranslator").getDeclaredMethod("$lessinit$greater$default$3").invoke(null).asInstanceOf[java.lang.Integer]
      setIntBits(job.propertyMap, intBits)
    }

    if(!(job ? BakarTranslatorModule.globalRegressionKey)) {
      val regression = Class.forName("org.sireum.bakar.compiler.module.BakarTranslator").getDeclaredMethod("$lessinit$greater$default$4").invoke(null).asInstanceOf[scala.Boolean]
      setRegression(job.propertyMap, regression)
    }
  }

  override def validPipeline(stage : PipelineStage, job : PipelineJob) : MBuffer[Tag] = {
    val tags = marrayEmpty[Tag]
    val deps = ilist[PipelineModule]()
    deps.foreach(d =>
      if(stage.modules.contains(d)){
        tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
            "'" + this.title + "' depends on '" + d.title + "' yet both were found in stage '" + stage.title + "'"
        )
      }
    )
    return tags
  }

  def inputDefined (job : PipelineJob) : MBuffer[Tag] = {
    val tags = marrayEmpty[Tag]
    var _parseGnat2XMLresults : scala.Option[AnyRef] = None
    var _parseGnat2XMLresultsKey : scala.Option[String] = None

    val keylistparseGnat2XMLresults = List(BakarTranslatorModule.globalParseGnat2XMLresultsKey)
    keylistparseGnat2XMLresults.foreach(key => 
      if(job ? key) { 
        if(_parseGnat2XMLresults.isEmpty) {
          _parseGnat2XMLresults = Some(job(key))
          _parseGnat2XMLresultsKey = Some(key)
        }
        if(!(job(key).asInstanceOf[AnyRef] eq _parseGnat2XMLresults.get)) {
          tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
            "Input error for '" + this.title + "': 'parseGnat2XMLresults' keys '" + _parseGnat2XMLresultsKey.get + " and '" + key + "' point to different objects.")
        }
      }
    )

    _parseGnat2XMLresults match{
      case Some(x) =>
        if(!x.isInstanceOf[scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.xml.CompilationUnit]]){
          tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
            "Input error for '" + this.title + "': Wrong type found for 'parseGnat2XMLresults'.  Expecting 'scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.xml.CompilationUnit]' but found '" + x.getClass.toString + "'")
        }
      case None =>
        tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
          "Input error for '" + this.title + "': No value found for 'parseGnat2XMLresults'")       
    }
    var _intBits : scala.Option[AnyRef] = None
    var _intBitsKey : scala.Option[String] = None

    val keylistintBits = List(BakarTranslatorModule.globalIntBitsKey)
    keylistintBits.foreach(key => 
      if(job ? key) { 
        if(_intBits.isEmpty) {
          _intBits = Some(job(key))
          _intBitsKey = Some(key)
        }
        if(!(job(key).asInstanceOf[AnyRef] eq _intBits.get)) {
          tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
            "Input error for '" + this.title + "': 'intBits' keys '" + _intBitsKey.get + " and '" + key + "' point to different objects.")
        }
      }
    )

    _intBits match{
      case Some(x) =>
        if(!x.isInstanceOf[java.lang.Integer]){
          tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
            "Input error for '" + this.title + "': Wrong type found for 'intBits'.  Expecting 'java.lang.Integer' but found '" + x.getClass.toString + "'")
        }
      case None =>
        tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
          "Input error for '" + this.title + "': No value found for 'intBits'")       
    }
    var _regression : scala.Option[AnyRef] = None
    var _regressionKey : scala.Option[String] = None

    val keylistregression = List(BakarTranslatorModule.globalRegressionKey)
    keylistregression.foreach(key => 
      if(job ? key) { 
        if(_regression.isEmpty) {
          _regression = Some(job(key))
          _regressionKey = Some(key)
        }
        if(!(job(key).asInstanceOf[AnyRef] eq _regression.get)) {
          tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
            "Input error for '" + this.title + "': 'regression' keys '" + _regressionKey.get + " and '" + key + "' point to different objects.")
        }
      }
    )

    _regression match{
      case Some(x) =>
        if(!x.isInstanceOf[scala.Boolean]){
          tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
            "Input error for '" + this.title + "': Wrong type found for 'regression'.  Expecting 'scala.Boolean' but found '" + x.getClass.toString + "'")
        }
      case None =>
        tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
          "Input error for '" + this.title + "': No value found for 'regression'")       
    }
    return tags
  }

  def outputDefined (job : PipelineJob) : MBuffer[Tag] = {
    val tags = marrayEmpty[Tag]
    if(!(job ? BakarTranslatorModule.globalModelsKey)) {
      tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
        "Output error for '" + this.title + "': No entry found for 'models'. Expecting (BakarTranslatorModule.globalModelsKey)") 
    }

    if(job ? BakarTranslatorModule.globalModelsKey && !job(BakarTranslatorModule.globalModelsKey).isInstanceOf[scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]]) {
      tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker, 
        "Output error for '" + this.title + "': Wrong type found for BakarTranslatorModule.globalModelsKey.  Expecting 'scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]' but found '" + 
        job(BakarTranslatorModule.globalModelsKey).getClass.toString + "'")
    } 
    return tags
  }

  def getParseGnat2XMLresults (options : scala.collection.Map[Property.Key, Any]) : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.xml.CompilationUnit] = {
    if (options.contains(BakarTranslatorModule.globalParseGnat2XMLresultsKey)) {
       return options(BakarTranslatorModule.globalParseGnat2XMLresultsKey).asInstanceOf[scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.xml.CompilationUnit]]
    }

    throw new Exception("Pipeline checker should guarantee we never reach here")
  }

  def setParseGnat2XMLresults (options : MMap[Property.Key, Any], parseGnat2XMLresults : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.xml.CompilationUnit]) : MMap[Property.Key, Any] = {

    options(BakarTranslatorModule.globalParseGnat2XMLresultsKey) = parseGnat2XMLresults

    return options
  }

  def getIntBits (options : scala.collection.Map[Property.Key, Any]) : java.lang.Integer = {
    if (options.contains(BakarTranslatorModule.globalIntBitsKey)) {
       return options(BakarTranslatorModule.globalIntBitsKey).asInstanceOf[java.lang.Integer]
    }

    throw new Exception("Pipeline checker should guarantee we never reach here")
  }

  def setIntBits (options : MMap[Property.Key, Any], intBits : java.lang.Integer) : MMap[Property.Key, Any] = {

    options(BakarTranslatorModule.globalIntBitsKey) = intBits

    return options
  }

  def getRegression (options : scala.collection.Map[Property.Key, Any]) : scala.Boolean = {
    if (options.contains(BakarTranslatorModule.globalRegressionKey)) {
       return options(BakarTranslatorModule.globalRegressionKey).asInstanceOf[scala.Boolean]
    }

    throw new Exception("Pipeline checker should guarantee we never reach here")
  }

  def setRegression (options : MMap[Property.Key, Any], regression : scala.Boolean) : MMap[Property.Key, Any] = {

    options(BakarTranslatorModule.globalRegressionKey) = regression

    return options
  }

  def getModels (options : scala.collection.Map[Property.Key, Any]) : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model] = {
    if (options.contains(BakarTranslatorModule.globalModelsKey)) {
       return options(BakarTranslatorModule.globalModelsKey).asInstanceOf[scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]]
    }

    throw new Exception("Pipeline checker should guarantee we never reach here")
  }

  def setModels (options : MMap[Property.Key, Any], models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]) : MMap[Property.Key, Any] = {

    options(BakarTranslatorModule.globalModelsKey) = models

    return options
  }

  object ConsumerView {
    implicit class BakarTranslatorModuleConsumerView (val job : PropertyProvider) extends AnyVal {
      def parseGnat2XMLresults : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.xml.CompilationUnit] = BakarTranslatorModule.getParseGnat2XMLresults(job.propertyMap)
      def intBits : java.lang.Integer = BakarTranslatorModule.getIntBits(job.propertyMap)
      def regression : scala.Boolean = BakarTranslatorModule.getRegression(job.propertyMap)
      def models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model] = BakarTranslatorModule.getModels(job.propertyMap)
    }
  }

  object ProducerView {
    implicit class BakarTranslatorModuleProducerView (val job : PropertyProvider) extends AnyVal {

      def parseGnat2XMLresults_=(parseGnat2XMLresults : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.xml.CompilationUnit]) { BakarTranslatorModule.setParseGnat2XMLresults(job.propertyMap, parseGnat2XMLresults) }
      def parseGnat2XMLresults : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.xml.CompilationUnit] = BakarTranslatorModule.getParseGnat2XMLresults(job.propertyMap)

      def intBits_=(intBits : java.lang.Integer) { BakarTranslatorModule.setIntBits(job.propertyMap, intBits) }
      def intBits : java.lang.Integer = BakarTranslatorModule.getIntBits(job.propertyMap)

      def regression_=(regression : scala.Boolean) { BakarTranslatorModule.setRegression(job.propertyMap, regression) }
      def regression : scala.Boolean = BakarTranslatorModule.getRegression(job.propertyMap)

      def models_=(models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]) { BakarTranslatorModule.setModels(job.propertyMap, models) }
      def models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model] = BakarTranslatorModule.getModels(job.propertyMap)
    }
  }
}

trait BakarTranslatorModule {
  def job : PipelineJob

  def parseGnat2XMLresults : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.xml.CompilationUnit] = BakarTranslatorModule.getParseGnat2XMLresults(job.propertyMap)

  def intBits : java.lang.Integer = BakarTranslatorModule.getIntBits(job.propertyMap)

  def regression : scala.Boolean = BakarTranslatorModule.getRegression(job.propertyMap)


  def models_=(models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]) { BakarTranslatorModule.setModels(job.propertyMap, models) }
  def models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model] = BakarTranslatorModule.getModels(job.propertyMap)
}