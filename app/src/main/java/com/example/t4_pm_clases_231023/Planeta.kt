package com.example.t4_pm_clases_231023

class Planeta (var nombre:String, var tipo:String="Rocoso", var masa:Float){


    fun nombrar(nom:String) {
        this.nombre=nom
    }

    fun girar(){
        println("Estoy girando")
    }

    fun setTipo(){
        if(this.tipo!="Rocoso"){
            this.tipo="Gaseoso"
        }
    }

    override fun toString(): String {
        //return super.toString()
        return "Planeta(nombre='$nombre, tipo='$tipo, masa='$masa)"
    }



}