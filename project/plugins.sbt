addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.5")
libraryDependencies <+= sbtVersion(v => "org.scala-sbt" % "scripted-plugin" % v)
