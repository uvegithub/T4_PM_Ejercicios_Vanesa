package com.example.t4_pm_clases_231023

class BlockNotas (var listaNotas: MutableList<Nota> = mutableListOf()) {

    fun introducirNota(not:Nota){
        listaNotas.add(not)
    }

    fun eliminarNota(not:Nota){
        listaNotas.remove(not)
    }

    fun contarNotas():String{
        var res:Int=0
        for (nota in listaNotas){
            res++
        }
        return "Hay un total de $res notas"
    }

    override fun toString(): String {
        var string = ""
        for (nota in listaNotas){
            string += " $nota \n"
        }

        return string
    }
}