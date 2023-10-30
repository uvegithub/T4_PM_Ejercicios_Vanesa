package com.example.t4_pm_clases_231023

class Estudiante {
    var nombre:String
    var edad:Int
    var calificaciones:Float

    constructor(){
        println("Dame el nombre")
        this.nombre = readLine() ?: "Sin nombre"
        println("Dame la edad")
        val edadString = readLine() ?: "0"
        this.edad = edadString.toInt()
        println("Dame la media de sus calificaciones")
        val caliString = readLine() ?: "0.0"
        this.calificaciones = caliString.toFloat()
    }

    override fun toString(): String {
        return nombre + " " + edad + " " + calificaciones
    }
}