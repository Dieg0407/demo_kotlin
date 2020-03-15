package com.demo.film.demos

import com.fasterxml.jackson.databind.ObjectMapper
import java.util.*

fun <T> parseJson(data: String, clase: Class<T>): Optional<T> =
    try {
        Optional.of(ObjectMapper().readValue(data, clase))
    }
    catch (e: Exception) {
        Optional.empty()
    }

fun objToJson(obj: Any): Optional<String> =
    try {
        Optional.of(ObjectMapper().writeValueAsString(obj))
    }
    catch (e: Exception) {
        Optional.empty()
    }



