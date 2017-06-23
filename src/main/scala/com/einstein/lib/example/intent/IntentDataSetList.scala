package com.einstein.lib.example.intent

import com.einstein.lib.Constants
import com.einstein.lib.dataset.DataSet
import com.einstein.lib.service.DataSetServiceImpl

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object IntentDataSetList {
  def main(args: Array[String]) = {
    val accessToken = Constants.ACCESS_TOKEN
    val dataSetService = new DataSetServiceImpl
    val list = dataSetService.getIntentDataSetList(accessToken)
    val itr = list.iterator()
    while(itr.hasNext){
      val dataset =  itr.next().asInstanceOf[DataSet]
      val name =  dataset.getName
      println("name :           " + name)
      println("id :             " + dataset.getId)
      println("createdAt :      " + dataset.getCreatedAt)
      println("status message : " + dataset.getStatusMsg)
      println(dataset.getModels)
    }
  }

}
