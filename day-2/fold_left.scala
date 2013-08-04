// Use foldLeft to count the total size of a list of strings
val list = List("one", "two", "three", "four")

list.foldLeft(0)((sum, word) => sum + word.size)
