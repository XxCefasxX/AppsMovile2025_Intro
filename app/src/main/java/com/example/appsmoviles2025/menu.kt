sealed class menuPantllas(val route: String) {
    object primerPantalla : menuPantllas("primer_pantalla")
    object segundaPantalla : menuPantllas("segunda_pantalla/{texto}")
}

sealed class peliculasPantallas(val route: String) {
    object lista : peliculasPantallas("lista")
    object detalles : peliculasPantallas("detalles/{peliculaid}")
}