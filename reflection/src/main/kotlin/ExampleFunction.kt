class Property(var a: Float)

const val x = 10;

fun main(args: Array<String>) {
    // Property Reference for a package level property
    val z = ::x
    println(z.get())
    println(z.name)

    // Property Reference for a class property
    val y = Property::a
    println(y.get(Property(5.899f)))
}