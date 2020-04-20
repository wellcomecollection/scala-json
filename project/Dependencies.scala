import sbt._

object Dependencies {

  lazy val versions = new {
    val circe     = "0.11.1"
    val grizzled  = "1.3.2"
    val scalatest = "3.1.1"
  }

  val circeDependencies = Seq(
    "io.circe" %% "circe-core" % versions.circe,
    "io.circe" %% "circe-generic"% versions.circe,
    "io.circe" %% "circe-generic-extras"% versions.circe,
    "io.circe" %% "circe-parser"% versions.circe
  )

  val testDependencies = Seq(
    "org.scalatest" %% "scalatest" % versions.scalatest % Test
  )

  val loggingDependencies = Seq(
    "org.clapper" %% "grizzled-slf4j" % versions.grizzled
  )

  val libraryDependencies =
    circeDependencies ++
    loggingDependencies ++
    testDependencies
}
