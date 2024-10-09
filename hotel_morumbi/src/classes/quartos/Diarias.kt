package classes.quartos

class Diarias() {
    fun diaria(): DateDiarias {
        println("Qual valor da diária?")
        val diaria = readln().toDouble()

        when {
            diaria <= 0.0 -> {
                println("Valor Inválido!")
                diaria()
            }
        }
        println("Quantas diarias você quer?")
        val dias = readln().toInt()

        when {
            dias <= 0 || dias > 30 -> {
                println("Valor Inválido!")
                diaria()
            }
        }
        return DateDiarias(diaria, dias)

    }




}