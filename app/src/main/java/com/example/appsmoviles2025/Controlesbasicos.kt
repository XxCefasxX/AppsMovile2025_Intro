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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.appsmoviles2025.ui.theme.AppsMoviles2025Theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable

class ComtrolesBasicos : ComponentActivity() {
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
//
//@Composable
//fun FullPage() {
//    Scaffold(modifier = Modifier.fillMaxSize().statusBarsPadding()) { innerPadding ->
//        Contendido(
//            modifier = Modifier.padding(innerPadding)
//        )
//    }
//}
//
//
//@Composable
//fun Contendido(modifier: Modifier = Modifier) {
//    TextTest()
//}
//
//@Composable
//fun TextTest() {
//    Text("Prueba de texto", modifier = Modifier.background(Color.Red))
//}
//@Composable
//fun ButtonTest() {
//Button(onClick = {},
//    colors = ButtonDefaults.buttonColors(
//    containerColor = Color.Red, // Color de fondo
//    contentColor = Color.White // Color del texto
//)) { Text("este es un boton") }
//}
//
//@Composable
//fun ButtonTestToast() {
//    val context = LocalContext.current
//
//    Button(
//        onClick = {
//            Toast.makeText(
//                context,
//                "¡Mensaje toast!",
//                Toast.LENGTH_SHORT
//            ).show()
//        }
//    ) {
//        Text("Mostrar Toast")
//    }
//}
//@Composable
//fun TextFieldTest(){
//    TextField(value = "", onValueChange = {})
//}
//@Composable
//fun ImageTest(){
//    Image(
//        painter = painterResource(R.drawable.trifuerza),
//        contentDescription = ""
//    )
//}
//
//@Composable
//fun ColumnTest(){
//    Column() {  }
//}
//@Composable
//fun BotonContador(){
////    var contador by rememberSaveable  { mutableStateOf(0) }
//    var contador by remember { mutableStateOf(0) }
//    Column {
//        Button(onClick = {contador++}) { Text("+") }
//        Button(onClick = {contador--}) { Text("-") }
//        Text(contador.toString())
//    }
//
//}
//
//@Composable
//fun BotonSaludo() {
//    // Estado para el TextField
//// Estados corregidos
//    var name by remember { mutableStateOf("") }
//    var texto by remember { mutableStateOf("") }
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.spacedBy(16.dp)
//    ) {
//        // TextField para entrada de texto
//        TextField(
//            value = name,
//            onValueChange = { name = it },
//            label = { Text("Ingresa tu nombre") },
//            modifier = Modifier.fillMaxWidth()
//        )
//
//        // Botón que genera el saludo
//        Button(
//            onClick = {
//                texto = if (name.isNotBlank()) "Hola $name!" else "Hola desconocido!"
//            },
//            modifier = Modifier.padding(top = 8.dp)
//        ) {
//            Text("Saludar")
//        }
//
//
//        // Texto que muestra el saludo
//        Text(
//            text = texto,
//            modifier = Modifier.background(Color.Red)
//        )
//    }
//}
//
