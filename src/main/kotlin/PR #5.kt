/* PRIMERAS LETRAS
* Se te da un código que debes iterar a través de una matriz y mostrar las primeras letras de cada elemento. Sin
* embargo, el código tiene errores. Arregla el código para que dé la salida esperada.
*
* Nota: Las primeras letras deben combinarse en la misma línea sin saltos de línea.
* */

fun main(args: Array<String>){
    var arr = arrayOf("María", "Ana", "Natalia", "Ursula", "Elena", "Laura")
    var res = ""

    arr.forEach(){
        str -> res += str[0]
    }
    println(res)
}