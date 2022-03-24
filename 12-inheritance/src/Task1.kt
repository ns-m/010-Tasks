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

open class Figure(val color: String){

    var x: Int = 0
    var y: Int = 0
    fun moveLeft(step: Int){
        x-= step
    }
    fun moveRight(step: Int){
        x+= step
    }
    fun moveDown(step: Int){
        y+= step
    }
    fun moveUp(step: Int){
        y-= step
    }

}

class Round(color: String): Figure(color){

    val radius: Int = readLine()!!.toInt()
    fun square(){
        println(Math.PI * radius * radius)
    }
    fun lengthCircle(){
        println(2 * Math.PI * radius)
    }
}

class Rectangle(color: String): Figure(color){

    val width: Int = readLine()!!.toInt()
    val height: Int = readLine()!!.toInt()
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

    val useRound = Round(readLine().toString())
    val useRectangle = Rectangle(readLine().toString())
    useRound.moveDown(5)
    useRectangle.square()
}