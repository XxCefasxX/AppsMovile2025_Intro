import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun PeliculasNavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = peliculasPantallas.lista.route) {
        composable(peliculasPantallas.lista.route) {
            ListaPeliculas(navController)
        }
        composable(
            peliculasPantallas.detalles.route,
            arguments = listOf(navArgument("peliculaid") { type = NavType.IntType })
        ) { parametros ->
            val peliculaid = parametros.arguments?.getInt("peliculaid") ?: 0
            DetallesPelicula(peliculaid)
        }
    }
}