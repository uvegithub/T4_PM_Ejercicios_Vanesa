package com.example.t4_pm_clases_231023

fun main() {

    var tierra=Planeta("Tierra", "Rocoso", 3.0f)
    var venus=Planeta("Tierra", "Gaseoso", 4.0f)
    var marte=Planeta("Tierra", "Rocoso", 2.0f)

    var lista = mutableListOf<Planeta>(tierra,venus,marte)
    var sistemaSolar = Sistema_solar(lista)

    println(sistemaSolar.mayor_masa())
    println(sistemaSolar.menor_masa())
    println(sistemaSolar.masa_media())
}