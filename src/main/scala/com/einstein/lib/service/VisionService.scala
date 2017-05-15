package com.einstein.lib.service

import java.util.{Iterator, List}
import com.einstein.lib.dataset.DataSets
import com.einstein.lib.model.{Metrics, MetricsData, Models}
import com.einstein.lib.{Constants, ImageToBase64, Util}
import com.google.gson.Gson
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.{HttpGet, HttpPost}
import org.apache.http.entity.mime.{HttpMultipartMode, MultipartEntityBuilder}
import org.apache.http.impl.client.BasicResponseHandler
import org.apache.http.{HttpEntity, HttpResponse}

/**
  * Created by Rajdeep Dua on 9/5/17.
  */
object VisionService {
  def predictRemoteImage(): Unit = {

  }

  @throws(classOf[Exception])
  def predictImage(url: String, modelId: String, accessToken: String): java.util.List[_] = {
    val client: HttpClient = Util.getClient
    val post: HttpPost = new HttpPost(Constants.VISION_PREDICT_URL)
    post.setHeader("Cache-Control", "no-cache")
    post.setHeader("Authorization", "Bearer " + accessToken)
    val builder: MultipartEntityBuilder = MultipartEntityBuilder.create
    builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE)
    builder.addTextBody("sampleLocation", url)
    builder.addTextBody("modelId", modelId)
    val entity: HttpEntity = builder.build
    post.setEntity(entity)
    val handler: BasicResponseHandler = new BasicResponseHandler
    val response: HttpResponse = client.execute(post)
    val body: String = handler.handleResponse(response)
    val gson: Gson = new Gson
    val res: PredictionResponse = gson.fromJson(body, classOf[PredictionResponse]).asInstanceOf[PredictionResponse]
    val probabilitiesList: java.util.List[_] = res.getProbabilities
    return probabilitiesList
  }

  @throws(classOf[Exception])
  def predictLocalImage(localFilePath: String, modelId: String, accessToken: String):List[_] = {
    val client: HttpClient = Util.getClient
    val post: HttpPost = new HttpPost(Constants.VISION_PREDICT_URL)
    post.setHeader("Cache-Control", "no-cache")
    post.setHeader("Authorization", "Bearer " + accessToken)
    val builder: MultipartEntityBuilder = MultipartEntityBuilder.create
    builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE)
    val imageDataString: String = ImageToBase64.encode(localFilePath)
    builder.addTextBody("sampleBase64Content", imageDataString)
    builder.addTextBody("modelId", modelId)
    val entity: HttpEntity = builder.build
    post.setEntity(entity)
    val handler: BasicResponseHandler = new BasicResponseHandler
    val response: HttpResponse = client.execute(post)
    val body: String = handler.handleResponse(response)
    val gson: Gson = new Gson
    val res: PredictionResponse = gson.fromJson(body, classOf[PredictionResponse]).asInstanceOf[PredictionResponse]
    val probabilitiesList: java.util.List[_] = res.getProbabilities
    return probabilitiesList
  }

}
