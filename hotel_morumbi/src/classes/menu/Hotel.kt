package classes.menu

import Usuario.InfoUsuario

class Hotel {
    fun hotel() {
        val validaUsuario = ValidaUsuario()
        val menu = Menu(validaUsuario)
        validaUsuario.user()
        menu.menu()
    }
}