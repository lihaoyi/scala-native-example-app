package hello
import utest._
object HelloTests extends TestSuite{
  val tests = Tests{
    val txt = Hello.page.render
    'head - {
      val head = txt.take(txt.indexOf("<body"))
      'console - {
        assert(head.contains("console"))
      }
      'log - {
        assert(head.contains("log()"))
      }
    }
    'rest - {
      assert(txt.contains("Paragraph"))
    }
    'title - {
      assert(txt.indexOf(Hello.titleString) >= 0)
    }
  }
}
