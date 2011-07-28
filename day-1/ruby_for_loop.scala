def rubyStyleForLoop {
    println( "for loop using Ruby-style iteration" )
    args.foreach { arg =>
        println(arg)
    }
}

rubyStyleForLoop

// vim: set ts=4 sw=4 et:
