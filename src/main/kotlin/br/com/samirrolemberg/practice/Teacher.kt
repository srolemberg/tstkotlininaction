package br.com.samirrolemberg.practice

class Teacher : Person() {
    var course: String = ""

    override fun toString(): String {
        return "Teacher(course='$course') ${super.toString()}"
    }

}