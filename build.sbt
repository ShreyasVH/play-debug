name := "play-debug"

version := "1.0.0"

scalaVersion := "2.13.10"

libraryDependencies += guice

lazy val root = (project in file(".")).enablePlugins(PlayJava)