package com.einstein.lib.example.intent

import com.einstein.lib.Constants
import com.einstein.lib.service.{IntentServiceImpl, Probabilities}

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object PredictIntentCustomModel {
  def main(args: Array[String]) = {
    val document = "password reset"
    val modelId = "SGTYNJ77AFN6NZNCSH3WITRG34"
    val accessToken = Constants.ACCESS_TOKEN
    val intentService = new IntentServiceImpl
    val list = intentService.getIntent(modelId, accessToken, document)
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
