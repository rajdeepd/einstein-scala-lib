package com.einstein.lib.example

import java.util

import com.einstein.lib.service.{VisionService, Probabilities}
import com.einstein.lib.Constants
import com.einstein.lib.service.VisionServiceImpl
import com.typesafe.scalalogging.slf4j.{Logger}
import org.slf4j.LoggerFactory


/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object PredictLocalImage /*extends  LazyLogging */{
  //val logger = Logger(PredictLocalImage.getClass)


  def main(args: Array[String]) = {
    val logger = Logger(LoggerFactory getLogger getClass.getName)
    val localFilePath = "/home/ubuntu/Downloads/samosa.jpeg"
    //logger.info("File: " + localFilePath)
    val modelId = "FoodImageClassifier"
    val accessToken = Constants.ACCESS_TOKEN
    //logger.info("modelId: " + modelId)
    //logger.info("accessToken: " + accessToken)
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
