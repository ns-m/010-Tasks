/*
Написать функцию, которая возвращает большее из двух целых чисел.

Проверить работу написанной функции на примере каких-нибудь входных данных.
 */

fun main() {

    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()

    println(getMaxNumber(number1, number2))
}

fun getMaxNumber(number1: Int, number2: Int): Int{

    val result = if (number1>number2)
        number1
    else
        number2
    return result
}