package com.einstein.lib.example

import com.einstein.lib.Constants
import com.einstein.lib.service.DataSetServiceImpl

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object DataSetTrain {
  def main(args: Array[String]) = {
    val accessToken = Constants.ACCESS_TOKEN
    //val path = "http://metamind.io/images/mountainvsbeach.zip"
    val datasetId = "1004151"
    val dataSetService = new DataSetServiceImpl
    val response = dataSetService.trainDataSet(accessToken, datasetId)
    println(response)

  }
}
