/*
Создайте коллекцию перемещаемых объектов (которые реализуют интерфейс Movable из предыдущей задачи),
среди которых будут разные геометрические фигуры и животные.
Переместить все элементы коллекции вправо на 10 шагов

Для этой задачи есть видео с разбором.
*/
import Movable
import Animal

fun main() {
    val useRound = Round("Red")
    val useRectangle = Rectangle("Blue")
    val useTriangle = Triangle("Yellow")

    val animal1 = Animal("Leon")
    val animal2 = Animal("Bull")

    val movablesObjects = mutableListOf<Movable>(useRound, useRectangle, useTriangle, animal1, animal2)

    for (item in movablesObjects)
        item.moveRight(10)
}