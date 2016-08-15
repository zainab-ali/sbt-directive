lazy val publishSettings = Seq(
  name := "invalid-source",
  scalaVersion := "2.11.8",
  organization := "com.ithaca",
  version := "0.0.1-SNAPSHOT"
)

lazy val root = (project in file(".")).settings(
  publishSettings,
  directiveSettings,
  preprocessors += directive.Preprocess.lines("strip") {
      "lines => Nil"
  },
  libraryDependencies += "org.scoverage" %% "scalac-scoverage-runtime" % "1.1.1" % DirectivePlugin.DirectiveConfig
)
