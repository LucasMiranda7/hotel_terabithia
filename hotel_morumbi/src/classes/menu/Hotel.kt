package classes.menu

import classes.cadastro.Cadastro
import classes.cadastro.NomeHospede
import classes.quartos.Diarias
import classes.quartos.EscolhaQuarto
import classes.quartos.Quartos

class Hotel {
    fun hotel() {
        val quartos = Quartos()
        val diarias = Diarias()
        val validaUsuario = ValidaUsuario()
        val nomeHospedador = NomeHospede()
        val escolhaQuarto = EscolhaQuarto(quartos, validaUsuario)
        val cadastro = Cadastro(escolhaQuarto, nomeHospedador)
        val menu = Menu(validaUsuario, cadastro)
        validaUsuario.user()
        menu.menu()
    }
}