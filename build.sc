import mill._, scalalib._, scalanativelib._, scalanativelib.api._

object example extends ScalaNativeModule{
  def scalaNativeVersion = "0.5.4"
  def scalaVersion = "3.4.2"
  def releaseMode = ReleaseMode.ReleaseFast
  def nativeLTO = LTO.Thin
  def ivyDeps = Agg(
    ivy"com.lihaoyi::ujson::3.3.1",
    ivy"com.lihaoyi::mainargs::0.7.0",
    ivy"com.lihaoyi::os-lib::0.10.2"
  )
  object test extends ScalaNativeTests{
    def ivyDeps = Agg(ivy"com.lihaoyi::utest::0.8.3")
    def testFramework = "utest.runner.Framework"
  }
}
