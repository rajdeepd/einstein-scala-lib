package com.einstein.lib.example

import com.einstein.lib.Constants
import com.einstein.lib.service.DataSetService

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object ShowModelMetrics {
  def main(args: Array[String]) = {
    val accessToken = Constants.ACCESS_TOKEN
    val modelId = "MLHNXXILAFF4B5ZKIG5R3I75OA"
    val modelMetrics = DataSetService.getModelMetrics(accessToken, modelId)
    val f1Score = modelMetrics.getF1
    val labels = modelMetrics.getLabels
    val testAccuracy = modelMetrics.getTestAccuracy
    val trainingLoss = modelMetrics.getTrainingLoss
    val confusionMatrix = modelMetrics.getConfusionMatrix

    println("f1Score: " + f1Score)
    println("labels: " + labels)
    println("testAccuracy: " + testAccuracy)
    println("trainingLoss: " + trainingLoss)
    println("confusionMatrix: " + confusionMatrix)
  }

}
