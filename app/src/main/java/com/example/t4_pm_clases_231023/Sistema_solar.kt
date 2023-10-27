package com.example.t4_pm_clases_231023

class Sistema_solar {
    var planetas : MutableList<Planeta> = mutableListOf()

    constructor(lista : MutableList<Planeta>){
        this.planetas = lista
    }

    fun mayor_masa():Float{

        var masas : MutableList<Float> = mutableListOf()
        for(planeta in planetas){
            masas.add(planeta.masa)
        }

        var masaMayor = masas[0]

        for (masa in masas){
            if (masa > masaMayor){
                masaMayor = masa
            }
        }

        return masaMayor

    }

    fun menor_masa():Float{
        var masas : MutableList<Float> = mutableListOf()
        for(planeta in planetas){
            masas.add(planeta.masa)
        }

        var masaMenor = masas[0]

        for (masa in masas){
            if (masa < masaMenor){
                masaMenor = masa
            }
        }

        return masaMenor
    }

    fun masa_media():Float{
        var masas : MutableList<Float> = mutableListOf()
        for(planeta in planetas){
            masas.add(planeta.masa)
        }

        var media:Float
        var suma:Float=0.0f
        var cont:Int=0

        for (masa in masas){
            suma+=masa
            cont++
        }

        media=suma/cont

        return media
    }
}