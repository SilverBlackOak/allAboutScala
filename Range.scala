import com.allaboutscala.chapter.one.notreallytutorial.Range.alphabetRangeFromAToZ

object Range extends App {
println("Step 1: Create a simple numeric range from 1 to 5 inclusive")
  val from1to5 = 1 to 5
  from1to5.foreach(i=>println(s"$i"))
  println(s"Range from 1 to 5 inclusive = $from1to5")
println("\nStep2: Create a numeric range from 1 to 5 but excluding the last integer number 5")
  val from1Until5 = 1 until 5
  println(s"Range from 1 to 5 where 5 is excluded = $from1Until5")
println("\nStep 3:  Create a numeric range from 0 to 10 but increment with multiples of 2")
  val from0To10By2 = 0 to 10 by 2
  from0To10By2.foreach(i => println(s"$i"))
  print(s"Range from 0 to 10 by 2 = $from0To10By2")
println("\nStep 4: Create an alphabetical range to represent letter a to z")
  val alphabetRangeFromAToZ = 'a' to 'z'
  alphabetRangeFromAToZ.foreach(i => println(s"$i"))
println("\nStep 5: Character ranges with user specified increment")
  val alphabetRangeFromAToZby2 = 'a' to 'z' by 2
  alphabetRangeFromAToZby2.foreach(s=> println(s"$s"))
println("\nStep 6: Convert the Scala Range into collections")
  val listFrom1to5 = (1 to 5).toList
  println(s"Range to list = ${listFrom1to5.mkString("")}")
  val setFrom1to5 = (1 to 5).toSet
  println(s"Range to set = ${setFrom1to5.mkString("")}")
  val sequenceFrom1To5 = (1 to 5).toSeq
  println(s"Range to sequence = ${sequenceFrom1To5.mkString("")}")
  val arrayFrom1To5 = (1 to 5).toArray
  println(s"Range to array = ${arrayFrom1To5.mkString("")}")

}
