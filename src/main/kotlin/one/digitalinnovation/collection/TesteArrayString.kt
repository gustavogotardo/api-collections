package one.digitalinnovation.collection

fun main() {
    val nomes = Array(3) {""}
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")

    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }
    println("----------------------------")
    nomes.sort()
    nomes.forEach {
        println(it)
    }
    println("----------------------------")
    nomes2.sort()
    nomes2.forEach { println(it) }

}