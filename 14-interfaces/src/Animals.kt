import Movable

class Animal(val name: String): Movable {

    var x: Int = 0
    var y: Int = 0
    override fun moveLeft(step: Int) {
        x -= step
    }
    override fun moveRight(step: Int) {
        x += step
    }
    override fun moveDown(step: Int) {
        y -= step
    }
    override fun moveUp(step: Int) {
        y += step
    }
}