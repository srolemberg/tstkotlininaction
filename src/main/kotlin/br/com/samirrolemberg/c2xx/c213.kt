package br.com.samirrolemberg.c2xx

import java.util.*

//inferencia do tipo nas declaracoes de variaveis
fun main(args: Array<String>) {
    var pergunta = "A questão da vida, do universo e tudo mais"//variavel
    val resposta = 42//val = final (imutavel)

    val tempoDeProcessamento = 7.5e6 //definindo um double para ponto flutuante

    val vSemInicializacao = Int // sem inicialização o tipo deve fica explicito

    println(pergunta)
    println(resposta)
    println(tempoDeProcessamento)
    println(vSemInicializacao)

    val message: String // variavel imutavel inicializada posteriormente garantida pelo compilador
    if (1 == Scanner(System.`in`).nextInt()) {
        message = "yes 1"
    } else {
        message = "not 1"
    }
    println(message)

    //referencia imutavel, mas o objeto não
    val linguagens = arrayListOf("Java", "Kotlin", "Swift", "Objective C", "Pascal", "ColdFusion", "Python")
    linguagens.add("TypeScript")

    println(linguagens)

    //não é possivel compilar reatribuicoes de variaveis com tipos inferidos
    //var vara = 42
    //vara = "texto"


}