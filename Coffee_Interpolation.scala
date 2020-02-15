object StringInterpolation extends App {
case class coffee (name: String, sweetness: String, Size: Int )
  val myFavoriteCoffee: coffee = coffee ("Latte", "Not Sweet", 300)
  println(s"My Favorite coffee is ${myFavoriteCoffee.name}, ${myFavoriteCoffee.sweetness} " +
    s"and the size is ${myFavoriteCoffee.Size} ml ")
  val qtyCoffee = 3
  println(s"Usually I drink 3 coffee per day = ${qtyCoffee == 3}")
  }
