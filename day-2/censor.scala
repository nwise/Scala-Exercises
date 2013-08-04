// Write a Censor trait with method that will replace the curse words
// "Shoot" and "Darn" with "Pucky" and "Beans" alternatives.  Use a map to
// store the curse words and thier alternatives.


class Post {
}

trait Censor {
  def censored(text:String): String = {
    val curses = Map("shoot" -> "pucky", "darn" -> "beans", "Shoot" -> "Pucky", "Darn" -> "Beans")
    var words = text.split(" ")
    var clean = new String

    words.foreach{ word =>
      clean += check_word(curses, word) + " " 
    }

    return clean
  }

  def check_word(map:Map[String, String], word:String): String = {
    if( map.isDefinedAt(word)) map(word)
    else word
  }

}

class CensoredPost extends Post with Censor


val cleanPost = new CensoredPost
println(cleanPost.censored("Shoot Here is a darn sample post with bad words."))

