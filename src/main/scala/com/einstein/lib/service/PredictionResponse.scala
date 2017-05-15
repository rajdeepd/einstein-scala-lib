package com.einstein.lib.service
import java.util.List

/**
  * Created by ubuntu on 10/5/17.
  */
class PredictionResponse {
  private var probabilities: List[Probabilities] = null
  private var `object`: String = null

  def setProbabilities(probabilities: List[Probabilities]) {
    this.probabilities = probabilities
  }

  def getProbabilities: List[Probabilities] = {
    return this.probabilities
  }

  def setObject(`object`: String) {
    this.`object` = `object`
  }

  def getObject: String = {
    return this.`object`
  }
}
