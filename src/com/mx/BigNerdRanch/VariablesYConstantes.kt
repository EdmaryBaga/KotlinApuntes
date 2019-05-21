package com.mx.BigNerdRanch

import com.sun.org.apache.xpath.internal.operations.Bool


/**Const, es una constante en tiempo de compilacion, por lo que solo puede tener tipos primitivos, y es inmutable y
 * se tiene acceso a ella desde cualquier lado del proyecto
 * Kotlin tiene un tipo de dato inferido por lo que no es necesario decirlo que tipo es
 * **/
const val MYCONSTANTE = "hola desde VariablesyConstantes"


fun main(args: Array<String>) {

    /**
     * val, no permite cambiar el valor y es una constante en tiempo de ejecucion por lo que puede tener asignarse a un afuncion o constructor
     * y esa es una de las diferencias con const,
     * var , puede cambiar el valor es decir es mutable
     * los nombres para val y var usan lowercase
     * **/


    /**
     * Las variables a nivel de archivo siempre que se declaran deben ser inicializadas, para evitar eventos inesperados
     * las variables locales, pueden ser primero insranciadas y posteriormente inicializadas
     * **/

    //INSTANCIAMIENTO DE UNA variable
    var myVariable:Int

    //asignacion del valor
    myVariable=5

    /**
     * Las variables son de tipo referenciado.
     * cuando intentas poner algo como lo siguiente y marca el error,
     * var myVariable:Int="hello"
     * esto se debe al "static type checkin
     * **/

    /*------------------LIST---------------------------*/
    /**
     * Es una coleccion de datos no mutable
     * **/


    val myList:List<String> =listOf("soy", "una lista")

    /*------------------SET---------------------------*/
    /**
     * Es una coleccion de datos que no permite tenr dos elementos identicos
     * **/

    var mySet:Set<Char> = setOf('S','E','T','E')
    println(mySet)//Al imprimir omite los que se repiten [S, E, T]
    println(mySet.max()) //salida del ultimo elemento que no se repite T

    /*------------------MAP---------------------------*/
    /**
     * Es una coleccion de datos que consiste en llave - valor
     * **/
    val myMap:Map<Int, Boolean> = hashMapOf(1 to true, 2 to false)

}