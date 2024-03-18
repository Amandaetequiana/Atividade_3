package lambdas



data class Alunos(val nome: String, val nota: Double)

fun main(args: Array<String>) {
    val alunos = arrayListOf(
        Alunos("Pedro", 7.4),
        Alunos("Arthur", 8.0),
        Alunos("Rafael", 9.7),
        Alunos("Ricardo", 5.7)
    )

    val aprovados = alunos.filter { it.nota > 7.0}.sortedBy {it.nome }
    println(aprovados)

}