package one.digitalinnovation.collection

data class Funcionario(
val nome: String,
val salario: Double,
val tipoContratacao: String
){
    override fun toString(): String {
        return """
            nome:    $nome
            salario: $salario
        """.trimIndent()
    }
}
