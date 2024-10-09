package classes.quartos

class Quartos {
    val quartos =
        "1-livre; 2-livre; 3-livre; 4-livre; 5-ocupado; 6-livre; 7-ocupado; 8-livre; 9-livre; 10-livre; 11-livre; 12-livre; 13-livre; 14-livre; 15-livre; 16-livre; 17-livre; 18-livre; 19-livre; 20-ocupado"
    val armazemQuartos = quartos.split(" ").toTypedArray()


    fun mostrarArmazemQuartos(): List<String> {
        return armazemQuartos.toList()
    }
}