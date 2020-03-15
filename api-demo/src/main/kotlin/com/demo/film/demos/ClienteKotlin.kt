package com.demo.film.demos

data class ClienteKotlin (
        var nombres: String = "",
        var apellidos: String = "",
        var dni: String = "",
        var edad: Int = 0
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
}