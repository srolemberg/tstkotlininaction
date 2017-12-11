package br.com.samirrolemberg.practice

import java.lang.StringBuilder
import java.util.*
import kotlin.collections.HashMap

var listStudent: HashMap<String, Student> = HashMap()

fun main(args: Array<String>) {
    println("===================KMainTest01 INIT===================")
    println(menuPrincipal())
}

fun menuAluno(): String {
    loop@ while (true) {
        println(txtMenuAluno())

        var opt: Int

        try {
            opt = Scanner(System.`in`).nextInt()
        } catch (e: InputMismatchException) {
            opt = -1
        }

        val result = when (opt) {
            1 -> menuAlunoCadastro()
            2 -> menuAlunoListagem()
//            3 -> "3 - Cadastrar Aluno"
//            4 -> "4 - Cadastrar Aluno"
            0 -> break@loop
            else -> "==Invalido==\n"
        }

        println(result)

    }

    return "ALUNO END";
}

fun menuPrincipal(): String {

    data class Pet(val name: String, val age: Int)

    loop@ while (true) {
        println(txtMenuPrincipal())

        var opt: Int

        try {
            opt = Scanner(System.`in`).nextInt()
        } catch (e: InputMismatchException) {
            opt = -1
        }

        val result = when (opt) {
            1 -> menuAluno()
            2 -> menuProfessor()
            0 -> break@loop
            else -> "==Invalido==\n"
        }
        println(result)

    }



    return "===================KMainTest01 FIM===================";
}

fun menuProfessor(): String {
    loop@ while (true) {
        println(txtMenuProfessor())

        var opt: Int

        try {
            opt = Scanner(System.`in`).nextInt()
        } catch (e: InputMismatchException) {
            opt = -1
        }

        val result = when (opt) {
            1 -> "1 - Cadastrar Professor"
            2 -> "2 - Cadastrar Professor"
            3 -> "3 - Cadastrar Professor"
            4 -> "4 - Cadastrar Professor"
            0 -> break@loop
            else -> "==Invalido==\n"
        }

        println(result)

    }

    return "Professor END";
}

fun txtMenuPrincipal(): String {

    val sb = StringBuilder()

    sb.append("===================KMainTest01===================")
    sb.append("\n")
    sb.append("1 - Aluno")
    sb.append("\n")
    sb.append("2 - Professor")
    sb.append("\n")
    sb.append("0 - Exit")
    sb.append("\n")
    return sb.toString()
}

fun txtMenuAluno(): String {
    val sb = StringBuilder()

    sb.append("===================ALUNO===================")
    sb.append("\n")
    sb.append("1 - Cadastrar Aluno")
    sb.append("\n")
    sb.append("2 - Listar Alunos")
    sb.append("\n")
    sb.append("3 - Remover Aluno")
    sb.append("\n")
    sb.append("4 - Pesquisar Aluno")
    sb.append("\n")
    sb.append("0 - Exit - Menu Principal")
    sb.append("\n")
    return sb.toString()
}

fun txtMenuProfessor(): String {
    val sb = StringBuilder()

    sb.append("===================Professor===================")
    sb.append("\n")
    sb.append("1 - Cadastrar Professor")
    sb.append("\n")
    sb.append("2 - Remover Professor")
    sb.append("\n")
    sb.append("3 - Listar Professor")
    sb.append("\n")
    sb.append("4 - Pesquisar Professor")
    sb.append("\n")
    sb.append("0 - Exit - Menu Principal")
    sb.append("\n")
    return sb.toString()
}

fun menuAlunoCadastro(): String {
    loop@ while (true) {
        println("++++++++++++Menu Aluno Cadastro+++++++++++++++")

        println("Informe o Identificador")
        val identificador: String = Scanner(System.`in`).next().toUpperCase()
        println("Informe o Nome")
        val nome: String = Scanner(System.`in`).next().toUpperCase()
        println("Informe o Responsavel")
        val responsavel: String = Scanner(System.`in`).next().toUpperCase()
        println("Informe o Disciplina")
        val curso: String = Scanner(System.`in`).next().toUpperCase()

        if (identificador.trim().isEmpty()) {
            println("Informe o Identificador do Aluno")
        } else if (listStudent.size > 0 && listStudent.containsKey(identificador)) {
            println("Identificador do Aluno duplicado")
        } else if (curso.trim().isEmpty()) {
            println("Informe o Curso do Aluno")
        } else {
            val student = Student()
            student.identifier = identificador
            student.name = nome
            student.responsible = responsavel
            student.course = curso

            listStudent.put(student.identifier, student)

            break@loop
        }

    }

    return "Menu Aluno Cadastro END";
}

fun menuAlunoListagem(): String {
    println("++++++++++++Menu Aluno Listagem+++++++++++++++")



    if (listStudent.size > 0) {
        listStudent.forEach { println(it.value.toString()) }
    } else {
        print("Não Há Alunos Cadastrados")
    }

    return "Menu Aluno Listagem END";
}

fun menuTeste(menuProfessor: String = menuProfessor()) {
    val str = menuProfessor
}
