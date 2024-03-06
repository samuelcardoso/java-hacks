package com.example

import Builder

@Builder
class SampleClass(private val a: Int, private val b: String, private val c: Double) {
    fun sampleMethod() = "$a, $b, $c"
}

fun main() {
    val builder = SampleClassBuilder()
    builder
        .withA(1)
        .withB("foo")
        .withC(2.3)
    val sampleClass : SampleClass = builder.build()
    println(sampleClass.sampleMethod())
}