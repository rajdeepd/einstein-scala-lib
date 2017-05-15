package com.einstein.lib.service

/**
  * Created by ubuntu on 10/5/17.
  */
class Probabilities {
  private var label: String = null
  private var probability: Double = .0

  def setLabel(label: String) {
    this.label = label
  }

  def getLabel: String = {
    return this.label
  }

  def setProbability(probability: Double) {
    this.probability = probability
  }

  def getProbability: Double = {
    return this.probability
  }
}
