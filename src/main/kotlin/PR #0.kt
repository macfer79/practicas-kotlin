/*
* TEXTO VERTICAL
*
* Necesitas hacer una cadena como entrada y sacarla verticalmente, cada letra en un nueva línea.
*
* Ejemplo de entrada: hello
*
* Ejemplo de salida:
* h
* e
* l
* l
* o
*/

fun main(args: Array<String>){
    print("Entry text: ") // Imprime el texto sin salto de línea
    val text = readLine()!!.toString() // Permite que el usuario introduzca la cadena de texto.

    for(i in text){ // Bucle que itera la posición de cada letra del texto introducido.
        println(i) // Imprime todas cada posición de cada letra del texto introducido sin salto de línea.
    }
}