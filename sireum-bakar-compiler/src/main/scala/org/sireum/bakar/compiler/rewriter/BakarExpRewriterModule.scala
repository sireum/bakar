// Do not edit this file. It is auto-generated from org.sireum.bakar.compiler.rewriter.BakarExpRewriter
// by org.sireum.pipeline.gen.ModuleGenerator

package org.sireum.bakar.compiler.rewriter

import org.sireum.util._
import org.sireum.pipeline._
import java.lang.String
import org.sireum.bakar.symbol.TypeDecl
import org.sireum.pilar.ast.Model
import scala.collection.immutable.Map
import scala.collection.immutable.Seq

object BakarExpRewriterModule extends PipelineModule {
  def title = "Bakar Exp Rewriter"
  def origin = classOf[BakarExpRewriter]

  val globalBakarTypeUri2TypeMapKey = "Global.bakarTypeUri2TypeMap"
  val globalModelsKey = "Global.models"

  def compute(job : PipelineJob, info : PipelineJobModuleInfo) : MBuffer[Tag] = {
    val tags = marrayEmpty[Tag]
    try {
      val module = Class.forName("org.sireum.bakar.compiler.rewriter.BakarExpRewriterModuleDef")
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
    var _bakarTypeUri2TypeMap : scala.Option[AnyRef] = None
    var _bakarTypeUri2TypeMapKey : scala.Option[String] = None

    val keylistbakarTypeUri2TypeMap = List(BakarExpRewriterModule.globalBakarTypeUri2TypeMapKey)
    keylistbakarTypeUri2TypeMap.foreach(key => 
      if(job ? key) { 
        if(_bakarTypeUri2TypeMap.isEmpty) {
          _bakarTypeUri2TypeMap = Some(job(key))
          _bakarTypeUri2TypeMapKey = Some(key)
        }
        if(!(job(key).asInstanceOf[AnyRef] eq _bakarTypeUri2TypeMap.get)) {
          tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
            "Input error for '" + this.title + "': 'bakarTypeUri2TypeMap' keys '" + _bakarTypeUri2TypeMapKey.get + " and '" + key + "' point to different objects.")
        }
      }
    )

    _bakarTypeUri2TypeMap match{
      case Some(x) =>
        if(!x.isInstanceOf[scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl]]){
          tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
            "Input error for '" + this.title + "': Wrong type found for 'bakarTypeUri2TypeMap'.  Expecting 'scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl]' but found '" + x.getClass.toString + "'")
        }
      case None =>
        tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
          "Input error for '" + this.title + "': No value found for 'bakarTypeUri2TypeMap'")       
    }
    var _models : scala.Option[AnyRef] = None
    var _modelsKey : scala.Option[String] = None

    val keylistmodels = List(BakarExpRewriterModule.globalModelsKey)
    keylistmodels.foreach(key => 
      if(job ? key) { 
        if(_models.isEmpty) {
          _models = Some(job(key))
          _modelsKey = Some(key)
        }
        if(!(job(key).asInstanceOf[AnyRef] eq _models.get)) {
          tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
            "Input error for '" + this.title + "': 'models' keys '" + _modelsKey.get + " and '" + key + "' point to different objects.")
        }
      }
    )

    _models match{
      case Some(x) =>
        if(!x.isInstanceOf[scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]]){
          tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
            "Input error for '" + this.title + "': Wrong type found for 'models'.  Expecting 'scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]' but found '" + x.getClass.toString + "'")
        }
      case None =>
        tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
          "Input error for '" + this.title + "': No value found for 'models'")       
    }
    return tags
  }

  def outputDefined (job : PipelineJob) : MBuffer[Tag] = {
    val tags = marrayEmpty[Tag]
    if(!(job ? BakarExpRewriterModule.globalModelsKey)) {
      tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
        "Output error for '" + this.title + "': No entry found for 'models'. Expecting (BakarExpRewriterModule.globalModelsKey)") 
    }

    if(job ? BakarExpRewriterModule.globalModelsKey && !job(BakarExpRewriterModule.globalModelsKey).isInstanceOf[scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]]) {
      tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker, 
        "Output error for '" + this.title + "': Wrong type found for BakarExpRewriterModule.globalModelsKey.  Expecting 'scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]' but found '" + 
        job(BakarExpRewriterModule.globalModelsKey).getClass.toString + "'")
    } 
    return tags
  }

  def getBakarTypeUri2TypeMap (options : scala.collection.Map[Property.Key, Any]) : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl] = {
    if (options.contains(BakarExpRewriterModule.globalBakarTypeUri2TypeMapKey)) {
       return options(BakarExpRewriterModule.globalBakarTypeUri2TypeMapKey).asInstanceOf[scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl]]
    }

    throw new Exception("Pipeline checker should guarantee we never reach here")
  }

  def setBakarTypeUri2TypeMap (options : MMap[Property.Key, Any], bakarTypeUri2TypeMap : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl]) : MMap[Property.Key, Any] = {

    options(BakarExpRewriterModule.globalBakarTypeUri2TypeMapKey) = bakarTypeUri2TypeMap

    return options
  }

  def getModels (options : scala.collection.Map[Property.Key, Any]) : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model] = {
    if (options.contains(BakarExpRewriterModule.globalModelsKey)) {
       return options(BakarExpRewriterModule.globalModelsKey).asInstanceOf[scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]]
    }

    throw new Exception("Pipeline checker should guarantee we never reach here")
  }

  def setModels (options : MMap[Property.Key, Any], models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]) : MMap[Property.Key, Any] = {

    options(BakarExpRewriterModule.globalModelsKey) = models

    return options
  }

  object ConsumerView {
    implicit class BakarExpRewriterModuleConsumerView (val job : PropertyProvider) extends AnyVal {
      def bakarTypeUri2TypeMap : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl] = BakarExpRewriterModule.getBakarTypeUri2TypeMap(job.propertyMap)
      def models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model] = BakarExpRewriterModule.getModels(job.propertyMap)
    }
  }

  object ProducerView {
    implicit class BakarExpRewriterModuleProducerView (val job : PropertyProvider) extends AnyVal {

      def bakarTypeUri2TypeMap_=(bakarTypeUri2TypeMap : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl]) { BakarExpRewriterModule.setBakarTypeUri2TypeMap(job.propertyMap, bakarTypeUri2TypeMap) }
      def bakarTypeUri2TypeMap : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl] = BakarExpRewriterModule.getBakarTypeUri2TypeMap(job.propertyMap)

      def models_=(models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]) { BakarExpRewriterModule.setModels(job.propertyMap, models) }
      def models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model] = BakarExpRewriterModule.getModels(job.propertyMap)
    }
  }
}

trait BakarExpRewriterModule {
  def job : PipelineJob

  def bakarTypeUri2TypeMap : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl] = BakarExpRewriterModule.getBakarTypeUri2TypeMap(job.propertyMap)


  def models_=(models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]) { BakarExpRewriterModule.setModels(job.propertyMap, models) }
  def models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model] = BakarExpRewriterModule.getModels(job.propertyMap)
}