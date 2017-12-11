package br.com.samirrolemberg.c2xx.c212

fun main(args: Array<String>) {
    println(max(123, 456))
    println(min(123, 456))
    println(eq(123, 456))
}

//função de corpo e bloco (block body)
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//função de expressão (expression body)
fun min(a: Int, b: Int): Int = if (a < b) a else b

//função de expressão (expression body) retorno omitido (type inference)
fun eq(a: Int, b: Int) = if (a == b) a+b else a-b
