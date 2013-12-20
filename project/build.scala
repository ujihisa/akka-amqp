import sbt._
import Keys._

object build extends Build {
	import dependencies._

	lazy val standardSettings = Defaults.defaultSettings ++ Seq(
		resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/",
		organization := "io.github.ujihisa",
		version := "2.0.5",
		scalaVersion := "2.9.3")

	lazy val root = Project(
		id = "akka-amqp",
		base = file("."),
		settings = standardSettings ++ Seq(
			libraryDependencies ++= Seq(
				AmqpClient,
				AkkaActor,
				JUnit,
				ScalaTest,
				AkkaTestKit,
				Mockito)))
}
