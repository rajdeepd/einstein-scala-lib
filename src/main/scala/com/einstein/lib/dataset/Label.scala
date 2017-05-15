package com.einstein.lib.dataset

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.apache.commons.lang.builder.ToStringBuilder

/**
  * Created by ubuntu on 15/5/17.
  */
class Label extends Serializable{
  @SerializedName("id")
  @Expose private var id: Long = Long.MinValue
  @SerializedName("datasetId")
  @Expose private var datasetId: Long = Long.MinValue
  @SerializedName("name")
  @Expose private var name: String = null
  @SerializedName("numExamples")
  @Expose private var numExamples: Long = Long.MinValue
  private val serialVersionUID: Long = 7307250831470564985L

  /**
    * No args constructor for use in serialization
    *
    */
  def Label() {

  }

  /**
    *
    * @param id
    * @param name
    * @param datasetId
    * @param numExamples
    */
  def this(id: Long, datasetId: Long, name: String, numExamples: Long) {
    this()
    this.id = id
    this.datasetId = datasetId
    this.name = name
    this.numExamples = numExamples
  }

  def getId: Long = {
    return id
  }

  def setId(id: Long) {
    this.id = id
  }

  def withId(id: Long): Label = {
    this.id = id
    return this
  }

  def getDatasetId: Long = {
    return datasetId
  }

  def setDatasetId(datasetId: Long) {
    this.datasetId = datasetId
  }

  def withDatasetId(datasetId: Long): Label = {
    this.datasetId = datasetId
    return this
  }

  def getName: String = {
    return name
  }

  def setName(name: String) {
    this.name = name
  }

  def withName(name: String): Label = {
    this.name = name
    return this
  }

  def getNumExamples: Long = {
    return numExamples
  }

  def setNumExamples(numExamples: Long) {
    this.numExamples = numExamples
  }

  def withNumExamples(numExamples: Long): Label = {
    this.numExamples = numExamples
    return this
  }

  /*override def toString: String = {
    return "Name: " + name + ", numExamples: " + numExamples
  }*/

  override def toString() : String ={
      return ToStringBuilder.reflectionToString(this);
  }
}
