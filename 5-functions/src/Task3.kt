/*
Написать функцию, которая возвращает текстовое представление для целых чисел от 1 до 5:
1 – «один», 2 – «два», 3 – «три», 4 – «четыре», 5 – «пять»
Если на вход приходит любое другое число, то возвращать: «ошибка»

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val number = readLine()!!.toInt()
    println(numberTransformation(number))
}

fun numberTransformation(number: Int): String{
    var result = ""
    when{
        number == 1 -> result ="one"
        number == 2 -> result ="two"
        number == 3 -> result ="three"
        number == 4 -> result ="four"
        number == 5 -> result ="five"
        else
            -> result = "Error"
    }
    return result
}