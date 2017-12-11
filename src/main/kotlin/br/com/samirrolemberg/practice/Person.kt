package br.com.samirrolemberg.practice

open class Person {

    var name: String = ""
    var identifier: String = ""

    override fun toString(): String {
        return "Person(name='$name', identifier='$identifier')"
    }
}