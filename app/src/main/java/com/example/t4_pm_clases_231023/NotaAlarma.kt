package com.example.t4_pm_clases_231023

class NotaAlarma(id:Int, linea:String, var hora:String) :Nota(id, linea){

    override fun toString(): String {
        return "Identificador: $id . Línea de texto: $linea . Hora: $hora"
    }
}