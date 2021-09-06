package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario(nome = "João", salario = 2000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)
    val funcionarios3 = setOf(joao, pedro, maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    val resultIntersect = funcionarios3.intersect(funcionarios2)

    resultUnion.forEach { println(it) }
    println("-----------------------")
    resultSubtract.forEach { println(it)}
    println("-----------------------")
    resultIntersect.forEach { println(it)}
}