/* CALCULADORA DE ENVÍOS
*  Estás trabajando en un sitio web de eCommerce y necesitas hacer una calculadora de gastos
*  de envío basada en el importe del pedido. La tienda utiliza la siguiente estructura de costes:
*
* Para pedidos en Estados Unidos:
*  - $75+ los pedidos tiene envío gratuito.
*  - pedidos inferiores a $75 tienen unos gastos de envío del 10% del importe total del pedido.
*
*  Para pedidos internacionales, hay una tasa de envío del 15%, con un máximo de $50. Esto significa que la
*  la tarifa máxima de envío para un pedido internacional es de $50.
*
*  Tienes la función shippingCost(), que toma el importe del pedido y un booleano que indica si el pedido
*  es internacional o no y devuelve los gastos de envío de ese pedido. El importe de la devolución debe
*  ser un Double.
*
*  Ejemplo de entrada: 140.0 true
*
*  Ejemplo de salida: 21.0
*
*/

fun shippingCost(amount: Double, international: Boolean): Double {
    var send = 0.0
    if(international==false){
        if(amount>=75){
            send = 0.0
        }else {
            send += amount*0.10
        }
    }else if((amount*0.15)<50){
        send += amount*0.15
    }else {
        send = 50.0
    }
    return(send)
}

fun main (args: Array<String>){

    print("Enter the cost of the product: ")
    val total = readLine()!!.toDouble()

    print("Enter international (true/false): ")
    val international = readLine()!!.toBoolean()

    println("The shipping cost is: ${shippingCost(total,international)}")
}