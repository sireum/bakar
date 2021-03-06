// Do not edit this file. It is auto-generated from org.sireum.bakar.typ.BakarTypeResolver
// by org.sireum.pipeline.gen.ModuleGenerator

package org.sireum.bakar.typ

import org.sireum.util._
import org.sireum.pipeline._
import java.lang.String
import org.sireum.bakar.symbol.TypeDecl
import org.sireum.pilar.ast.Model
import scala.collection.immutable.Map
import scala.collection.immutable.Seq

object BakarTypeResolverModule extends PipelineModule {
  def title = "Bakar Type Resolver"
  def origin = classOf[BakarTypeResolver]

  val globalBakarTypeUri2TypeMapKey = "Global.bakarTypeUri2TypeMap"
  val globalModelsKey = "Global.models"
  val globalBakarRef2TypeUriMapKey = "Global.bakarRef2TypeUriMap"

  def compute(job : PipelineJob, info : PipelineJobModuleInfo) : MBuffer[Tag] = {
    val tags = marrayEmpty[Tag]
    try {
      val module = Class.forName("org.sireum.bakar.typ.BakarTypeResolverModuleDef")
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
    var _models : scala.Option[AnyRef] = None
    var _modelsKey : scala.Option[String] = None

    val keylistmodels = List(BakarTypeResolverModule.globalModelsKey)
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
    if(!(job ? BakarTypeResolverModule.globalBakarRef2TypeUriMapKey)) {
      tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
        "Output error for '" + this.title + "': No entry found for 'bakarRef2TypeUriMap'. Expecting (BakarTypeResolverModule.globalBakarRef2TypeUriMapKey)") 
    }

    if(job ? BakarTypeResolverModule.globalBakarRef2TypeUriMapKey && !job(BakarTypeResolverModule.globalBakarRef2TypeUriMapKey).isInstanceOf[scala.collection.immutable.Map[java.lang.String, java.lang.String]]) {
      tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker, 
        "Output error for '" + this.title + "': Wrong type found for BakarTypeResolverModule.globalBakarRef2TypeUriMapKey.  Expecting 'scala.collection.immutable.Map[java.lang.String, java.lang.String]' but found '" + 
        job(BakarTypeResolverModule.globalBakarRef2TypeUriMapKey).getClass.toString + "'")
    } 

    if(!(job ? BakarTypeResolverModule.globalModelsKey)) {
      tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
        "Output error for '" + this.title + "': No entry found for 'models'. Expecting (BakarTypeResolverModule.globalModelsKey)") 
    }

    if(job ? BakarTypeResolverModule.globalModelsKey && !job(BakarTypeResolverModule.globalModelsKey).isInstanceOf[scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]]) {
      tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker, 
        "Output error for '" + this.title + "': Wrong type found for BakarTypeResolverModule.globalModelsKey.  Expecting 'scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]' but found '" + 
        job(BakarTypeResolverModule.globalModelsKey).getClass.toString + "'")
    } 

    if(!(job ? BakarTypeResolverModule.globalBakarTypeUri2TypeMapKey)) {
      tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker,
        "Output error for '" + this.title + "': No entry found for 'bakarTypeUri2TypeMap'. Expecting (BakarTypeResolverModule.globalBakarTypeUri2TypeMapKey)") 
    }

    if(job ? BakarTypeResolverModule.globalBakarTypeUri2TypeMapKey && !job(BakarTypeResolverModule.globalBakarTypeUri2TypeMapKey).isInstanceOf[scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl]]) {
      tags += PipelineUtil.genTag(PipelineUtil.ErrorMarker, 
        "Output error for '" + this.title + "': Wrong type found for BakarTypeResolverModule.globalBakarTypeUri2TypeMapKey.  Expecting 'scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl]' but found '" + 
        job(BakarTypeResolverModule.globalBakarTypeUri2TypeMapKey).getClass.toString + "'")
    } 
    return tags
  }

  def getBakarRef2TypeUriMap (options : scala.collection.Map[Property.Key, Any]) : scala.collection.immutable.Map[java.lang.String, java.lang.String] = {
    if (options.contains(BakarTypeResolverModule.globalBakarRef2TypeUriMapKey)) {
       return options(BakarTypeResolverModule.globalBakarRef2TypeUriMapKey).asInstanceOf[scala.collection.immutable.Map[java.lang.String, java.lang.String]]
    }

    throw new Exception("Pipeline checker should guarantee we never reach here")
  }

  def setBakarRef2TypeUriMap (options : MMap[Property.Key, Any], bakarRef2TypeUriMap : scala.collection.immutable.Map[java.lang.String, java.lang.String]) : MMap[Property.Key, Any] = {

    options(BakarTypeResolverModule.globalBakarRef2TypeUriMapKey) = bakarRef2TypeUriMap

    return options
  }

  def getModels (options : scala.collection.Map[Property.Key, Any]) : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model] = {
    if (options.contains(BakarTypeResolverModule.globalModelsKey)) {
       return options(BakarTypeResolverModule.globalModelsKey).asInstanceOf[scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]]
    }

    throw new Exception("Pipeline checker should guarantee we never reach here")
  }

  def setModels (options : MMap[Property.Key, Any], models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]) : MMap[Property.Key, Any] = {

    options(BakarTypeResolverModule.globalModelsKey) = models

    return options
  }

  def getBakarTypeUri2TypeMap (options : scala.collection.Map[Property.Key, Any]) : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl] = {
    if (options.contains(BakarTypeResolverModule.globalBakarTypeUri2TypeMapKey)) {
       return options(BakarTypeResolverModule.globalBakarTypeUri2TypeMapKey).asInstanceOf[scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl]]
    }

    throw new Exception("Pipeline checker should guarantee we never reach here")
  }

  def setBakarTypeUri2TypeMap (options : MMap[Property.Key, Any], bakarTypeUri2TypeMap : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl]) : MMap[Property.Key, Any] = {

    options(BakarTypeResolverModule.globalBakarTypeUri2TypeMapKey) = bakarTypeUri2TypeMap

    return options
  }

  object ConsumerView {
    implicit class BakarTypeResolverModuleConsumerView (val job : PropertyProvider) extends AnyVal {
      def bakarRef2TypeUriMap : scala.collection.immutable.Map[java.lang.String, java.lang.String] = BakarTypeResolverModule.getBakarRef2TypeUriMap(job.propertyMap)
      def models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model] = BakarTypeResolverModule.getModels(job.propertyMap)
      def bakarTypeUri2TypeMap : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl] = BakarTypeResolverModule.getBakarTypeUri2TypeMap(job.propertyMap)
    }
  }

  object ProducerView {
    implicit class BakarTypeResolverModuleProducerView (val job : PropertyProvider) extends AnyVal {

      def bakarRef2TypeUriMap_=(bakarRef2TypeUriMap : scala.collection.immutable.Map[java.lang.String, java.lang.String]) { BakarTypeResolverModule.setBakarRef2TypeUriMap(job.propertyMap, bakarRef2TypeUriMap) }
      def bakarRef2TypeUriMap : scala.collection.immutable.Map[java.lang.String, java.lang.String] = BakarTypeResolverModule.getBakarRef2TypeUriMap(job.propertyMap)

      def models_=(models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]) { BakarTypeResolverModule.setModels(job.propertyMap, models) }
      def models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model] = BakarTypeResolverModule.getModels(job.propertyMap)

      def bakarTypeUri2TypeMap_=(bakarTypeUri2TypeMap : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl]) { BakarTypeResolverModule.setBakarTypeUri2TypeMap(job.propertyMap, bakarTypeUri2TypeMap) }
      def bakarTypeUri2TypeMap : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl] = BakarTypeResolverModule.getBakarTypeUri2TypeMap(job.propertyMap)
    }
  }
}

trait BakarTypeResolverModule {
  def job : PipelineJob


  def bakarRef2TypeUriMap_=(bakarRef2TypeUriMap : scala.collection.immutable.Map[java.lang.String, java.lang.String]) { BakarTypeResolverModule.setBakarRef2TypeUriMap(job.propertyMap, bakarRef2TypeUriMap) }
  def bakarRef2TypeUriMap : scala.collection.immutable.Map[java.lang.String, java.lang.String] = BakarTypeResolverModule.getBakarRef2TypeUriMap(job.propertyMap)


  def models_=(models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model]) { BakarTypeResolverModule.setModels(job.propertyMap, models) }
  def models : scala.collection.immutable.Seq[org.sireum.pilar.ast.Model] = BakarTypeResolverModule.getModels(job.propertyMap)


  def bakarTypeUri2TypeMap_=(bakarTypeUri2TypeMap : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl]) { BakarTypeResolverModule.setBakarTypeUri2TypeMap(job.propertyMap, bakarTypeUri2TypeMap) }
  def bakarTypeUri2TypeMap : scala.collection.immutable.Map[java.lang.String, org.sireum.bakar.symbol.TypeDecl] = BakarTypeResolverModule.getBakarTypeUri2TypeMap(job.propertyMap)
}