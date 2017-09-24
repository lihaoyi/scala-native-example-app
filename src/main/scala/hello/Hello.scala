package hello
import scalatags.Text.all._
object Hello {
  def para(n: Int, m: Modifier*) = p(m, title := ("this is paragraph " + n))

  val titleString = "This is my title"
  val firstParaString = "This is my first paragraph"

  val page = html(
    head(script("console.log(1)")),
    body(
      h1(color := "red")(titleString),
      div(backgroundColor := "blue")(
        para(0, cls := "contentpara first", firstParaString),
        a(href := "https://www.google.com")(p("Goooogle")),
        for (i <- 0 until 5) yield para(i,
          cls := "contentpara",
          color := (if (i % 2 == 0) "red" else "green"),
          "Paragraph ",
          i
        )
      )
    )
  )

  def main(args: Array[String]): Unit = println(page())
}
