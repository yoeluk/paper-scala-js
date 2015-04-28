sonatypeSettings
name         := "paper-scala-js"
version      := "0.1-SNAPSHOT"
scalaVersion := "2.11.6"
organization := "com.zaporbit"
isSnapshot   := true

enablePlugins(ScalaJSPlugin)

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-target:jvm-1.7",
  "-encoding", "UTF-8",
  "-language:implicitConversions",
  "-language:reflectiveCalls"
)
libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.0"
)
jsDependencies += "org.webjars" % "paperjs" % "0.9.22" / "paper-full.min.js" commonJSName "paper"

publishMavenStyle       := true
publishArtifact in Test := false
pomIncludeRepository    := { _ => false }
credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := {
  <url>https://github.com/yoeluk/paper-scala-js</url>
    <licenses>
      <license>
        <name>Apache 2</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      </license>
    </licenses>
    <scm>
      <connection>scm:git:github.com/yoeluk/paper-scala-js</connection>
      <developerConnection>scm:git:git@github.com:yoeluk/paper-scala-js</developerConnection>
      <url>github.com/yoeluk/paper-scala-js</url>
    </scm>
    <developers>
      <developer>
        <id>yoeluk</id>
        <name>Yoel RGD</name>
        <url>https://github.com/yoeluk/</url>
      </developer>
    </developers>
}