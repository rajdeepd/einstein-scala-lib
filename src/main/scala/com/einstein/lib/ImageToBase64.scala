package com.einstein.lib

import java.io.{File, FileInputStream, FileOutputStream}

import org.apache.commons.codec.binary.Base64

/**
  * Created by Rajdeep Dua on 10/5/17.
  */
object ImageToBase64 {
  @throws(classOf[Exception])
  def encode(filePath: String): String = {
    //val path: String = System.getProperty("user.dir")
    val f: File = new File(filePath)
    val fis: FileInputStream = new FileInputStream(f)
    val byteArray = new Array[Byte](f.length.toInt)
    fis.read(byteArray)
    val imageString: String = Base64.encodeBase64String(byteArray)
    fis.close
    return imageString
  }

  @throws(classOf[Exception])
  def decode(encodedString: String, outputPath: String) {
    val fos: FileOutputStream = new FileOutputStream(outputPath)
    val byteArray = Base64.decodeBase64(encodedString)
    fos.write(byteArray)
    fos.close
  }
}
