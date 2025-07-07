import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

val listaPeliculas = listOf(
    Pelicula(1, "Volver al futuro", "Ciencia ficcion", "viaje en el tiempo en un delorean", ""),
    Pelicula(2, "Boyka", "Peleas", "peleas en la carcel", ""),
    Pelicula(3, "Avengers", "Accion", "los vengadores mas fuertes", "")
)


@Composable
fun ListaPeliculas(navController: NavController) {
    val peliculas = remember { listaPeliculas }

    //mostrar nombre y genero de la pelicula
    LazyColumn {
        items(peliculas) { pelicula ->
            Card(
                onClick = {
                    navController.navigate("detalles/${pelicula.id}")
                },
                modifier = Modifier.padding(8.dp)
            ) {
                Column {
                    Text(
                        text = pelicula.titulo
                    )
                    Text(
                        text = pelicula.genero
                    )
                }
            }
        }
    }
}


@Composable
fun DetallesPelicula(peliculaId: Int) {

    val pelicula = listaPeliculas[peliculaId]
    //mostrar informacion de la pelicula
    Text(
        text = "Titulo: ${pelicula.titulo}"
    )
}