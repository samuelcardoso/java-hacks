class ReflectionDemo

fun main(args: Array<String>) {
    // Reference obtained using class name
    val abc = ReflectionDemo::class
    println("This is a class reference $abc")

    // Reference obtained using object
    val obj = ReflectionDemo()
    println("This is a bounded class reference ${obj::class}")
}