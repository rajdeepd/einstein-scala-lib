package com.einstein.lib.example

import java.util

import com.einstein.lib.service.{VisionService, Probabilities}
import com.einstein.lib.Constants
import com.einstein.lib.service.VisionServiceImpl

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object PredictLocalImage {
  def main(args: Array[String]) = {
    val localFilePath = "/home/ubuntu/Downloads/samosa.jpeg"
    val modelId = "FoodImageClassifier"
    val accessToken = Constants.ACCESS_TOKEN
    val visionService = new VisionServiceImpl()
    val list = visionService.predictLocalImage(localFilePath, modelId, accessToken)
    val itr = list.iterator()
    println( "Label : Probability")
    while(itr.hasNext){
      val probabilities =  itr.next().asInstanceOf[Probabilities]
      val label = probabilities.getLabel
      val probability = probabilities.getProbability
      println(label + " : " + probability)
    }
  }

}
