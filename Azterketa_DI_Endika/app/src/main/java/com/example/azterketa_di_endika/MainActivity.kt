package com.example.azterketa_di_endika

import android.graphics.Color.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.azterketa_di_endika.ui.theme.Azterketa_DI_EndikaTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Azterketa_DI_EndikaTheme {
                Greeting()
            }
        }
    }
}

    @Preview(showBackground = true)
    @Composable
    fun Greeting() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Cyan)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .weight(0.6f)
                    .background(color = Color.Gray),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                repeat (2) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Absolute.Right,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Hello Android!",
                            Modifier.background(color = Color.Red)
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier,
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Hello Android!",
                            Modifier.background(color = Color.Red)
                        )
                    }

                    Column(
                        modifier = Modifier,
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Hello Android!",
                            Modifier.background(color = Color.Red)
                        )
                    }
                }
            }

            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .width(200.dp)
                    .weight(0.5f)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .weight(1f),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Hello Android!",
                    )
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .weight(1f)
                    .background(color = Color.Green)
            ) {
                repeat(3) {
                    val colores = listOf(Color.Blue, Color.Magenta, Color.Black)
                    var numero = 1

                    Row(modifier = Modifier.fillMaxSize()) {

                        repeat(3) { col ->
                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(horizontal = 16.dp)
                                    .fillMaxHeight()
                                    .background(colores[col]),
                                verticalArrangement = Arrangement.SpaceEvenly,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                repeat(3) {
                                    Button(
                                        onClick = {},
                                        modifier = Modifier.size(60.dp)
                                    ) {
                                        Text(numero.toString())
                                    }
                                    numero++
                                }
                            }
                        }
                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .background(color = Color.Yellow)
                    .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Resultado:")
                Text("666")
            }
        }
    }