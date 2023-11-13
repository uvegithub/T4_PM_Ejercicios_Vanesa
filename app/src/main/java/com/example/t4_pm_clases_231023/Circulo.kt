package com.example.t4_pm_clases_231023
import kotlin.math.*

class Circulo(radio:Double=0.0, var color:String="Blanco") :Circunferencia(radio) {
//    var centr= IntArray(2)
//    var punt= IntArray(2)
    var colo = ""

    constructor(c:IntArray, p:IntArray, co:String):this(){
        this.centro= c
        this.punto=p
        this.colo=co
    }

    fun area1():Double{
        var res:Double
        var pi:Double=3.1416
        res=pi*(radio.pow(2))
        return res
    }

    fun area2():Double{
        var res:Double
        var pi:Double=3.1416
        var c1 = 0
        var c2 = 0

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

        res=pi*(h.pow(2))
        return res
    }

    override fun toString(): String {
        return "circulo 1:  radio: $radio   color: $color  area: ${area1()}"+"\n"+"circulo 2:  centro: ${centro.get(0)} , ${centro.get(1)}  punto: ${punto.get(0)}, ${punto.get(1)}  color: $colo   area: ${area2()}"
    }
}