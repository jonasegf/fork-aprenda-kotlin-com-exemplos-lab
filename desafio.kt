import java.util.UUID

// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val id: UUID = UUID.randomUUID(), val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    private val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Matricula realizada para o user: $usuario")
    }
}

fun main() {
    val usuario = Usuario(nome = "John")
    val usuario2 = Usuario(nome = "Paulo")

    val conteudo1 = ConteudoEducacional("Introdução à Kotlin")
    val conteudo2 = ConteudoEducacional("Introdução à Databases")
    val conteudo3 = ConteudoEducacional("Introdução à Cloud Storage")

    val formacao1 = Formacao("Formacao Desenvolvedor Feliz", Nivel.BASICO, listOf(conteudo1, conteudo2, conteudo3))

    formacao1.matricular(usuario)
    formacao1.matricular(usuario2)

    println(formacao1.toString())
}
