object MultiLineString extends App {
  println("Step 1: How to escape a Json String")
  println("\nStep 2: Using backslach to escape quotes")
  val donutJson2: String = "{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
  println(s"donutJson2 = $donutJson2")
  println("\nStep 3: Using triple quotes \"\"\" to escape characteristics")
  val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
  println(s"donutJson3=$donutJson3")
  println("\nStep 4: Creating multi-line text using stripMargin")
  val donutJson4: String =
    """
      |{
      |"donut_name":"Glazed Donut"
      |"taste_level":"Very Tasty"
      |"price":2.50
      |}
"""
    .stripMargin
println(s"donutJson4:$donutJson4")
}
