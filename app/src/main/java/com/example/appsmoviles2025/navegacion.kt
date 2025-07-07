import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun navegacion() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = menuPantllas.primerPantalla.route) {
        composable(menuPantllas.primerPantalla.route) {
            pantalla1(navController)
        }
        composable(
            menuPantllas.segundaPantalla.route,
            arguments = listOf(navArgument("texto") { type = NavType.StringType })
        ) { asd ->
            val texto = asd.arguments?.getString("texto") ?: ""
            pantalla2(navController, texto)
        }
    }
}