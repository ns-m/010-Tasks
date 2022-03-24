/*
Сделать класс Figure, из предыдущего урока абстрактным, перенести объявление функции area и length в него,
оставив реализацию полиморфной для классов Rectangle и Round
Для этого предварительно скопируйте сюда код классов, который вы написали в предыдущей задаче

Для этой задачи есть видео с разбором.
*/
import kotlin.math.PI

abstract class Figure(val color: String){

    var x: Int = 0
    var y: Int = 0
    abstract fun square(): Double
    abstract fun length(): Double
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
    override fun square(): Double{
        return(Math.PI * radius * radius)
    }

    override fun length(): Double{
        return(2 * Math.PI * radius)
    }
}

class Rectangle(color: String): Figure(color){

    val width: Int = readLine()!!.toInt()
    val height: Int = readLine()!!.toInt()
    override fun square(): Double{
        return(width.toDouble() * height)
    }
    override fun length(): Double{
        return(2 * (width.toDouble() + height))
    }
    fun isItsquare(): Boolean{
        return width == height
    }
}

fun main(){

    val useRound = Round("Red")
    val useRectangle = Rectangle("Blue")
    useRound.moveDown(5)
    println("${useRound.color} round has area - ${useRound.square()} and round`s length- ${useRound.length()}")
    println("${useRectangle.color} reclangle has ${useRectangle.square()} and reclangle`s length - ${useRectangle.length()} Is reclangle square? - ${useRectangle.isItsquare()}")
}