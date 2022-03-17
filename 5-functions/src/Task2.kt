/*
Написать функцию, которая для двух целых чисел возвращает «первое число больше» если первое больше,
«второе число больше» если второе больше и «числа равны», если они равны

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()

    println(inputNumbers(number1, number2))
}

fun inputNumbers(number1: Int, number2: Int): String{
    val result = if (number1 > number2)
        "First number bigger = $number1"
    else if (number1 == number2)
        "First and second numbers equal $number1 = $number2"
    else
        "Second number bigger = $number2"
    return result
}