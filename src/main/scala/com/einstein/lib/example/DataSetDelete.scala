package com.einstein.lib.example

import com.einstein.lib.Constants
import com.einstein.lib.service.DataSetService

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object DataSetDelete {
  def main(args: Array[String]) = {
    val accessToken = Constants.ACCESS_TOKEN
    val id = 1002890
    val response = DataSetService.deleteDataSet(accessToken, id.toString)
    println(response)
  }
}
