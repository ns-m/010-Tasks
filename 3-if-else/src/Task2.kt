/* Для двух целых чисел вывести на экран «первое число больше» если первое больше, «второе число больше»
 если второе больше и вывести «числа равны», если они равны */

fun main() {

    val number1: Int = readLine()!!.toInt()
    val number2: Int = readLine()!!.toInt()

    if (number1 > number2)
        println("первое число больше")
    else if (number2 > number1)
        println("второе число больше")
    else
        println("числа равны")

}