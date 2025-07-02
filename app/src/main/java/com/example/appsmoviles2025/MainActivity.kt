package com.example.appsmoviles2025

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appsmoviles2025.ui.theme.AppsMoviles2025Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppsMoviles2025Theme {
                FullPage()
            }
        }
    }
}

@Composable
fun FullPage() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
    ) { innerPadding ->
        Contendido(
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Composable
fun Contendido(modifier: Modifier = Modifier) {
    ListaNombres()
}


@Composable
fun TextTest() {
//    Text("Prueba de texto", modifier = Modifier.background(Color.Red))
    Text(
        "texto a mostrar de prueba",
        color = Color.Red,
        modifier = Modifier
            .background(Color.Blue)
            .padding(5.dp)
    )

}


@Composable
fun TextFieldTest() {
    TextField(
        value = "",
        onValueChange = {},
        modifier = Modifier.background(Color.Cyan)
    )
}

@Composable
fun ButtonTest() {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red, // Color de fondo
            contentColor = Color.White // Color del texto
        )
    ) { Text("este es un boton") }
}

@Composable
fun ImageTest() {
    Image(
        painter = painterResource(R.drawable.trifuerza),
        contentDescription = ""
    )
}

@Composable
fun Testing() {
    Text("Texto de prueba")
    Text("Texto de prueba 2")
    Text("Texto de prueba 3")
}

@Composable
fun ColumnTest() {
    Column {
        Text("Texto de prueba")
        Text("Texto de prueba 2")
        Text("Texto de prueba 3")
    }
}

@Composable
fun RowTest() {
    Row {
        Text("Texto de prueba")
        Text("Texto de prueba 2")
        Text("Texto de prueba 3")
    }
}


@Composable
fun BotonSaludo() {
    // Estado para el TextField
// Estados corregidos
    var name by remember { mutableStateOf("") }
    var texto by remember { mutableStateOf("") }
    Column(

    ) {
        // TextField para entrada de texto
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Ingresa tu nombre") },
            modifier = Modifier.fillMaxWidth()
        )

        // Botón que genera el saludo
        Button(
            onClick = {
                texto = "Hola $name!"
            },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("Saludar")
        }


        // Texto que muestra el saludo
        Text(
            text = texto,
            modifier = Modifier.background(Color.Red)
        )
    }
}

@Composable
fun BotonContador() {

    var contador by rememberSaveable { mutableStateOf(0) }
    Column {
        Button(onClick = { contador++ }) { Text("+") }
        Button(onClick = { contador-- }) { Text("-") }
        Text(contador.toString())
    }

}

@Composable
fun ButtonTestToast() {
    val context = LocalContext.current

    Button(
        onClick = {
            Toast.makeText(
                context,
                "¡Mensaje toast!",
                Toast.LENGTH_SHORT
            ).show()
        }
    ) {
        Text("Mostrar Toast")
    }
}

@Composable
fun ListasTest() {
//    val arreglo = arrayOf("Ema", "Gael", "Chuy", "Mr. Abundis")
//    arreglo[0] = "Emmanuel"
//    Text(text = arreglo[0])
//    val lista: List<String> = listOf("Ema", "Gael", "Chuy", "Mr. Abundis")
    val lista = mutableListOf(
        "Ema",
        "Gael",
        "Chuy",
        "Javier",
        "Mr. Abundis",
        "Julian",
        "Julius",
        "Max",
        "Max",
        "Max",
        "Max",
        "Max",
        "Max",
        "Max",
        "Max",
        "Yat",
        "Carlos",
        "Miguel",
        "Millan",
        "Comalito",
        "Toledo",
        "Alfredo",
        "Nelson",
        "Corazon"
    )
    // Text(text = lista[3])
    LazyColumn {
        items(lista) { persona ->
            Text(
                text = persona,
                modifier = Modifier.padding(10.dp)
            )
        }

    }
}


@Composable
fun ListaNombres() {
    //mostrar un textfield y boton que tome el valor del textfield
    var listanombres = rememberSaveable { mutableStateListOf<String>() }

    var name by remember { mutableStateOf("") }
    Column() {
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Ingresa tu nombre") },
            modifier = Modifier.fillMaxWidth()
        )
        Button(
            onClick = {
                listanombres.add(name)
            },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("Aceptar")
        }
        LazyColumn {
            items(listanombres) { persona ->
                Text(
                    text = persona,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
    }
}


























