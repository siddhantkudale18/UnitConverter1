package com.example.unitconverter1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.unitconverter1.ui.theme.UnitConverter1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnitConverter1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Wrap multiple composables in a Column
                    Column(modifier = Modifier.padding(innerPadding)) {
                        UnitConverter() // Now this will render properly
                    }
                }
            }
        }
    }
}

@Composable
fun UnitConverter() {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        // Here all th UI elements will be stacked below each other
        Text("Unit Converter")
        OutlinedTextField(value = "Enter a value", onValueChange = {})

        Row {
            Box{
                Button(onClick = {}) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")
                }
            }
            Box{
                Button(onClick = {}) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")
                }
            }
            // Here all th UI elements will be stacked below each other

        }
        Text("Result:")
    }


}

@Preview(showBackground = true)
@Composable
fun UnitConverter1Pewview(){
    UnitConverter()
}

