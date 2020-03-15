package com.demo.film.demos

data class ClienteKotlin (
        var nombres: String = "",
        var apellidos: String = "",
        var dni: String = "",
        var edad: Int = 0,
        var telefono: String? = null
)

fun main() {
    val cliente = ClienteKotlin()
    cliente.nombres = "Diego"
    cliente.apellidos = "Pastor"
    cliente.dni = "1111"
    cliente.edad = 21

    val cliente2 = ClienteKotlin(
            nombres = "ruben",
            apellidos = "pastor",
            dni = "44444",
            edad = 40
    )

    val cliente3 = ClienteKotlin(
            "alejandro",
            "pastor",
            "5555",
            40
    )
    println(cliente)
    println(cliente2)
    println(cliente3)

    // datos
    val clienteNulo1: ClienteKotlin? = null
    val clienteNulo2: ClienteKotlin? = ClienteKotlin(
            telefono = "123456789"
    )

    println("Cliente Nulo 1 sin valor por defecto: ${clienteNulo1?.telefono?.length}")
    println("Cliente Nulo 1 con valor por defecto: ${clienteNulo1?.telefono?:"1".length}")
    println("Cliente Nulo 2 con valor: ${clienteNulo2?.telefono?.length}")


    val (nombres, apellidos) = cliente
    println("Nombres y apellidos del cliente1: $nombres $apellidos")

    val number = 17
    val info = when (number % 2) {
        0 -> "Es un numero par"
        1 -> "Es un numero impar"
        else -> "F"
    }
    println(info)



}

