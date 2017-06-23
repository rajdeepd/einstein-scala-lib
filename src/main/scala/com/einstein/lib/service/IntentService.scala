package com.einstein.lib.service

import java.util.List

import com.einstein.lib.{Constants, Util}
import com.google.gson.Gson
import org.apache.http.{HttpResponse, HttpEntity}
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.HttpPost
import org.apache.http.entity.mime.{HttpMultipartMode, MultipartEntityBuilder}
import org.apache.http.impl.client.BasicResponseHandler

/**
  * Created by Rajdeep Dua on 19/6/17.
  */
trait IntentService {
  def getIntent(modelId : String, accessToken : String,  document: String) : java.util.List[_]

}

class IntentServiceImpl extends IntentService {
  def getIntent(modelId : String, accessToken : String,  document: String) :java.util.List[_] = {
    val client: HttpClient = Util.getClient
    val post: HttpPost = new HttpPost(Constants.BASE_INTENT)
    post.setHeader("Cache-Control", "no-cache")
    post.setHeader("Authorization", "Bearer " + accessToken)
    val builder: MultipartEntityBuilder = MultipartEntityBuilder.create
    builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE)
    builder.addTextBody("document", document)
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
