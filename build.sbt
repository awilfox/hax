name := "hax"

version := "1.0.0"

scalaVersion := "2.9.1"

scalacOptions += "-deprecation"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "pircbot" % "pircbot" % "1.5.0",
  "org.scalaquery" % "scalaquery_2.9.0-1" % "0.9.5",
  "org.xerial" % "sqlite-jdbc" % "3.7.2",
  "org.scalaj" %% "scalaj-http" % "0.2.9",
  "net.liftweb" %% "lift-json" % "2.4",
  "org.jsoup" % "jsoup" % "1.6.1",
  "org.scala-tools.time" % "time_2.9.1" % "0.5",
  "com.typesafe.config" % "config" % "0.2.1",
  "org.scalatest" %% "scalatest" % "1.7.1" % "test"
)
