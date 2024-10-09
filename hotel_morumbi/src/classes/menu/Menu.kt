package classes.menu

import classes.cadastro.Cadastro
import classes.quartos.Diarias

class Menu(private val validaUsuario: ValidaUsuario, private val cadastro: Cadastro) {

    fun menu() { //é um metodo

        println("Bem vindo ao Hotel Morumbi, ${validaUsuario.nomeUser()} . É um imenso prazer ter você por aqui!")

        val escolha = readln().toIntOrNull()
        when (escolha) {
            1 -> cadastro.cadastrarHospedes()

            else -> erro()
        }
    }

    private fun erro() {
        println("Muito obrigado e até logo, ${validaUsuario.nomeUser()}.")
    }
}
