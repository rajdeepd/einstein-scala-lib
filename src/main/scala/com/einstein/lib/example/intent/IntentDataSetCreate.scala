package com.einstein.lib.example.intent

import com.einstein.lib.Constants
import com.einstein.lib.service.DataSetServiceImpl

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object IntentDataSetCreate {
  def main(args: Array[String]) = {
    val accessToken = Constants.ACCESS_TOKEN
    val path = "./data/CallRouting.csv"
    val dataSetService = new DataSetServiceImpl
    val response = dataSetService.createIntentDataSet(accessToken, path)
    println("id: " + response.getId)
    println("name: " + response.getName)
    println("created at: " + response.getCreatedAt)
  }
}
