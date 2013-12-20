import sbt._

object dependencies {
	def AmqpClient = "com.rabbitmq" % "amqp-client" % "3.2.1"
	def AkkaActor = "com.typesafe.akka" % "akka-actor" % "2.0.5"
	def JUnit = "junit" % "junit" % "4.7" % "test"
	def ScalaTest = "org.scalatest" % "scalatest_2.9.0" % "1.8" % "test"
	def AkkaTestKit = "com.typesafe.akka" % "akka-testkit" % "2.0.5" % "test"
	def Mockito = "org.mockito" % "mockito-all" % "1.9.0" % "test"
}
