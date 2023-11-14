package com.example.t4_pm_clases_231023

open class Nota (val id:Int, var linea:String){

    override fun toString(): String {
        return "Identificador: $id . Línea de texto: $linea"
    }
}