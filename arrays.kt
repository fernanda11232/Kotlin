//Desarrollar un programa que permita ingresar un arreglo de 8 elementos enteros, e informe:
//El valor acumulado de todos los elementos.
//El valor acumulado de los elementos que sean mayores a 36.
//Cantidad de valores mayores a 50.
//(Definir dos for, en el primero realizar la carga y en el segundo proceder a analizar cada elemento)

fun main(parametro: Array<String>) {
    val arreglo = IntArray(8)
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
    var sum = 0
    var sumaMayor36 = 0
    var cantMayor50 = 0
    for(elemento in arreglo) {
        sum += elemento
        if (elemento > 36)
            sumaMayor36 += elemento
        if (elemento > 50)
            cantMayor50++
    }
    println("El valor total del arreglo es : $suma")
    println("El valor total de los elementos mayores de 36 es : $sumaMayor36")
    println("Cantidad de elementos mayores a 50: $cantMayor50")
}