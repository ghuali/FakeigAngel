
data class Historias(val name: String, val image: String)
data class Sugerencias(val name: String, val image: String)
data class Fotos(val image: String)
data class Message(val name: String, val message: String, val image: String, val image2: String)

val historias = listOf<Historias>(
    Historias("Angel", "imagenes/download.jpg"),
    Historias("Alvaro", "imagenes/header.jpg"),
    Historias("Andrei", "imagenes/Andrei.jpg"),
    Historias("Angie", "imagenes/Angie.jpg"),
    Historias("Samuel", "imagenes/Samu.jpg"),
    Historias("Alejandro", "imagenes/Alejandro.jpg"),
    Historias("Joel", "imagenes/joel.jpg"),
    Historias("Samuele", "imagenes/Samuele.jpg"),
    Historias("Haco", "imagenes/Hacp.jpg"),
)
val sugerencias = listOf<Sugerencias>(
    Sugerencias("Haco", "imagenes/Hacp.jpg"),
    Sugerencias("Samuele", "imagenes/Samuele.jpg"),
)
val fotos = listOf<Fotos>(
    Fotos("imagenes/Metaphor.jpg"),
    Fotos("imagenes/publi2.jpeg"),
)
val message = listOf<Message>(
    Message("Alvaro", "Me gusta el marvel rivals.", "imagenes/header.jpg", "imagenes/marvel-rivals-wq3mr.png"),
    Message("Andrei", "Fui a Japon gente.", "imagenes/Andrei.jpg", "imagenes/publicacion2.jpg"),
)