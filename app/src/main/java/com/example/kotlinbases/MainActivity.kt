package com.example.kotlinbases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("============================")
        println("Hello world")
        println("============================")
        // Validar si una persona es mayor de edad

        println("Ejercicio 1")

        val nameArray = arrayListOf<String>("Carlos", "Elvis","Raissa")
        val ageArray = arrayListOf<Int>(18,22,15)
        var aux = 0

        for (position in ageArray ){
            if (position >= 18){
                println(nameArray[aux] + " es mayor de edad")
            }else{
                println(nameArray[aux] + " es menor de edad")
            }
            aux++
        }
        // Presentar la tabla de multiplicar de n numeros de forma ascente y descendente

        println("\nEjercicio 2\n")

        var multiplicand = 10
        var multiplier = 10
        var aux2 = 1

        println("\nAscendente\n")
        while (aux2 <= multiplier){
            println(multiplicand.toString() + " * " + aux2 + " = " + multiplicand*aux2)
            aux2++
        }

        println("\nDescendente\n")
        aux2--
        while (aux2 >= 1){
            println(multiplicand.toString() + " * " + aux2 + " = " + multiplicand*aux2)
            aux2--
        }

        /* Mostrar el listado de paralelo de la materia
            de plataformasd móviles y los subgrupos por proyectos
         */
        val studentsArray = arrayListOf<String>("Brandon", "Jorge","Luis", "Edgar")
        val subGroupArray = arrayListOf<String>("Misk'y", "Hackers", "Undefined")

        studentsArray.sort();
        subGroupArray.sort();
        println(studentsArray)
        println(subGroupArray)

        /*
        Presentar propiedades de un vehículo utiizando clases, como tracción,
        motor, tipo de vehículo, capacidad
         */


    }
}