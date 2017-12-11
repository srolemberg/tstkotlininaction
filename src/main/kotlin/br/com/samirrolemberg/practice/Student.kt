package br.com.samirrolemberg.practice

class Student : Person() {
    var responsible: String = ""
    var course: String = ""

    override fun toString(): String {
        return "Student(responsible='$responsible', course='$course') ${super.toString()}"
    }


}