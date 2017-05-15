package com.einstein.lib.service

import java.util.{Iterator, List}

import com.einstein.lib.dataset.{DataSets, DataSet}
import com.einstein.lib.model.{Metrics, MetricsData, Models}
import com.einstein.lib.{ImageToBase64, Constants, Util}
import com.einstein.lib.dataset.CreateDataSetResponse
import com.google.gson.Gson
import org.apache.http.{HttpEntity, HttpResponse}
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.methods.HttpPost
import org.apache.http.client.methods.HttpDelete
import org.apache.http.entity.mime.{HttpMultipartMode, MultipartEntityBuilder}
import org.apache.http.impl.client.BasicResponseHandler

/**
  * Created by ubuntu on 11/5/17.
  */
object DataSetService {
  @throws(classOf[Exception])
  def getDataSetsList(accessToken: String): List[_] = {
    val client: HttpClient = Util.getClient
    val datasetsUrl: String = "https://api.metamind.io/v1/vision/datasets"
    val get: HttpGet = new HttpGet(datasetsUrl)
    get.setHeader("Cache-Control", "no-cache")
    get.setHeader("Authorization", "Bearer " + accessToken)
    val builder: MultipartEntityBuilder = MultipartEntityBuilder.create
    builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE)
    val handler: BasicResponseHandler = new BasicResponseHandler
    val response: HttpResponse = client.execute(get)
    val body: String = handler.handleResponse(response)
    val gson: Gson = new Gson
    val res: DataSets = gson.fromJson(body, classOf[DataSets]).asInstanceOf[DataSets]
    val datasetsList: List[_] = res.getData
    return datasetsList
  }

  @throws(classOf[Exception])
  def getDataSetAndModelList(accessToken: String): List[_] = {
    val client: HttpClient = Util.getClient
    val datasetsUrl: String = "https://api.metamind.io/v1/vision/datasets"
    val get: HttpGet = new HttpGet(datasetsUrl)
    get.setHeader("Cache-Control", "no-cache")
    get.setHeader("Authorization", "Bearer " + accessToken)
    val builder: MultipartEntityBuilder = MultipartEntityBuilder.create
    builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE)
    val handler: BasicResponseHandler = new BasicResponseHandler
    val response: HttpResponse = client.execute(get)
    val body: String = handler.handleResponse(response)
    val gson: Gson = new Gson
    val res: DataSets = gson.fromJson(body, classOf[DataSets]).asInstanceOf[DataSets]
    val datasetsList: List[_] = res.getData
    val itr: Iterator[_] = datasetsList.iterator
    var i: Int = 0
    while (itr.hasNext) {
      val id: Long = (itr.next.asInstanceOf[DataSet]).getId
      val models: List[_] = getAllModels(accessToken, id)
      (datasetsList.get(i).asInstanceOf[DataSet]).setModels(models)
      i += 1
    }
    return datasetsList
  }

  @throws(classOf[Exception])
  def getAllModels(accessToken: String, id: Long): List[_] = {
    val client: HttpClient = Util.getClient
    val modelUrl: String = Constants.DATASETS + "/" + id + "/models"
    val get: HttpGet = new HttpGet(modelUrl)
    get.setHeader("Cache-Control", "no-cache")
    get.setHeader("Authorization", "Bearer " + accessToken)
    val builder: MultipartEntityBuilder = MultipartEntityBuilder.create
    builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE)
    val handler: BasicResponseHandler = new BasicResponseHandler
    val response: HttpResponse = client.execute(get)
    val body: String = handler.handleResponse(response)
    val gson: Gson = new Gson
    val res: Models = gson.fromJson(body, classOf[Models]).asInstanceOf[Models]
    val modelsList: List[_] = res.getData
    return modelsList
  }

  @throws(classOf[Exception])
  def getModelMetrics(accessToken : String, id: String) : MetricsData = {
    val client: HttpClient = Util.getClient
    val modelUrl: String = "https://api.metamind.io/v1/vision/models/" + id
    val get: HttpGet = new HttpGet(modelUrl)
    get.setHeader("Cache-Control", "no-cache")
    get.setHeader("Authorization", "Bearer " + accessToken)
    val builder: MultipartEntityBuilder = MultipartEntityBuilder.create
    builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE)
    val handler: BasicResponseHandler = new BasicResponseHandler
    val response: HttpResponse = client.execute(get)
    val body: String = handler.handleResponse(response)
    val gson: Gson = new Gson
    val res: Metrics = gson.fromJson(body, classOf[Metrics]).asInstanceOf[Metrics]
    val metricsData: MetricsData = res.getMetricsData
    return metricsData
  }
  /*
  //curl -X POST -H "Authorization: Bearer <TOKEN>" -H "Cache-Control: no-cache" -H
  // "Content-Type: multipart/form-data" -F
  // "path=https://dropboxusercontent.com/u/99999999/mountainvsbeach.zip"
  // https://api.metamind.io/v1/vision/datasets/upload/sync
  */
  def createDataSet(accessToken : String, path : String): CreateDataSetResponse = {
    val client: HttpClient = Util.getClient
    val url = "https://api.metamind.io/v1/vision/datasets/upload/sync"
    val post: HttpPost = new HttpPost(url)
    post.setHeader("Cache-Control", "no-cache")
    post.setHeader("Authorization", "Bearer " + accessToken)
    val builder: MultipartEntityBuilder = MultipartEntityBuilder.create
    builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE)
    builder.addTextBody("path", path)
    val entity: HttpEntity = builder.build
    post.setEntity(entity)
    val handler: BasicResponseHandler = new BasicResponseHandler
    val response: HttpResponse = client.execute(post)
    println(response)
    val body: String = handler.handleResponse(response)
    val gson: Gson = new Gson
    val res: CreateDataSetResponse = gson.fromJson(body, classOf[CreateDataSetResponse])
    println(res)
    return res
  }
  //curl -X DELETE -H "Authorization: Bearer <TOKEN>" -H
  // "Cache-Control: no-cache" https://api.metamind.io/v1/vision/datasets/<DATASET_ID>

  def deleteDataSet(accessToken: String, id : String) : String = {
    //req, err := http.NewRequest("DELETE", "https://api.metamind.io/v1/vision/datasets/" +  id, nil)
    val client: HttpClient = Util.getClient
    val url = "https://api.metamind.io/v1/vision/datasets/" +  id
    //val post: HttpPost = new HttpPost(url)
    val delete: HttpDelete = new HttpDelete(url)
    delete.setHeader("Cache-Control", "no-cache")
    delete.setHeader("Authorization", "Bearer " + accessToken)
    val handler: BasicResponseHandler = new BasicResponseHandler
    val response: HttpResponse = client.execute(delete)
    println(response)
    return ""

  }
}
