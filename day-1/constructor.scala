class Person(first_name: String) {
  println("Outer contstructor")
  def this(first_name: String, last_name: String) {
    this(first_name)
    println("Inner constructor")
  }
  def talk() = println("Hi")
}

val bob = new Person("Bob")
val bobTate = new Person ("Bob", "Tate")
