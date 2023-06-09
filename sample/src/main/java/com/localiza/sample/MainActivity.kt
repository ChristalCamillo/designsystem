package com.localiza.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.localiza.designsystem.lib.theme.LDSAppTheme

import com.localiza.sample.ui.theme.DesignsystemTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignsystemTheme {
            // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = LDSAppTheme.colors.accent.primary.default
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", Modifier.padding(LDSAppTheme.theme.spacing(2).dp))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DesignsystemTheme {
        Greeting("Android")
    }
}