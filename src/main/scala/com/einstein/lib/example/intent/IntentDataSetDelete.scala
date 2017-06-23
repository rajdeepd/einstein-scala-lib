package com.einstein.lib.example.intent

import com.einstein.lib.Constants
import com.einstein.lib.service.DataSetServiceImpl

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object IntentDataSetDelete {
  def main(args: Array[String]) = {
    val accessToken = Constants.ACCESS_TOKEN
    val id = 1004471
    val dataSetService = new DataSetServiceImpl
    val response = dataSetService.deleteIntentDataSet(accessToken, id.toString)
    println(response)
  }
}
