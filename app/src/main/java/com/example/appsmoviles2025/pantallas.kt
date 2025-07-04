import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.appsmoviles2025.R
import com.example.appsmoviles2025.edades
import com.example.appsmoviles2025.validaImagen

@Composable
fun RegistroPersona() {

    var listaPersonas = remember { mutableStateListOf<persona>() }
    var nombre by remember { mutableStateOf("") }
    var apellidoP by remember { mutableStateOf("") }
    var apellidoM by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf(0) }
    var genero by remember { mutableStateOf("") }


    Column {
        //Nombre
        TextField(
            value = nombre,
            onValueChange = { nombre = it }
        )
        //Apellidos
        Row {
            TextField(
                value = apellidoP,
                onValueChange = { apellidoP = it }
            )
            TextField(
                value = apellidoM,
                onValueChange = { apellidoM = it }
            )
        }
        //Edad y genero
        Row {
            TextField(
                value = edad.toString(),
                onValueChange = { edad = it.toInt() }
            )
            TextField(
                value = genero,
                onValueChange = { genero = it }
            )
        }
        //Boton
        Row {
            Button(
                onClick = {

                    val p = persona(nombre, apellidoP, apellidoM, edad, genero)
                    listaPersonas.add(p)
                }
            ) { Text("OK") }
        }


        LazyColumn {
            items(listaPersonas) { _persona ->
                Text(
                    text = _persona.nombre,
                    modifier = Modifier.padding(5.dp)
                )
                Text(
                    text = _persona.apellidoP,
                    modifier = Modifier.padding(5.dp)
                )
                Text(
                    text = _persona.apellidoM,
                    modifier = Modifier.padding(5.dp)
                )
                Text(
                    text = _persona.edad.toString(),
                    modifier = Modifier.padding(5.dp)
                )
                Text(
                    text = edades(_persona.edad),
                    modifier = Modifier.padding(5.dp)
                )
                Text(
                    text = _persona.genero,
                    modifier = Modifier.padding(5.dp)
                )

                Image(
                    painter = painterResource(validaImagen(edad, genero)),
                    contentDescription = "imagen"
                )
            }
        }
    }
}
