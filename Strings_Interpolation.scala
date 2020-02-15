    object StringInterpolationObject extends App {
        println("Step 1: Using String Interpolation to print a variable")
        val favoriteDonut: String="Glazed Donut"
        println(s"My favorite donut = $favoriteDonut")
        println("\nStep 2: Using String Interpolation on object properties")
        case class Donut(name: String, tastelevel: String)
        val favoriteDonut2: Donut=Donut("Glazed Donut", "Very Tasty")
        println(s"My favorite donut name =${favoriteDonut2.name}, tastelevel = ${favoriteDonut2.tastelevel}")
        println("\nStep3: Using Stering Interpolation to evaluate expressions")
        val qtyDonutsToBuy: Int=10
        println(s"We are buying 10 donuts =${qtyDonutsToBuy == 10}")
        println("\nStep 4: Using String Interpolation for formatting texts")
        val donutName: String="Vanilla Donut"
        val donutTasteLevel: String = "Tasty"
        println(f"$donutName%20s $donutTasteLevel")
        println("\nStep 5: Using f Interpolator to format numbers")
        val donutPrice: Double=2.5
        println(s"Donut Price = $donutPrice")
        println(f"Formatted donut Price = $donutPrice%2f")
        println("\nStep 6: Using raw Interpolation")
        println(raw"Favorite Donut \t$donutName")


    }
