@main def happyBirthday(age: Int, name: String) = 

  val suffix = (age % 100) match
    case 11 | 12 | 13 => "th"
    case _ => (age % 10) match
      case 1 => "st"
      case 2 => "nd"
      case 3 => "rd"
      case _ => "th"
  
  val stringBuilder = StringBuilder(s"Happy $age$suffix birthday $name!")

  println("Hello world!")
  println(stringBuilder.toString)
  println(msg)

def msg = "I was compiled by Scala 3. :)"
