package com.einstein.lib.example

import com.einstein.lib.Constants
import com.einstein.lib.dataset.DataSet
import com.einstein.lib.model.Model
import com.einstein.lib.service.DataSetService

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object DataSetAndModelList {
  def main(args: Array[String]) = {
    val accessToken = Constants.ACCESS_TOKEN
    val list = DataSetService.getDataSetAndModelList(accessToken)
    val itr = list.iterator()
    while(itr.hasNext){
      val dataset =  itr.next().asInstanceOf[DataSet]
      val id = dataset.getId
      val name =  dataset.getName

      println("--------------------------------------------")
      println("Dataset id:" + id)
      println("Dataset name: " + name)
      println("Total examples:" + dataset.getTotalExamples)
      val itrModel = dataset.getModels.iterator()
      while(itrModel.hasNext){
        val model = itrModel.next().asInstanceOf[Model]
        println(" ModelId: " + model.getModelId)
        println(" ModelType: " + model.getModelType)
        println(" ModelName: " + model.getName)
      }
    }
  }

}
