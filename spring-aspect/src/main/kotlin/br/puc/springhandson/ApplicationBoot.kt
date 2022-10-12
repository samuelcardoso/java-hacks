package br.puc.springhandson

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.EnableAspectJAutoProxy

@SpringBootApplication
@EnableAspectJAutoProxy
class ApplicationBoot

fun main(args: Array<String>) {
    runApplication<ApplicationBoot>(*args)
}