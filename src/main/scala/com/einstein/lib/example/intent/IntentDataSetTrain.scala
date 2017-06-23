package com.einstein.lib.example.intent

import com.einstein.lib.Constants
import com.einstein.lib.service.DataSetServiceImpl

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object IntentDataSetTrain {
  def main(args: Array[String]) = {
    val accessToken = Constants.ACCESS_TOKEN

    val datasetId = "1004533"
    val modelName = "CallRoutingv1"
    val dataSetService = new DataSetServiceImpl
    val response = dataSetService.trainIntentDataSet(accessToken, datasetId, modelName)
    println(response)

  }
}
