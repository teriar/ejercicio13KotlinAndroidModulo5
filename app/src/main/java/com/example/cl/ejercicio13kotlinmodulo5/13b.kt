package com.example.cl.ejercicio13kotlinmodulo5

fun main(){
   var i = 0

    var continuar:Boolean = true

    var lista = mutableListOf<Heroe>()

    while(continuar) {

        println("Nombre: ")
        val nombre = readln()
        println("Publisher: ")
        val publisher = readln()
        println("RealName: ")
        val RealName = readln()
        println("Photo: ")
        val Photo = readln()
        i = i.inc()

        println("continuar? 1:si 2:no")
         var cont = readln().toInt()
        if(cont ==2){ continuar = false}

        var heroe = Heroe(nombre,publisher, RealName,Photo)
        lista.add(heroe)
    }

    for(h in lista) {
        println(h)
    }
}

data class  Heroe(val superHero:String, val publisher:String, val realName:String, var photo:String )

