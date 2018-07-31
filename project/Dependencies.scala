import sbt._

object Dependencies {

  lazy val versions = new {
    val circe = "0.9.0"
    val logback = "1.1.8"
    val scalatest = "3.0.1"
  }

  val circeDependencies = Seq(
    "io.circe" %% "circe-core" % versions.circe,
    "io.circe" %% "circe-generic"% versions.circe,
    "io.circe" %% "circe-generic-extras"% versions.circe,
    "io.circe" %% "circe-parser"% versions.circe,
    "io.circe" %% "circe-java8" % versions.circe,
  )

  val testDependencies = Seq(
    "org.scalatest" %% "scalatest" % versions.scalatest % Test,
  )

  val loggingDependencies = Seq(
    "ch.qos.logback" % "logback-classic" % versions.logback,
  )

  val libraryDependencies =
    circeDependencies ++
    loggingDependencies ++
    testDependencies
}
