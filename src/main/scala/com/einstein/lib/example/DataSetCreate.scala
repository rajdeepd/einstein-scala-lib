package com.einstein.lib.example

import java.util

import com.einstein.lib.Constants
import com.einstein.lib.dataset.{CreateDataSetResponse, DataSet}
import com.einstein.lib.model.MetricsData
import com.einstein.lib.service.DataSetServiceImpl

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object DataSetCreate {
  def main(args: Array[String]) = {
    val accessToken = Constants.ACCESS_TOKEN
    val path = "http://metamind.io/images/mountainvsbeach.zip"
    val dataSetService = new DataSetServiceImpl
    val response = dataSetService.createDataSet(accessToken, path)
    println("id: " + response.getId)
    println("name: " + response.getName)
    println("created at: " + response.getCreatedAt)
  }
}
