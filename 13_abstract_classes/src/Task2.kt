/*
Добавить еще один класс Triangle – тоже наследник Figure (который вы сделали в предыдущем задании)
и прописать работу функций area() и length() для него

Для этой задачи есть видео с разбором.
*/
import kotlin.math.PI

abstract class Figure2(val color: String){

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

class Triangle(color: String): Figure(color){

    val width: Int = readLine()!!.toInt()
    val height: Int = readLine()!!.toInt()
    override fun square(): Double {
        return(0.5 * width.toDouble() * height)
    }

    override fun length(): Double {
        return(width.toDouble() * 3)
    }
}

class Round2(color: String): Figure(color){

    val radius: Int = readLine()!!.toInt()
    override fun square(): Double{
        return(Math.PI * radius * radius)
    }

    override fun length(): Double{
        return(2 * Math.PI * radius)
    }
}

class Rectangle2(color: String): Figure(color){

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

    val useRound = Round2("Red")
    val useRectangle = Rectangle2("Blue")
    val useTriangle = Triangle("Yellow")
    useRound.moveDown(5)
    println("${useRound.color} round has area - ${useRound.square()} and round`s length- ${useRound.length()}")
    println("${useRectangle.color} reclangle has ${useRectangle.square()} and reclangle`s length - ${useRectangle.length()} Is reclangle square? - ${useRectangle.isItsquare()}")
    println("${useTriangle.color} Triangle has ${useTriangle.square()} and triangle`s length - ${useTriangle.length()}")
}