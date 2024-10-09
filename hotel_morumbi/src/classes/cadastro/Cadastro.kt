package classes.cadastro

import classes.quartos.Diarias
import classes.quartos.EscolhaQuarto

class Cadastro(private val escolhaQuarto: EscolhaQuarto, private var nomeHospede: NomeHospede) {
    fun cadastrarHospedes(){
        nomeHospede.nomeHospede()
        escolhaQuarto.escolha()
    }
}