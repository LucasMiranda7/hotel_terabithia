package Usuario

class InfoUsuario {
    fun info(): Usuario{
        println("Qual é seu nome? ")
        val nome = readln()
        println("Informe sua Senha: ")
        val senha = readln().toInt()
        return Usuario(nome, senha)
    }
}