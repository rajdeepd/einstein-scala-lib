package com.einstein.lib.example

import com.einstein.lib.service.{VisionServiceImpl, VisionService, Probabilities}
import com.einstein.lib.Constants

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object PredictRemoteImage {
  def main(args: Array[String]) = {
    val url = "http://metamind.io/images/foodimage.jpg"
    val modelId = "FoodImageClassifier"
    val accessToken = Constants.ACCESS_TOKEN
    val visionService = new VisionServiceImpl()
    val list = visionService.predictImage(url,modelId, accessToken)
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
