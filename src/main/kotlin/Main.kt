import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
@Preview
fun App() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) { // Usa fillMaxSize para ocupar toda la pantalla
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                "Título",
                modifier = Modifier.padding(top = 16.dp),
                fontSize = TextUnit(value = 40f, type = TextUnitType.Sp)
            )
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                "Historias",
                modifier = Modifier.padding(top = 16.dp),
                fontSize = TextUnit(value = 15f, type = TextUnitType.Sp)
            )
        }
        Card(modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)) {
            Row(modifier = Modifier.background(Color.LightGray)) {
                historias.forEach { historias ->
                    Column(modifier = Modifier.padding(8.dp)) {
                        Image(
                            painter = painterResource(resourcePath = historias.image),
                            contentDescription = "Foto",
                            modifier = Modifier
                                .size(80.dp)
                                .clip(CircleShape)
                        )
                        Text(
                            text = historias.name,
                            modifier = Modifier.padding(top = 4.dp)
                        )
                    }
                }
            }
        }
        Row(modifier = Modifier.fillMaxSize()) { // Usa fillMaxSize para ocupar el resto de la pantalla
            Column(modifier = Modifier.weight(1f).padding(end = 8.dp)) {
                Text(
                    "Publicaciones",
                    modifier = Modifier.padding(bottom = 8.dp),
                    fontSize = TextUnit(value = 20f, type = TextUnitType.Sp)
                )
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    backgroundColor = Color.LightGray
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        message.forEach { message ->
                            Column(modifier = Modifier.padding(vertical = 8.dp)) {
                                Row(modifier = Modifier.padding(vertical = 8.dp)) {
                                    Image(
                                        painter = painterResource(resourcePath = message.image),
                                        contentDescription = "Foto",
                                        modifier = Modifier
                                            .size(50.dp)
                                            .clip(CircleShape)
                                    )
                                    Text(
                                        text = message.name,
                                        modifier = Modifier.padding(start = 8.dp)
                                    )
                                }
                                Image(
                                    painter = painterResource(resourcePath = message.image2),
                                    contentDescription = "Foto",
                                    modifier = Modifier.height(180.dp).width(680.dp)
                                )
                                Text(
                                    text = message.message,
                                    modifier = Modifier.padding(bottom = 8.dp)
                                )
                            }
                        }
                    }
                }
            }
            Column(modifier = Modifier.weight(1f).padding(start = 8.dp)) {
                Text(text = "Sugerencias", modifier = Modifier.padding(bottom = 8.dp))
                Card(
                    modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
                    backgroundColor = Color.LightGray
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        sugerencias.forEach { sugerencias ->
                            Row(modifier = Modifier.padding(vertical = 4.dp)) {
                                Image(
                                    painter = painterResource(resourcePath = sugerencias.image),
                                    contentDescription = "Foto",
                                    modifier = Modifier
                                        .size(50.dp)
                                        .clip(CircleShape)
                                )
                                Text(
                                    text = sugerencias.name,
                                    modifier = Modifier.padding(start = 8.dp),
                                    fontSize = TextUnit(value = 20f, type = TextUnitType.Sp)
                                )
                            }
                        }
                    }
                }
                Text(text = "Publicidad", modifier = Modifier.padding(bottom = 8.dp))
                Card(modifier = Modifier.fillMaxWidth(), backgroundColor = Color.LightGray) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        fotos.forEach { fotos ->
                            Image(
                                painter = painterResource(resourcePath = fotos.image),
                                contentDescription = "Foto",
                                modifier = Modifier
                                    .size(200.dp)
                                    .clip(CircleShape)
                            )
                        }
                    }
                }
            }
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "FakeInsta",
        state = rememberWindowState(width = 1425.dp, height = 900.dp)
    ) {
        App()
    }
}


