package com.einstein.lib.example

import com.einstein.lib.Constants
import com.einstein.lib.dataset.DataSet
import com.einstein.lib.service.DataSetService

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object DataSetCreate {
  def main(args: Array[String]) = {
    val accessToken = Constants.ACCESS_TOKEN
    val path = "http://metamind.io/images/mountainvsbeach.zip"
    val response = DataSetService.createDataSet(accessToken, path)
    println("id: " + response.getId)
    println("name: " + response.getName)
    println("created at: " + response.getCreatedAt)
  }
}
