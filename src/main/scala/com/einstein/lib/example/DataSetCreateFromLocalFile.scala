package com.einstein.lib.example

import com.einstein.lib.Constants
import com.einstein.lib.service.DataSetServiceImpl

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object DataSetCreateFromLocalFile {
  def main(args: Array[String]) = {
    val accessToken = Constants.ACCESS_TOKEN
    val path = "/home/ubuntu/Downloads/mountainvsbeach.zip"
    val dataSetService = new DataSetServiceImpl
    val response = dataSetService.createDataSetFromLocalFile(accessToken, path)
    println("id: " + response.getId)
    println("name: " + response.getName)
    println("created at: " + response.getCreatedAt)
  }
}
