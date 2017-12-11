package br.com.samirrolemberg.c2xx.c222

class Rectangle(val height: Int, val width: Int) {
    //getter customizado é executado na chamada da propriedade isSquare
    var isSquare: Boolean = false
        get() {//poderia ser substituido por uma função da classe Rectangle, mas nesse caso o attr é uma caracteristica da entidade
            return height == width
        }

}