package com.example.t4_pm_clases_231023

import kotlin.random.Random

fun media(array:MutableList<Estudiante>):Double{
    var suma:Double=0.0
    var cont:Int=0
    var media:Double
    for(estudiante in array){
       suma+=estudiante.calificaciones
       cont++
    }
    media=suma/cont
    return media
}

fun actualizarStock(producto:Producto, cant:Int){
    producto.stock += cant
}

fun championsLeage(equipos:MutableList<Futbol>):String{
    var res: String=""

    for(i in 1..equipos.size/2){
        var indice1 = Random.nextInt(0, equipos.size-1)
        res += equipos.get(indice1).toString()
        equipos.removeAt(indice1)
        var indice2 = 0
        if(equipos.size == 1)
            indice2 = 0
        else
            indice2 = Random.nextInt(0, equipos.size-1)

        res += " - " +equipos.get(indice2).toString() + " \n "
        equipos.removeAt(indice2)
    }
    return res
}
fun main() {

//    var tierra=Planeta("Tierra", "Rocoso", 3.0f)
//    var venus=Planeta("Tierra", "Gaseoso", 4.0f)
//    var marte=Planeta("Tierra", "Rocoso", 2.0f)
//
//    var lista = mutableListOf<Planeta>(tierra,venus,marte)
//    var sistemaSolar = Sistema_solar(lista)
//
//    println(sistemaSolar.mayor_masa())
//    println(sistemaSolar.menor_masa())
//    println(sistemaSolar.masa_media())
//
//    /* ejercicio 3: contactos **/
//   var lista3 : MutableList<Contacto> = mutableListOf()
//
//    lista3.add(Contacto())
//    println("Producto agregado")
//    lista3.add(Contacto())
//    println("Producto agregado")
//
//    println("¿Que contacto quieres eliminar?")
//    var contacto_a_eliminar: Int = readLine()?.toInt() ?: 0
//
//    lista3.removeAt(contacto_a_eliminar)
//    println("Producto eliminado")
//
//    for (contacto in lista3){
//        println(contacto)
//    }

    /* ejercicio 4: estudiantes **/
//    var lista_est : MutableList<Estudiante> = mutableListOf()
//
//    lista_est.add(Estudiante())
//    println("elemento agregado")
//    lista_est.add(Estudiante())
//    println("elemento agregado")
//
//    println("¿Que estudiante deseas mostrar? Escribe su nombre")
//    var estu_a_mostrar: String = readLine() ?:""
//
//    for (estudiant in lista_est){
//        if(estudiant.nombre == estu_a_mostrar){
//            println(estudiant)
//        }
//    }
//
//     println("la media de todos los estudiantes es: ")
//     println(media(lista_est))

    /* ejercicio 5: inventario **/
//    var lista_prod : MutableList<Producto> = mutableListOf()
//
//    lista_prod.add(Producto())
//    println("producto agregado")
//
//    println("Dime el producto")
//    var producto1=Producto()
//    lista_prod.add(producto1)
//    actualizarStock(producto1,1)
//    println(producto1.stock)
//
//    println("Estos son todos los productos")
//    for(produc in lista_prod){
//        println(produc.nombre)
//        println(produc.precio)
//        println(produc.stock)
//    }

    /* ejercicio 6: Crea una lista con los nueve planeta del Sistema Solar. Usa la clase planeta creada en el ejercicio 1**/
//    var lista_pla : MutableList<Planeta> = mutableListOf()
//    var mercurio = Planeta("Mercurio", "gaseoso", 1.2f)
//    var tierra = Planeta("Tierra", "rocoso", 3.4f)
//    var marte = Planeta("Marte", "rocoso", 4.4f)
//    lista_pla.add(mercurio)
//    println("planeta agregado")
//    lista_pla.add(tierra)
//    println("planeta agregado")
//    lista_pla.add(marte)
//    println("planeta agregado")

    /* ejercicio 7: Muestra por pantalla toda la información de todos los planetas**/
//    for(plan in lista_pla){
//        println(plan.toString())
//    }

//    println(lista_pla.toString())

    /* ejercicio 8: Muestra por pantalla todos los planetas que empiecen por la letra ‘M’**/
//    for(plan in lista_pla){
//        if(plan.nombre[0]=='M'){
//            println(plan.toString())
//        }
//    }

    /* ejercicio 8: Muestra por pantalla todos los planetas que empiecen por la letra ‘M’**/
//    var lista_pla : MutableList<Planeta> = mutableListOf()
//    var mercurio = Planeta("Mercurio", "gaseoso", 1.2f)
//    var tierra = Planeta("Tierra", "rocoso", 3.4f)
//    var marte = Planeta("Marte", "rocoso", 4.4f)
//    var varnia = Planeta("varnia", "gaseoso", 400000.4f)
//    lista_pla.add(mercurio)
//    println("planeta agregado")
//    lista_pla.add(tierra)
//    println("planeta agregado")
//    lista_pla.add(marte)
//    println("planeta agregado")
//    lista_pla.add(varnia)
//    println("planeta agregado")
//
//    for(plan in lista_pla){
//        if(plan.masa > 20 * tierra.masa){
//            println(plan.toString())
//        }
//    }

    /* Ejercicio 10. Muestra por pantalla la masa media de los planetas del sistema solar **/
//    var lista_pla : MutableList<Planeta> = mutableListOf()
//    var mercurio = Planeta("Mercurio", "gaseoso", 1.2f)
//    var tierra = Planeta("Tierra", "rocoso", 3.4f)
//    var marte = Planeta("Marte", "rocoso", 4.4f)
//
//    lista_pla.add(mercurio)
//    println("planeta agregado")
//    lista_pla.add(tierra)
//    println("planeta agregado")
//    lista_pla.add(marte)
//    println("planeta agregado")
//
//    var suma=0.0
//    var media=0.0
//    var cont=0
//    for(plan in lista_pla){
//        suma += plan.masa
//        cont++
//    }
//    media=suma/cont
//
//    println("la masa media de los planetas es $media")

    /* Ejercicio 12. Crea una lista con 16 equipos de fútbol de países distintos (no puede
haber más de cuatro equipos por país) **/
    var lista_equipos : MutableList<Futbol> = mutableListOf()
    var realma = Futbol ("Real Madrid", "España")
    var bar = Futbol ("Barca", "España")
    var bet = Futbol ("Betis", "Sevillandia")
    var bit = Futbol ("Bit", "Landia")

    lista_equipos.add(realma)
    println("equipo agregado")
    lista_equipos.add(bar)
    println("equipo agregado")
    lista_equipos.add(bet)
    println("equipo agregado")
    lista_equipos.add(bit)
    println("equipo agregado")

    /* Ejercicio 13. Crea la función championsLeague() que recibe como entrada la lista con
los 16 equipos y muestra por pantalla un sorteo de octavos* de final de la Champions.
*(no tengas en cuenta que equipos de un mismo país no pueden enfrentarse) **/
    println(championsLeage(lista_equipos))



}