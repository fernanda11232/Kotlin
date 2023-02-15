fun main() { 

println("Ingrese el valor de la compra:") 
   var valorCompra = readLine()!!.toDouble() 
    
     var descuento = 0.0

     if (valorCompra >= 100000) {   
            descuento = valorCompra * 0.5    
            valorCompra -= descuento   
            println("Se aplicó un descuento del 50% equivalente a: $descuento")  

     }
     println("Valor Final: $valorCompra")  
    }


import java.util.Scanner
fun main(args: Array<String>) {
val scanner = Scanner(System.`in`)
println("Ingrese el valor de la compra: ")
val valorCompra = scanner.nextFloat()
println("Valor Compra: $valorCompra")
var descuento = 0.0
if (valorCompra >= 100000) {
descuento = valorCompra * 0.5
valorCompra -= descuento
println("Se aplicó un descuento del 50% equivalente a: $descuento")
} else {
descuento = valorCompra * 0.1
valorCompra -= descuento
println("Se aplicó un descuento del 10% equivalente a: $descuento")
}
println("Valor Final: $valorCompra")
}



fun main () {

    println("Ingrese  la nota 1:")
    val num1  = readLine()!!.toDouble()
    println("Ingrese  la nota 2:")
    val num2 = readLine()!!.toDouble()
    println("Ingrese  la nota 3:")
    val num3 = readLine()!!.toDouble()
    val prom = (num1 + num2 + num3)/3

    val result = if (prom >= 3.5) "Gana" else "Pierde"
    println("El promedio es: $prom")
    println("El resultado es: $result la materia")
}


 fun main () {

    println("Ingrese su nombre")
    val nombre = readLine()!!
      println("Ingrese la materia")
    val materia = readLine()!!
    println("Ingrese  la nota 1:")
    val num1  = readLine()!!.toDouble()
    println("Ingrese  la nota 2:")
    val num2 = readLine()!!.toDouble()
    println("Ingrese  la nota 3:")
    val num3 = readLine()!!.toDouble()
    val prom = (num1 + num2 + num3)/3

    if(prom >= 3.5) {
        println("El estudiante $nombre Gano la materia $materia")
    }else {
        println("El estudiante $nombre Perdio la materia $materia ")
    if (prom >= 2.5) {
        println("puede recuperar $nombre")
    }

}
}
fun main() {

    var resp = "si"  
    var cont = 0 
        print("\nIngrese su nombre: ")   
        val nombre = readLine()!!   

        println("Hola $nombre bienvenido a clase!")  
        cont++  //variable contadora
        print("Ingrese si, si hay mas personas: ")  


fun main() {

print("Ingrese la cantidad de personas a saludar : ")
val cantidadPersonas = readLine()!!.toInt()
var contador = 1

    while(contador <= cantidadPersonas){
        print("Ingrese el nombre de la persona $contador: ")
        val nombre = readLine()!!
        println("Hola $nombre, Binevenido")
        contador++
    }
    
}