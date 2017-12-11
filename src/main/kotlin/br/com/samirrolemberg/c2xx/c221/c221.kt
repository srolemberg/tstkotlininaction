package br.com.samirrolemberg.c2xx.c221

//tipo é descrito depois da variavel na assinatura do metodo
fun main(args: Array<String>) {//Array de Kotlin = Java[]
    val person = Person("Name", true)

    println(person.name)
    println(person.isMarried)
    println(person.toString())
}
