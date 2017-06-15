package com.einstein.lib.example

import com.einstein.lib.service.{VisionServiceImpl, VisionService, Probabilities}
import com.einstein.lib.Constants

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object PredictRemoteImage {
  def main(args: Array[String]) = {
    val url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Pepperoni_pizza.jpg/440px-Pepperoni_pizza.jpg"
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
