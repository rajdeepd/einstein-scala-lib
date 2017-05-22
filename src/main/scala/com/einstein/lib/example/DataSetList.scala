package com.einstein.lib.example

import com.einstein.lib.Constants
import com.einstein.lib.dataset.DataSet
import com.einstein.lib.service.{DataSetServiceImpl, DataSetService}

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object DataSetList {
  def main(args: Array[String]) = {
    val accessToken = Constants.ACCESS_TOKEN
    val dataSetService = new DataSetServiceImpl
    val list = dataSetService.getDataSetsList(accessToken)
    val itr = list.iterator()
    while(itr.hasNext){
      val dataset =  itr.next().asInstanceOf[DataSet]
      val name =  dataset.getName
      println(name)
      println(dataset.getId)
      println(dataset.getCreatedAt)
    }
  }

}
