scalaVersion := "2.11.11"
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.5.3" % "test"
libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.6.7"
testFrameworks += new TestFramework("utest.runner.Framework")
nativeLinkStubs := true
enablePlugins(ScalaNativePlugin)
