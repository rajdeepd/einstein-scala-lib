package com.einstein.lib

import java.io.File
import java.util.List
import java.util.LinkedList

import org.apache.http.client.HttpClient
import org.apache.http.impl.client.HttpClientBuilder

/**
  * Created by ubuntu on 9/5/17.
  */


object Util {
  //var DATA_PATH: String = "/src/main/webapp/assets/data"
  def getClient: HttpClient = {
    val client: HttpClient = HttpClientBuilder.create.build
    return client
  }

  /*def getListOfImages: List[_] = {
    val userDir: String = System.getProperty("user.dir") + DATA_PATH
    val folder: File = new File(userDir)
    val  list = new LinkedList[AnyRef]
    for (fileEntry <- folder.listFiles) {
      if (!(fileEntry.getName == "blank_image.png")) {
        list.add(fileEntry.getName)
      }
    }
    return list
  }*/
}
