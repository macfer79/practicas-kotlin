/*SUMA EN RANGO
* Necesitas hacer una aplicación que calcule la suma de todos los números en un rango determinado.
* Toma dos número como entrada, definiendo el inicio y el final del rango. A continuación, calcula la suma de
* todos los números de ese rango y genera el resultado.
*
* Ejemplo de entrada:
* 5
* 9
*
* Ejemplo de salida:
* 35
*
 */

fun main (args: Array<String>){
    print("Entry a number initial: ")
    val initial = readLine()!!.toInt()

    print("Entry a number final: ")
    val final = readLine()!!.toInt()

    var result = 0

    for(i in initial..final){
        result += i
    }
    println("Result is: $result")
}