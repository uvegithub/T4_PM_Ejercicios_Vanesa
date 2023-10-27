package com.example.t4_pm_clases_231023

import kotlin.math.pow

class Triangulo (var lon1:Double, var lon2:Double, var lon3:Double, var per:Double, var tipo:String) {

    fun esRectangulo(): Boolean{
        var res:Boolean=false
        var arrayn= arrayListOf<Double>()
        var arrayMenores = arrayListOf<Double>()
        arrayn.add(lon1)
        arrayn.add(lon2)
        arrayn.add(lon3)
        var nu:Int=0
        var mayor:Double = arrayn[0]
        for (i in 0 until arrayn.size-1){
            if(mayor<arrayn[i]){
                mayor=arrayn[i]
            }else{
                arrayMenores.add(arrayn[i])
            }
        }

        if(mayor.pow(2) == arrayMenores[0].pow(2) + arrayMenores[1].pow(2)){
            return true
        }
        return false

    }


    /*fun getmayorlado():Double{
        var arrayn= arrayListOf<Double>()
        arrayn.add(lon1)
        arrayn.add(lon2)
        arrayn.add(lon3)
        var nu:Int=0
        var mayor:Double = arrayn[0]
        for (i in 0 until arrayn.size-1){
            if(mayor<arrayn[i]){
                mayor=arrayn[i]
            }
        }

        return mayor
    }**/

}