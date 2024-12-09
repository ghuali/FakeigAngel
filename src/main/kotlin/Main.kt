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
    Column(modifier = Modifier.padding(start = 15.dp, end = 15.dp)) {
        Row() {
            Text("Título", modifier = Modifier.padding(top = 20.dp), fontSize = TextUnit(value = 40f, type = TextUnitType.Sp))
        }
        Row() {
            Text("Historias", modifier = Modifier.padding(top = 10.dp, start = 10.dp), fontSize = TextUnit(value = 15f, type = TextUnitType.Sp))
        }
        Card(modifier = Modifier.fillMaxWidth()){
            Row(modifier = Modifier.background(Color.LightGray)) {
                historias.forEach { historias ->
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(resourcePath = historias.image),
                            contentDescription = "Foto",
                            modifier = Modifier.size(width = 80.dp, height = 80.dp).clip(CircleShape)
                        )
                        Column(modifier = Modifier.padding(start = 10.dp)) {
                            Text(modifier = Modifier.padding(top = 5.dp), text = historias.name)
                        }
                    }
                }
            }
        }
        Row {
            Column {
                Text("Publicaciones", modifier = Modifier.padding(top = 10.dp), fontSize = TextUnit(value = 20f, type = TextUnitType.Sp))
                Card(modifier = Modifier.fillMaxHeight().width(450.dp).padding(bottom = 10.dp), backgroundColor = Color.LightGray) {
                    Column(modifier = Modifier.padding(10.dp)) {
                        message.forEach { message ->
                            Column(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                                Image(
                                    painter = painterResource(resourcePath = message.image2),
                                    contentDescription = "Foto"
                                )
                                Row(modifier = Modifier.padding(bottom = 10.dp)) {
                                    Image(
                                        painter = painterResource(resourcePath = message.image),
                                        contentDescription = "Foto",
                                        modifier = Modifier.size(50.dp).padding(top = 5.dp).clip(CircleShape)
                                    )
                                    Text(modifier = Modifier.padding(top = 10.dp, start = 10.dp), text = message.name)
                                }
                                Text(modifier = Modifier.padding(bottom = 10.dp), text = message.message)
                            }

                        }
                    }
                }
            }
            Column {
                Text(text = "Sugerencias")
                Card(modifier = Modifier.width(450.dp).padding(bottom = 10.dp), backgroundColor = Color.LightGray) {
                    Column(modifier = Modifier.padding(10.dp)) {
                        sugerencias.forEach { sugerencias ->
                            Row{
                                Image(
                                    painter = painterResource(resourcePath = sugerencias.image),
                                    contentDescription = "Foto",
                                    modifier = Modifier.size(50.dp).padding(top = 5.dp).clip(CircleShape)
                                )
                                Text(text = sugerencias.name, modifier = Modifier.padding(top = 10.dp),
                                    fontSize = TextUnit(value = 20f, type = TextUnitType.Sp))
                            }
                        }
                    }
                }
                Text(text = "Fotos")
                Card(modifier = Modifier.width(450.dp).padding(bottom = 10.dp), backgroundColor = Color.LightGray) {
                    Row(modifier = Modifier.padding(10.dp)) {
                        fotos.forEach { fotos ->
                            Image(
                                painter = painterResource(resourcePath = fotos.image),
                                contentDescription = "Foto",
                                modifier = Modifier.size(50.dp).padding(top = 5.dp).clip(CircleShape)
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
