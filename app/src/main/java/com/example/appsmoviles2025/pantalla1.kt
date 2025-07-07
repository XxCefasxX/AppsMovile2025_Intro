import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavController


@Composable
fun pantalla1(navController: NavController) {
    var texto by remember { mutableStateOf("") }
    Column {
        TextField(
            value = texto,
            onValueChange = { texto = it }
        )
        Button(
            onClick = {
                navController.navigate("segunda_pantalla/${texto}")
            }
        ) { Text("ir a pantalla 2") }
    }
}