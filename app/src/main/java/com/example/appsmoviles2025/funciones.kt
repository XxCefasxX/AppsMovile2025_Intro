package com.example.appsmoviles2025

fun edades(edad: Int): String {
    return "la persona es un adulto"
}

fun validaImagen(edad: Int, genero: String): Int {
    return when (genero) {
        "H" -> {
            return when (edad) {
                1 -> R.drawable.trifuerza
                2 -> R.drawable.trifuerza
                3 -> R.drawable.trifuerza
                4 -> R.drawable.trifuerza
                else -> R.drawable.trifuerza
            }
        }
        "M" -> {
            return when (edad) {
                1 -> R.drawable.trifuerza
                2 -> R.drawable.trifuerza
                3 -> R.drawable.trifuerza
                4 -> R.drawable.trifuerza
                else -> R.drawable.trifuerza
            }
        }
        else -> R.drawable.trifuerza
    }
}