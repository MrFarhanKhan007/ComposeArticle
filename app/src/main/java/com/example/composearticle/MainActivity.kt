package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeArticleImage(
                        Heading1 = "Jetpack Compose tutorial",
                        paragraph1 = "Jetpack Compose is a modern toolkit for building native Android UI." +
                                " Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                        paragraph2 = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\'s construction, " +
                                "such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
                    )
                }
            }
        }
    }
}
@Composable
fun ComposeArticleImage(Heading1: String, paragraph1: String, paragraph2: String) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column() {
        Image(
            painter = image, contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
        )
        ComposeArticleText(Heading1 = Heading1, paragraph1 = paragraph1, paragraph2 = paragraph2)
    }
}
@Composable
fun ComposeArticleText(Heading1: String, paragraph1: String, paragraph2: String) {
    Column (modifier = Modifier.fillMaxWidth()){
        Text(
            text = Heading1,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp),
            )
        Text(
            text = paragraph1,
            modifier = Modifier.padding(end = 16.dp, start = 16.dp)
        )
        Text(
            text = paragraph2,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = false)
@Composable
fun ComposeArticleImagePreview() {
    ComposeArticleTheme {
        val Heading1 = ""
        val paragraph1 = ""
        val paragraph2 = ""
        ComposeArticleImage(Heading1 = Heading1, paragraph1 = paragraph1, paragraph2 = paragraph2)
    }
}