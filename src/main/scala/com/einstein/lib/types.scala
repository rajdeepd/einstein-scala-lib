package com.einstein.lib

/**
  * Created by ubuntu on 11/5/17.
  */

case class Labels(
                   id: Double,
                   datasetId: Double,
                   name: String,
                   numExamples: Double
                 )
case class LabelSummary(
                         labels: List[Labels]
                       )
case class R00tJsonObject(
                           id: Double,
                           name: String,
                           createdAt: String,
                           updatedAt: String,
                           labelSummary: LabelSummary,
                           totalExamples: Double,
                           totalLabels: Double,
                           available: Boolean,
                           statusMsg: String,
                           `type`: String,
                           `object`: String
                         )