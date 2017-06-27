package com.einstein.lib

/**
  * Created by ubuntu on 9/5/17.
  */
object Constants {
  var BASE: String = "https://api.einstein.ai/v2/vision/"
  var BASE_v1 : String = "https://api.einstein.ai/v1/vision/"
  //var BASE: String = "https://api.metamind.io/v1/vision/"
  var DATASETS: String = BASE + "datasets"
  var DATASETS_v1 : String  = BASE_v1 + "datasets"
  var VISION_PREDICT_URL: String = BASE +  "predict"
  var MODELS_URL: String = "https://api.metamind.io/v1/vision/predict"
  var ACCESS_TOKEN: String = System.getenv("access_token")
  var MODEL_ID_FOOD_IMAGE_CLASSIFIER: String = "FoodImageClassifier"
  //val ACCESS_TOKEN = "ec7b4b22ea6e423ff87780d4f56b65c206395b48"

  val BASE_LANG : String = "https://api.einstein.ai/v2/language"
  val BASE_INTENT : String = BASE_LANG + "/intent"
  val DATASETS_INTENT : String = BASE_LANG + "/datasets"
  val LANG_TRAIN : String  =  BASE_LANG + "/train"
  val DATASETS_INTENT_UPLOAD : String = DATASETS_INTENT + "/upload"
}
