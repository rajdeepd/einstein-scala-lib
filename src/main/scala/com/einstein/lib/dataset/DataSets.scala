package com.einstein.lib.dataset

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.apache.commons.lang.builder.ToStringBuilder
import java.io.Serializable
import java.util.List

/**
  * Created by ubuntu on 15/5/17.
  */
class DataSets extends Serializable {
  @SerializedName("object")
  @Expose private var `object`: String = null
  @SerializedName("data")
  @Expose private var data: List[DataSet] = null
  private val serialVersionUID: Long = 7316971278346539930L

  /**
    * No args constructor for use in serialization
    *
    */
  def DataSets() {

  }

  /**
    *
    * @param data
    * @param object
    */
  def this(`object`: String, data: List[DataSet]) {
    this()

    this.`object` = `object`
    this.data = data
  }

  def getObject: String = {
    return `object`
  }

  def setObject(`object`: String) {
    this.`object` = `object`
  }

  def withObject(`object`: String): DataSets = {
    this.`object` = `object`
    return this
  }

  def getData: List[DataSet] = {
    return data
  }

  def setData(data: List[DataSet]) {
    this.data = data
  }

  def withData(data: List[DataSet]): DataSets = {
    this.data = data
    return this
  }

  override def toString: String = {
    return ToStringBuilder.reflectionToString(this)
  }
}
