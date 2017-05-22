package com.einstein.lib.dataset

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


/**
  * Created by Rajdeep Dua on 22/5/17.
  */

class TrainDataSetResponse {
  @SerializedName("datasetId")
  @Expose private var datasetId: Integer = null
  @SerializedName("datasetVersionId")
  @Expose private var datasetVersionId: Integer = null
  @SerializedName("name")
  @Expose private var name: String = null
  @SerializedName("status")
  @Expose private var status: String = null
  @SerializedName("progress")
  @Expose private var progress: Integer = null
  @SerializedName("createdAt")
  @Expose private var createdAt: String = null
  @SerializedName("updatedAt")
  @Expose private var updatedAt: String = null
  @SerializedName("learningRate")
  @Expose private var learningRate: Double = Double.MinValue
  @SerializedName("epochs")
  @Expose private var epochs: Integer = null
  @SerializedName("queuePosition")
  @Expose private var queuePosition: Integer = null
  @SerializedName("object")
  @Expose private var `object`: String = null
  @SerializedName("modelId")
  @Expose private var modelId: String = null
  @SerializedName("trainParams")
  @Expose private var trainParams: AnyRef = null
  @SerializedName("trainStats")
  @Expose private var trainStats: AnyRef = null
  @SerializedName("modelType")
  @Expose private var modelType: String = null

  def getDatasetId: Integer = {
    return datasetId
  }

  def setDatasetId(datasetId: Integer) {
    this.datasetId = datasetId
  }

  def getDatasetVersionId: Integer = {
    return datasetVersionId
  }

  def setDatasetVersionId(datasetVersionId: Integer) {
    this.datasetVersionId = datasetVersionId
  }

  def getName: String = {
    return name
  }

  def setName(name: String) {
    this.name = name
  }

  def getStatus: String = {
    return status
  }

  def setStatus(status: String) {
    this.status = status
  }

  def getProgress: Integer = {
    return progress
  }

  def setProgress(progress: Integer) {
    this.progress = progress
  }

  def getCreatedAt: String = {
    return createdAt
  }

  def setCreatedAt(createdAt: String) {
    this.createdAt = createdAt
  }

  def getUpdatedAt: String = {
    return updatedAt
  }

  def setUpdatedAt(updatedAt: String) {
    this.updatedAt = updatedAt
  }

  def getLearningRate: Double = {
    return learningRate
  }

  def setLearningRate(learningRate: Double) {
    this.learningRate = learningRate
  }

  def getEpochs: Integer = {
    return epochs
  }

  def setEpochs(epochs: Integer) {
    this.epochs = epochs
  }

  def getQueuePosition: Integer = {
    return queuePosition
  }

  def setQueuePosition(queuePosition: Integer) {
    this.queuePosition = queuePosition
  }

  def getObject: String = {
    return `object`
  }

  def setObject(`object`: String) {
    this.`object` = `object`
  }

  def getModelId: String = {
    return modelId
  }

  def setModelId(modelId: String) {
    this.modelId = modelId
  }

  def getTrainParams: AnyRef = {
    return trainParams
  }

  def setTrainParams(trainParams: AnyRef) {
    this.trainParams = trainParams
  }

  def getTrainStats: AnyRef = {
    return trainStats
  }

  def setTrainStats(trainStats: AnyRef) {
    this.trainStats = trainStats
  }

  def getModelType: String = {
    return modelType
  }

  def setModelType(modelType: String) {
    this.modelType = modelType
  }
}



