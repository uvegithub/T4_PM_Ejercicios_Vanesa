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

//    for(i in 1..equipos.size/2){
//        var indice1 = equipos.random(Random(equipos.size-1))
//        res += indice1.toString()
//        equipos.remove(indice1)
//        var indice2 = equipos.random(Random(equipos.size-1))
//
//        res += " - " +indice2.toString() + " \n "
//        equipos.remove(indice2)
//    }
//    return res
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
//    var lista_equipos : MutableList<Futbol> = mutableListOf()
//    var realma = Futbol ("Real Madrid", "España")
//    var bar = Futbol ("Barca", "España")
//    var bet = Futbol ("Betis", "Sevillandia")
//    var bit = Futbol ("Bit", "Landia")
//
//    lista_equipos.add(realma)
//    println("equipo agregado")
//    lista_equipos.add(bar)
//    println("equipo agregado")
//    lista_equipos.add(bet)
//    println("equipo agregado")
//    lista_equipos.add(bit)
//    println("equipo agregado")

    /* Ejercicio 13. Crea la función championsLeague() que recibe como entrada la lista con
los 16 equipos y muestra por pantalla un sorteo de octavos* de final de la Champions.
*(no tengas en cuenta que equipos de un mismo país no pueden enfrentarse) **/
//    println(championsLeage(lista_equipos))

    /* Ejercicio 14: Crea la clase circunferencia. El constructor primario recibirá el radio de
la circunferencia y el secundario recibirá la posición del centro de la circunferencia y
un punto cualquiera de la misma. Crear el método longitud() y sobrecargar el método
toString() de forma que muestre toda la info de la circunferencia **/
//    var c1=Circunferencia(2.0)
//    var arrayc2_1= intArrayOf(1,2)
//    var arrayc2_2= intArrayOf(3,4)
//    var c2=Circunferencia(arrayc2_1, arrayc2_2)
//    println("c1: "+c1.toString())
//    println("c2: "+c2.toString())

    /* Ejercicio 15: Crea la clase Círculo que hereda de circunferencia. Tendrá dos
constructores, el primero recibirá el radio y el color del círculo y el segundo su centro,
un punto cualquiera y su color. Crear el método área() y sobrecargar el método
toString() de forma que muestre toda la info de la circunferencia  **/
//    var c1=Circunferencia(2.0)
//    var arrayc2_1= intArrayOf(1,2)
//    var arrayc2_2= intArrayOf(3,4)
//    var c2=Circunferencia(arrayc2_1, arrayc2_2)
//    println("c1: "+c1.toString())
//    println("c2: "+c2.toString())

    /* Ejercicio 15: Crea la clase Círculo que hereda de circunferencia. Tendrá dos
constructores, el primero recibirá el radio y el color del círculo y el segundo su centro,
un punto cualquiera y su color. Crear el método área() y sobrecargar el método
toString() de forma que muestre toda la info de la circunferencia  **/
//    var c1=Circulo(2.0, "rojo")
//    var c2=Circulo(intArrayOf(1,2), intArrayOf(3,4), "verde")
//    println("c1: "+c1.toString())
//    println("c2: "+c2.toString())

    /* Ejercicio 16: Clase de matemáticas. Crea una clase Matemáticas con métodos para realizar
operaciones matemáticas como sumar, restar, multiplicar y dividir. Luego, utiliza esta clase en tu
programa principal.  **/
//    var m=Matematicas(6,2)
//    println(m.sumar())
//    println(m.restar())
//    println(m.multiplicar())
//    println(m.dividir())

    /* Ejercicio 17: Implementa las siguientes clases:
clase Nota. Una nota contiene un identificador numérico y una línea de texto. Define
constructor, accedentes y toString.
clase NotaAlarma. Una nota que además contiene la hora en la que sonará la alarma. Define
constructor, accedentes y toString.
clase BlocNotas que modela un bloc de notas en el que se pueden introducir notas, listar
todas las notas, eliminar una nota mediante su posición en el bloc de notas o saber cuantas
notas contiene el bloc de notas. Debes utilizar una colección.
clase Prueba que cree un bloc de Notas de ejemplo y pruebe las operaciones que soporta. .  **/
//    var nota1=Nota(11, "druygiu")
//    var nota2=Nota(12, "ugcvyiviruygiu")
//    var bloc=BlockNotas()
//
//    bloc.introducirNota(nota1)
//    bloc.introducirNota(nota2)
//
//    println(bloc.toString())
//    bloc.contarNotas()
//
//    bloc.eliminarNota(nota2)
//    println(bloc.toString())

    /* Ejercicio 18.
Define una jerarquía de clases que permita almacenar datos sobre los
planetas y satélites que forman parte del sistema solar ( junto con el sol).
Algunos atributos que puede ser interesante recoger son: la masa del
cuerpo, su diámetro medio, el período de rotación sobre el propio eje,
período de traslación alrededor del cuerpo que orbitan, distancia media a
ese cuerpo, excentricidad de la órbita, etc.
Define un método que, dado un objeto del sistema solar (planeta o satélite),
imprima toda la información de que se dispone sobre el mismo.**/

    /* Ejercicio 10.  **/

    /* Ejercicio 10.  **/

    /* Ejercicio 10.  **/

}