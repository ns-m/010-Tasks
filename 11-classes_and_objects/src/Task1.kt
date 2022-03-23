/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися через конструктор.
Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height))
Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)
Создайте объект класса Rectangle и проверьте работоспособность написанных функций

Для этой задачи есть видео с разбором.
*/

class Rectangle(
    val width: Int = 0,
    val height: Int = 0
){
    fun rectangleArea(){
        println(width * height)
    }
    fun rectanglePerimeter(){
        println(2 * (width + height))
    }
    fun square(): Boolean{
        return width == height
    }
}

fun main() {
    val inputWidth: Int = readLine()!!.toInt()
    val inputHeight: Int = readLine()!!.toInt()
    val calculation = Rectangle(inputWidth, inputHeight)

    calculation.rectangleArea()
    calculation.rectanglePerimeter()
    println(calculation.square())
}