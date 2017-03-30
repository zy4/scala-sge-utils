name := "scala-sge-utils"

organization := "de.zy4"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.1"

crossScalaVersions := Seq("2.10.6", "2.11.2", "2.11.8", "2.12.1")

libraryDependencies ++= List("org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.5")

scalacOptions ++= Seq(
  "-target:jvm-1.8",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-optimise",
  "-explaintypes",
  "-encoding", "UTF-8",
  "-Xlint",
  "-Ywarn-adapted-args", // Warn if an argument list is modified to match the receiver
  "-Ywarn-value-discard", // Warn when non-Unit expression results are unused
  "-Ywarn-inaccessible",
  "-Ywarn-dead-code"
)
