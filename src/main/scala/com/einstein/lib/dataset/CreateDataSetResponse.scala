package com.einstein.lib.dataset

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
  * Created by ubuntu on 15/5/17.
  */
class CreateDataSetResponse {
  @SerializedName("id")
  @Expose private var id: Integer = null
  @SerializedName("name")
  @Expose private var name: String = null
  @SerializedName("createdAt")
  @Expose private var createdAt: String = null
  @SerializedName("updatedAt")
  @Expose private var updatedAt: String = null
  @SerializedName("labelSummary")
  @Expose private var labelSummary: LabelSummary = null
  @SerializedName("totalExamples")
  @Expose private var totalExamples: Integer = null
  @SerializedName("totalLabels")
  @Expose private var totalLabels: Integer = null
  @SerializedName("available")
  @Expose private var available : Boolean = false
  @SerializedName("statusMsg")
  @Expose private var statusMsg: String = null
  @SerializedName("type")
  @Expose private var `type`: String = null
  @SerializedName("object")
  @Expose private var `object`: String = null

  def getId: Integer = {
    return id
  }

  def setId(id: Integer) {
    this.id = id
  }

  def getName: String = {
    return name
  }

  def setName(name: String) {
    this.name = name
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

  def getLabelSummary: LabelSummary = {
    return labelSummary
  }

  def setLabelSummary(labelSummary: LabelSummary) {
    this.labelSummary = labelSummary
  }

  def getTotalExamples: Integer = {
    return totalExamples
  }

  def setTotalExamples(totalExamples: Integer) {
    this.totalExamples = totalExamples
  }

  def getTotalLabels: Integer = {
    return totalLabels
  }

  def setTotalLabels(totalLabels: Integer) {
    this.totalLabels = totalLabels
  }

  def getAvailable: Boolean = {
    return available
  }

  def setAvailable(available: Boolean) {
    this.available = available
  }

  def getStatusMsg: String = {
    return statusMsg
  }

  def setStatusMsg(statusMsg: String) {
    this.statusMsg = statusMsg
  }

  def getType: String = {
    return `type`
  }

  def setType(`type`: String) {
    this.`type` = `type`
  }

  def getObject: String = {
    return `object`
  }

  def setObject(`object`: String) {
    this.`object` = `object`
  }
}
