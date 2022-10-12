import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.findAnnotation

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class Foo(val prop1: String = "")

data class Bar(@Foo("baz") val id: Int)

fun main(args: Array<String>) {
    val obj = Bar(123)
    val idProp = obj::class.declaredMemberProperties.first { it.name == "id" }
    val barAnnotation = idProp.findAnnotation<Foo>()
    println("Value of my annotation: " + barAnnotation?.prop1)
}