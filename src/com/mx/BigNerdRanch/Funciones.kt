package com.mx.BigNerdRanch

/**
 * Convertir un bloque de codigo en funcion usando:
 * -Seleccionar el bloque
 * -dar click derecho
 * -Refactor->Extract->function...
 * -dar un nombre a la funcion
 * -seleccionar el boton ok
 * **/

/**
 * ANATOMIA DE LA FUNCION
 *
 * encapsulamiento fun nombreFuncion(val parametro:tipodelParametro):tipoQRegrasaFun{  return }
 * los parametros de la funcion son val, mas no se debe indicar pero no se puede modificar ese valor dentro del
 * cuerpo de la funcion
 *
 * su nombre usa LowerCase
 * **/

private fun myFun(myParametro:String?):String {

    /*
    * Tanto las variables y parametros pertenecientes a la funcion, solo son visibles dentro de ella
    * */
    var myString:String
    if (myParametro.isNullOrEmpty()) TODO("No se actualizo la variable myString")

    else myString =myParametro

    return myString
}

/**ARGUMENTOS POR DEFAULT
 * Las funciones puedan tener argumentos por default asi no siempre tienes que pasarselos
 * -SINGLE-Expression funcion
 * las funciones pueden ser establecidas con un signo =
 * */

private fun expresionFun (parametro1:String="valor por defecto"):String =
        when(parametro1){
            "valor por defecto"-> "Se tiene el valor por defecto"
            else-> "el valor del argumento que se paso es $parametro1"
        }

/**UNIT
 * Es un tipo de funcion que no retorna nada, es equivalente a void de Java
 * **/
fun main(arg:Array<String>){

    println(MYCONSTANTE)
    println(myFun(""))
    //si los argumentos se pasan de la siguiente forma no es necesario pasarlos en orden
    println(myFun(myParametro = "Esta es otra forma de pasar argumentos que es muy usado cuando pasas muchos argumentos"))
    println(expresionFun())
    println(expresionFun("Se paso un argumento y parametro1 cambio"))
}