import sbt._
import Keys._

object SodaFountainLib{
  lazy val settings: Seq[Setting[_]] = BuildSettings.buildSettings ++ Seq(
    libraryDependencies ++= Seq(
      "com.socrata" %% "coordinator" % "0.0.1-SNAPSHOT",
      "com.socrata" %% "socrata-http-utils" % "1.2.0",
      "javax.servlet" % "servlet-api" % "2.5" % "provided"
    )
  )
}