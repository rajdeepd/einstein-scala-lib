package com.einstein.lib.dataset

import java.util.List
import java.util.Iterator
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
/**
  * Created by Rajdeep Dua on 15/5/17.
  */
class LabelSummary extends Serializable{
  @SerializedName("labels")
  @Expose private var labels: List[Label] = null
  private val serialVersionUID: Long = -8826634780058855619L

  /**
    * No args constructor for use in serialization
    *
    */
  def LabelSummary() {
  }

  /**
    *
    * @param labels
    */
  def this(labels: List[Label]) {
    this()
    this.labels = labels
  }

  def getLabels: List[Label] = {
    return labels
  }

  def setLabels(labels: List[Label]) {
    this.labels = labels
  }

  def withLabels(labels: List[Label]): LabelSummary = {
    this.labels = labels
    return this
  }

  override def toString: String = {
    val itr: Iterator[_] = labels.iterator
    val builder: StringBuilder = new StringBuilder
    while (itr.hasNext) {
      val label: String = itr.next + "\n"
      builder.append(label)
    }
    return builder.toString
  }
}
