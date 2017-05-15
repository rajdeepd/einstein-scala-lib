package com.einstein.lib.dataset

import java.util.List
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.apache.commons.lang.builder.ToStringBuilder

/**
  * Created by ubuntu on 15/5/17.
  */
class DataSet extends Serializable {
  @SerializedName("id")
  @Expose private var id: Long = 0
  @SerializedName("name")
  @Expose private var name: String = null
  @SerializedName("updatedAt")
  @Expose private var updatedAt: String = null
  @SerializedName("createdAt")
  @Expose private var createdAt: String = null
  @SerializedName("labelSummary")
  @Expose private var labelSummary: LabelSummary = null
  @SerializedName("totalExamples")
  @Expose private var totalExamples: Long = 0
  @SerializedName("totalLabels")
  @Expose private var totalLabels: Long = 0
  @SerializedName("available")
  @Expose private var available: Boolean = false
  @SerializedName("statusMsg")
  @Expose private var statusMsg: String = null
  @SerializedName("object")
  @Expose private var `object`: String = null
  private val serialVersionUID: Long = 330404583321599689L

  def getModels: List[_] = {
    return models
  }

  def setModels(models: List[_]) {
    this.models = models
  }

  var models: List[_] = null

  /**
    * No args constructor for use in serialization
    *
    */
  def DataSet1() {

  }

  /**
    *
    * @param updatedAt
    * @param id
    * @param createdAt
    * @param name
    * @param labelSummary
    * @param object
    * @param available
    * @param statusMsg
    * @param totalLabels
    * @param totalExamples
    */
  def this(id: Long, name: String, updatedAt: String, createdAt: String, labelSummary: LabelSummary,
           totalExamples: Long, totalLabels: Long, available: Boolean, statusMsg: String, `object`: String) {
    this()
    this.id = id
    this.name = name
    this.updatedAt = updatedAt
    this.createdAt = createdAt
    this.labelSummary = labelSummary
    this.totalExamples = totalExamples
    this.totalLabels = totalLabels
    this.available = available
    this.statusMsg = statusMsg
    this.`object` = `object`
  }

  def getId: Long = {
    return id
  }

  def setId(id: Long) {
    this.id = id
  }

  def withId(id: Long): DataSet = {
    this.id = id
    return this
  }

  def getName: String = {
    return name
  }

  def setName(name: String) {
    this.name = name
  }

  def withName(name: String): DataSet = {
    this.name = name
    return this
  }

  def getUpdatedAt: String = {
    return updatedAt
  }

  def setUpdatedAt(updatedAt: String) {
    this.updatedAt = updatedAt
  }

  def withUpdatedAt(updatedAt: String): DataSet = {
    this.updatedAt = updatedAt
    return this
  }

  def getCreatedAt: String = {
    return createdAt
  }

  def setCreatedAt(createdAt: String) {
    this.createdAt = createdAt
  }

  def withCreatedAt(createdAt: String): DataSet = {
    this.createdAt = createdAt
    return this
  }

  def getLabelSummary: LabelSummary = {
    return labelSummary
  }

  def setLabelSummary(labelSummary: LabelSummary) {
    this.labelSummary = labelSummary
  }

  def withLabelSummary(labelSummary: LabelSummary): DataSet = {
    this.labelSummary = labelSummary
    return this
  }

  def getTotalExamples: Long = {
    return totalExamples
  }

  def setTotalExamples(totalExamples: Long) {
    this.totalExamples = totalExamples
  }

  def withTotalExamples(totalExamples: Long): DataSet = {
    this.totalExamples = totalExamples
    return this
  }

  def getTotalLabels: Long = {
    return totalLabels
  }

  def setTotalLabels(totalLabels: Long) {
    this.totalLabels = totalLabels
  }

  def withTotalLabels(totalLabels: Long): DataSet = {
    this.totalLabels = totalLabels
    return this
  }

  def getAvailable: Boolean = {
    return available
  }

  def setAvailable(available: Boolean) {
    this.available = available
  }

  def withAvailable(available: Boolean): DataSet = {
    this.available = available
    return this
  }

  def getStatusMsg: String = {
    return statusMsg
  }

  def setStatusMsg(statusMsg: String) {
    this.statusMsg = statusMsg
  }

  def withStatusMsg(statusMsg: String): DataSet = {
    this.statusMsg = statusMsg
    return this
  }

  def getObject: String = {
    return `object`
  }

  def setObject(`object`: String) {
    this.`object` = `object`
  }

  def withObject(`object`: String): DataSet = {
    this.`object` = `object`
    return this
  }

  override def toString: String = {
    return ToStringBuilder.reflectionToString(this)
  }
}
