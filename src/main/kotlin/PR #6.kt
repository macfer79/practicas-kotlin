/*FILTRANDO NOMBRES
* Se te da una matriz de nombres y necesitas sacar sólo los nombres que comienzan con la letra dada.
* La letra debe tomarse de la entrada del usuario.
* Cada uno de los nombres resultantes debe aparecer en una línea separada.
*
* Nota: El código dado toma la letra como entrada.
 */

fun main(args: Array<String>){
    print("Entry to letter: ")
    var letter = readLine()!![0]
    val names = arrayOf("John", "David", "Amy", "James", "Amanda", "Dave", "Bob", "Billy", "Bobby", "Diana", "Lenny", "Gina")
    //var res = "" Podemos ahorranos una variable, ya que con la variable del "for" se puede imprimir los nombres.

    for(i in names){
        //res = i No hace falta para obtener el mismo resultado.
        if(i[0] == letter){
            println(i)
        }
    }
}