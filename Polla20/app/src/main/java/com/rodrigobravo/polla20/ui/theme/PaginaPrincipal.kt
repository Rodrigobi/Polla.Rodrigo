package com.rodrigobravo.polla20.ui.theme


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rodrigobravo.polla20.R

@Composable
fun PaginaPrincipal() {
    var text by remember {
        mutableStateOf("")
    }
    //Columna de la pagina principal
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(modifier = Modifier.align(Alignment.CenterHorizontally),
            painter = painterResource(id = R.drawable.descarga),
            contentDescription = "Ulima")
        //Titulo de la aplicación

        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "Polla ULima",
            fontSize = 42.sp,
            fontWeight = FontWeight.Bold
        )
        //Espaciador, que seperara el titulo, el texto, caja de texto y el boton
        Spacer(modifier = Modifier.height(100.dp))
        //textos que indica los codigos de los estudiantes
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "20150634",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "20192247",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(50.dp))
        //caja de texto para ingresar el Codigo
        TextField(
            value = text, onValueChange = {
                text = it
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(100.dp))
        //Boton Ingresar
        Button(
            onClick = {

            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Text(text = "Ingresar")

        }
    }
}