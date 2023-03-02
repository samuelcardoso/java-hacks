import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.findAnnotation

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class Log(val level: String = "")

data class Movie(@Log("DEBUG") val id: Int)

fun main(args: Array<String>) {
    val movie = Movie(123)
    val idMovie = movie::class.declaredMemberProperties.first { it.name == "id" }
    val logAnnotation = idMovie.findAnnotation<Log>()
    println("Value of my log: " + logAnnotation?.level)
}