val words = List("peg", "al", "bud", "kelly")

words.count(word => word.size > 2)

words.filter(word => word.size > 2)

words.map(word => word.size)

words.forall(word => word.size > 1)

words.exists( word => word.size > 4)

words.exists( word => word.size > 5)

words.sort( (s, t) => s.charAt(0).toLower < t.charAt(0).toLower )

words.sort( (s, t) => s.size < t.size )

val list = List(1, 2, 3)

val sum = (0 /: list) {(sum, i) => sum + i}

val list = List(1, 2, 3)

list.foldLeft(0)((sum, value) => sum + value)

