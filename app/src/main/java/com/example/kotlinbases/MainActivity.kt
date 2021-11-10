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

        println("============================")
        println("Ejercicio 1")
        println("============================")

        val nameArray = arrayListOf<String>("Carlos", "Elvis","Raissa")
        val ageArray = arrayListOf<Int>(18,22,15)
        var aux = 0

        for(position in ageArray ){
            if (position >= 18){
                println(nameArray[aux] + " es mayor de edad")
            }else{
                println(nameArray[aux] + " es menor de edad")
            }
            aux++
        }
        // Presentar la tabla de multiplicar de n numeros de forma ascente y descendente

        println("============================")
        println("\nEjercicio 2\n")
        println("============================")

        val multiplicand = 10
        val multiplier = 10
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
        println("============================")
        println(" ejercicio 3")
        println("============================")
        val studentsArray = arrayListOf<String>("Brandon", "Jorge","Luis", "Edgar")
        val subGroupArray = arrayListOf<String>("Misk'y", "Hackers", "Undefined")

        studentsArray.sort()
        subGroupArray.sort()
        println(studentsArray)
        println(subGroupArray)

        /*
        Presentar propiedades de un vehículo utiizando clases, como tracción,
        motor, tipo de vehículo, capacidad
         */

        println("============================")
        println("Ejercicio 4")
        println("============================")
        val vehiculo = Vehiculo("Suzuki",20.2,"y-7000","Camioneta",20)
        println(vehiculo.toString())

        /*
        Ejercicio cedula
         */
        println("============================")
        println("Ejercicio 5")
        println("============================")
        val cedulaArray = arrayListOf<String>("1104759061", "1784559964", "1711112969")
        // suma de valores
        for(cedula in cedulaArray){

            println()
            println("Cedula")
            println(cedula)
            println("212121212")
            var posicion = 0
            var total = 0

            while(posicion < 9){
                val multiplicador = if ( posicion % 2 == 0 ) 2 else 1
                var subtotal = cedula[posicion].digitToInt() * multiplicador
                if ( subtotal > 10 ){
                    var aux5 = 0
                    for (num in subtotal.toString()){
                        aux5+=num.digitToInt()
                    }
                    subtotal = aux5
                }
                total+=subtotal
                posicion++
            }
            val valorResta = (total.toString()[0].digitToInt()+1)*10
            println("La suma de los digitos de la cedula es: $total")
            println("El valor a restar es: $valorResta")
            println("La resta de los digitos es: "+ (valorResta - total) + " el ulitmo digito de " +
                    "la cedula es " + cedula[9])
        }



    }
}
class Vehiculo(
    private var modelo: String,
    private var traccion: Double,
    private var motor: String,
    private var tipo: String,
    private var capacidad: Int
) {
    override fun toString(): String {
        return "Vehiculo(modelo='$modelo', traccion=$traccion, motor='$motor', tipo='$tipo', " +
                "capacidad=$capacidad)"
    }
    fun setModelo(modelo:String){
        this.modelo = modelo
    }
    fun setTraccion(traccion: Double){
        this.traccion=traccion
    }
    fun setMotor(motor: String){
        this.motor=motor
    }
    fun setTipo(tipo: String){
        this.tipo=tipo
    }
    fun setCapacidad(capacidad: Int){
        this.capacidad=capacidad
    }


}
