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

fun actualizarStock(producto:Producto, cant:Int){
    producto.stock += cant
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
    var lista_pla : MutableList<Planeta> = mutableListOf()
    var mercurio = Planeta("Mercurio", "gaseoso", 1.2f)
    var tierra = Planeta("Tierra", "rocoso", 3.4f)
    var marte = Planeta("Marte", "rocoso", 4.4f)
    lista_pla.add(mercurio)
    println("planeta agregado")
    lista_pla.add(tierra)
    println("planeta agregado")
    lista_pla.add(marte)
    println("planeta agregado")

    /* ejercicio 7: Muestra por pantalla toda la información de todos los planetas**/
//    for(plan in lista_pla){
//        println(plan.toString())
//    }

    println(lista_pla.toString())

    /* ejercicio 8: Muestra por pantalla todos los planetas que empiecen por la letra ‘M’**/
    for(plan in lista_pla){
        if(plan.nombre[0]=='M'){
            println(plan.toString())
        }
    }
}