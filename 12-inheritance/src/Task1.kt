/*
Для созданных в предыдущих задачах классов Rectangle и Round (нужно сюда скопировать ваш код этих классов)
пропишите суперкласс Figure, в котором будет поле цвет типа String, которое должно инициализироваться через конструктор
и два поля x и y типа Int, которые будут задавать положение фигуры в пространстве относитльено начала координат
и инициализироваться в теле класса начальными значениями ноль.

Пропишите в этом классе функции moveLeft(step: Int), moveRight(step: Int), moveDown(step: Int), moveUp(step: Int),
которые будут сдвигать фигуру, то есть менять ее координаты x и y

Сделайте Rectangle и Round наследниками класса Figure

Для этой задачи есть видео с разбором.
*/
import kotlin.math.PI

open class Figure(val color: String, val x: Int, val y: Int){

}

class Round(color: String, x: Int, y: Int): Figure(color, x, y){

    val radius: Int = 0
    fun square(){
        println(Math.PI * radius * radius)
    }
    fun lengthCircle(){
        println(2 * Math.PI * radius)
    }
}

class Rectangle(color: String, x: Int, y: Int): Figure(color, x, y){

    val width: Int = 0
    val height: Int = 0
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

fun main(){

}