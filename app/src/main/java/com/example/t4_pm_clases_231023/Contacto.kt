package com.example.t4_pm_clases_231023

class Contacto {

    var nombre:String
    var telefono:Int
    var mail:String

    constructor(){
        println("Dame el nombre")
        this.nombre = readLine() ?: "Sin nombre"
        println("Dame el telefono")
        val telefonoString = readLine() ?: "0"
        this.telefono = telefonoString.toInt()
        println("Dame el email")
        this.mail = readLine() ?: "Sin email"

    }

    override fun toString(): String {
        return nombre + " " + telefono + " " + mail
    }

}