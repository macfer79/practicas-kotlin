/* CONTADOR DE LETRAS
* Hay que definir una función, que tome una letra y un texto como argumentos, y devuelva el número de veces
* que la letra dada aparece en el texto dado.
*
* Ejemplo de entrada: e
*                     awesome
*
* Ejemplo de salida: 2
*
*/

fun main(args: Array<String>){
    print("Entry to letter: ")
    val letter = readln()[0]

    print("Entry a text: ")
    val text = readln()!!.toString()

    val result = letter_count(letter, text)
    println("The number of characters in the text is: $result")
}

fun letter_count(l: Char, t: String): Int {
    var x = 0
    for(u in t){
        if(u==l){
            x++
        }
    }
    return x
}