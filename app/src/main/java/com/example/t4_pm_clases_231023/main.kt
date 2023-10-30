package com.example.t4_pm_clases_231023

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
    var lista_est : MutableList<Estudiante> = mutableListOf()

    lista_est.add(Estudiante())
    println("elemento agregado")
    lista_est.add(Estudiante())
    println("elemento agregado")

    println("¿Que estudiante deseas mostrar? Escribe su nombre")
    var estu_a_mostrar: String = readLine() ?:""

    for (estudiant in lista_est){
        if(estudiant.nombre == estu_a_mostrar){
            println(estudiant)
        }
    }

     println("la media de todos los estudiantes es: ")
     println(media(lista_est))


}