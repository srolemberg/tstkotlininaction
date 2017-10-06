package br.com.samirrolemberg.c2xx

fun main(args: Array<String>) {
    val nome = if (args.size > 0) args[0] else "Kotlin"
    println("ARGS: $nome!")//template string
    println("ARGS: ${args[0]}!")//template string tipo complexo
    println("ARGS: $args!")//template string
}