/*
Напишите класс круга (Round) с полем radius (радиус), инициализирующимся через конструктор.
Добавьте в него функции, которые будут считать площадь (Math.PI* radius * radius) и длину окружности (2*Math.PI*radius)
Создайте объект класса Round и проверьте работоспособность написанных функций
*/
import kotlin.math.PI

class Round(
    val radius: Int = 0
){
    fun square(){
        println(Math.PI * radius * radius)
    }
    fun lengthCircle(){
        println(2 * Math.PI * radius)
    }
}

fun main() {
    val inputRadius = readLine()!!.toInt()
    val calculation = Round(inputRadius)
    calculation.square()
    calculation.lengthCircle()
}