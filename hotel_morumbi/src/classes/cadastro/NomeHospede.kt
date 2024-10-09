package classes.cadastro

import objetos.NomeUser

class NomeHospede {
    fun nomeHospede(){
    println("Informe o nome do Hospede: ")
    var nomeUser = readln()
        NomeUser.name = nomeUser
    }
}