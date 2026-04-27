package org.example
class Complejo { 
    private var reales: Int=0 
    private var imag: Int=0
    override fun toString(): String{
        return "(${reales}, ${imag})"
    }
    

    fun inicializar(reales: Int, imag: Int){
        this.reales=reales
        this.imag=imag
    }
}

fun main() {
    var c1: Complejo=Complejo()
    var c2: Complejo=Complejo()
    c1.inicializar(1,2)
    c2.inicializar(3,4)
    var c3: Complejo
    c3=Complejo()
   // c3=c1+c2

    println(c3.toString())
}
