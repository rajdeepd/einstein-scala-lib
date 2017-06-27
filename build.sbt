name := "einstein-scala-lib"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.5.3"
libraryDependencies += "org.apache.httpcomponents" % "httpcore" % "4.4.6"
libraryDependencies += "com.google.code.gson" % "gson" % "1.7.1"
libraryDependencies += "org.apache.httpcomponents" % "httpmime" % "4.5.3"
libraryDependencies += "org.apache.commons" % "commons-io" % "1.3.2"
libraryDependencies += "commons-lang" % "commons-lang" % "2.6"

libraryDependencies ++= Seq(
  "com.typesafe.scala-logging" % "scala-logging-slf4j_2.11" % "2.1.2",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
  "org.slf4j" % "slf4j-api" % "1.7.25",
  "org.slf4j" % "log4j-over-slf4j" % "1.7.25",  // for any java classes looking for this
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)