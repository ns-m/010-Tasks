import kotlin.math.PI

abstract class Figure(val color: String): Movable{

    var x: Int = 0
    var y: Int = 0
    abstract fun square(): Double
    abstract fun length(): Double
    override fun moveLeft(step: Int){
        x-= step
    }
    override fun moveRight(step: Int){
        x+= step
    }
    override fun moveDown(step: Int){
        y+= step
    }
    override fun moveUp(step: Int){
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