package classes.menu

import Usuario.InfoUsuario

class ValidaUsuario() {

    val userinfo = InfoUsuario().info()

    fun user() {



        if (userinfo.senha == 2678) {
            println("Acesso Aprovado!")
        } else {
            println("Acesso Negado!")
            user()
        }

    }

    fun nomeUser(): String{
        return  userinfo.nome
    }


}
