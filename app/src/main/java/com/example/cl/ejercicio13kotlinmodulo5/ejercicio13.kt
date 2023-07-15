package com.example.cl.ejercicio13kotlinmodulo5

import java.text.NumberFormat
import java.util.Currency
import kotlin.math.ceil


fun main(){
    var resultado = suma(5.5,6.4F)
    println(resultado)

    var redondeo= redondeo(7.1)
    println(redondeo)

    var muestraResultado = muestraResultado(7.5)
    println(muestraResultado)
}

fun suma(param1:Double, param2:Float ):Double = param1 + param2

fun redondeo(numero:Double):Double = ceil(numero)

fun muestraResultado(numero: Double) : String {

    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.setMaximumFractionDigits(2)
    format.setCurrency(Currency.getInstance("CLP"))

    return format.format(numero)

}