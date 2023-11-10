/*TARIFA DE APARCAMIENTO
* Estás haciendo un software de estacionamiento de coches que necesita calcular y generar la cantidad debida en
* función del número de horas que el coche estaba aparcado.
* La tarifa se calcula sobre la base de la siguiente estructura de precios:
*
* - las primeras 5 horas se facturan a 1 dólar por hora.
* - después, cada hora se factura a 0,5 dólares por hora.
* - por cada 24 horas, hay una tarifa plana de 15 dólares.
*
* Esto significa que , por ejemplo, si un coche está aparcado durante 26 horas, la factura debería ser
* 15+(2*0.5)=16.0, porque estuvo aparcado durante 24 horas más 2 horas adicionales.
*
* Ejemplo de entrada: 8
*
* Ejemplo de salida: 6.5
*
* Explicación: Las primeras 5 horas se facturan a 1 dólar/hora, lo que supone 5 dólares. Después, las 3 horas
* siguientes se facturan a 0.5 dólares/hora= $1.5. Así, el total sería $5+$1.5=$6.5
*
 */

fun main (args: Array<String>){
    print("Entry hours: ")
    var hours = readLine()!!.toDouble()
    var account = 0.0

    while(hours>0.0){
        if(hours>5 && hours<24){
            hours -= 5.0
            account += 5.0+(hours*0.5)
            hours -= hours
        }else {
            hours -= 24
            account = 15.0 + (hours*0.5)
            hours -= hours
        }
    }
    print("The account is: $account")
}

