lazy val root = (project in file(".")).
  settings(
    name := "project",
    version := "1.0",
    scalaVersion := "2.11.4"
  )
lazy val scalacheck = "org.scalacheck" %% "scalacheck" % "1.12.0"

libraryDependencies ++= Seq(
  scalacheck,
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test")
