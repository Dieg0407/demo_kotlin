package com.demo.film.demos


fun main() {
    val demo1 = "Esto es una variable string nro 01"
    var demo2: String? = "Esto es una variable string nro 02"

    println(demo1)
    println(demo2)

    println(agregarDatos(demo1))
    // println(agregarDatos(demo2))
    println(agregarDatos(demo2?:"Este es el valor por defecto"))
    println(agregarDatos(demo2!!)) // <-- indica explicitamente que puede botar una excepcion

    println(agregarDatosNulo(demo1))
    println(agregarDatosNulo(demo2))

    demo2 = null
    operacionNula(demo2!!)
}

fun agregarDatos(string: String): String = "$string <- nunca será nulo"

fun agregarDatosNulo(string: String?) = "$string <- puede ser nulo"

fun operacionNula(string: String) = string.plus("1111")