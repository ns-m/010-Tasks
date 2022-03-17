/*
Вывести для чисел от 1 до 5 их текстовое представление: 1 – «один», 2 – «два», 3 – «три», 4 – «четыре», 5 – «пять»
Если на вход приходит любое другое число, то вывести: «ошибка»
*/

fun main() {

    val inputNumber: Int = readLine()!!.toInt()
    when {
        inputNumber == 1 -> println("один")
        inputNumber == 2 -> println("два")
        inputNumber == 3 -> println("три")
        inputNumber == 4 -> println("четыре")
        inputNumber == 5 -> println("пять")
        else -> println("ошибка")
    }
}