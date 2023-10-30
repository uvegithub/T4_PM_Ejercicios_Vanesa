package com.example.t4_pm_clases_231023

class Producto {

    var nombre:String
    var precio:Double
    var stock:Int

    constructor(){
        println("Dame el nombre")
        this.nombre = readLine() ?: "Sin nombre"
        println("Dame el precio")
        val precioString = readLine() ?: "0.0"
        this.precio = precioString.toDouble()
        println("Dame la cantidad de stock")
        val stockString = readLine() ?: "0"
        this.stock = stockString.toInt()
    }
}