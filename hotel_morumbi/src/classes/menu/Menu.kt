package classes.menu


class Menu(private val validaUsuario: ValidaUsuario) {

    fun menu() { //é um metodo

        println("Bem vindo ao Hotel Morumbi, ${validaUsuario.nomeUser()} . É um imenso prazer ter você por aqui!")

        val escolha = readln().toIntOrNull()
        when (escolha) {
            1 -> println(1)

            else -> erro()
        }
    }

    private fun erro() {
        println("Muito obrigado e até logo, ${validaUsuario.nomeUser()}.")
    }
}
