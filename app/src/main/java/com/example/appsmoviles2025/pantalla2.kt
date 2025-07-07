import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun pantalla2(navController: NavController, texto: String) {
   Column {
       Text(
           text = texto
       )
       Button(
           onClick = {
               navController.navigate(route = menuPantllas.primerPantalla.route)
           }
       ) { Text("ir a pantalla 1") }
   }
}