package com.example.t4_pm_clases_231023
import kotlin.math.*

open class Circunferencia (var radio:Double=0.0){

    var centro= IntArray(2)
    var punto= IntArray(2)

    constructor(c:IntArray, p:IntArray):this(){
        this.centro= c
        this.punto=p
    }

    fun longitud():Double{
        var pi:Double=3.1416
        var res:Double=2*pi*this.radio
        return res
    }

    fun longitud2():Double{
        var pi:Double=3.1416
        var c1 = 0
        var c2 = 0
        var res:Double

        if(this.centro[1]>=this.punto[1]){
            c1 =this.centro[1]-this.punto[1]
        }else{
            c1=this.punto[1]-this.centro[1]
        }

        if(this.centro[0]>=this.punto[0]){
            c2 = this.centro[0]-this.punto[0]
        }else{
            c2=this.punto[0]-this.centro[0]
        }

        c1 *= c1
        c2 *= c2
        var h:Double = sqrt(    (c1+c2).toDouble()    )
        res=2*pi*h

        return res
    }

    override fun toString(): String {
        return "circunferencia 1:  radio: $radio  longitud: ${longitud()}"+"\n"+"circunferencia 2:  centro: ${centro.get(0)} , ${centro.get(1)}  punto: ${punto.get(0)}, ${punto.get(1)}  longitud: ${longitud2()}"
    }
}