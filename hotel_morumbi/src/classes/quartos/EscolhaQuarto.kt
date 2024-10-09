package classes.quartos

import classes.cadastro.NomeHospede
import classes.menu.ValidaUsuario
import objetos.NomeUser

class EscolhaQuarto(
    private val quartos: Quartos,
    private val validaUsuario: ValidaUsuario
) {
    fun escolha() {
        val diaria = Diarias().diaria()
        val multi = mute(diaria)
        val dias = dias(diaria)
        quartos.mostrarArmazemQuartos().forEach(::println) // :: Mostrar cada elemento de uma lista

        var repetir = true

        while (repetir) {
            println("Selecione o Quarto: (1-20) ")
            val _quarto = readln() + "-livre;"

            if (quartos.mostrarArmazemQuartos().contains(_quarto)) {
                println("livre")
                println("${validaUsuario.nomeUser()} você confirma a hospedagem para ${NomeUser.name} por $dias para o quarto ${_quarto.removeSuffix("-livre;")} por $multi ? (S) para SIM / (N) para Não")
                when {
                    readln().equals("S", ignoreCase = true) -> println("${validaUsuario.nomeUser()}, reserva efetuada para ${NomeUser.name}");
                    readln().equals("N", ignoreCase = true) -> break;
                }
                repetir = false
            } else {
                println("Ocupado!")
            }
        }
    }

    fun mute(diaria: DateDiarias): Double{
        return diaria.diarias * diaria.dias
    }

    fun dias(diaria: DateDiarias): Int{
        return diaria.dias
    }
}