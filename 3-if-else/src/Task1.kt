/* Вывести на экран большее из двух целых чисел. */

fun main(){

    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()

    if (number1 > number2)
        println(number1)
    else
        println(number2)

}
