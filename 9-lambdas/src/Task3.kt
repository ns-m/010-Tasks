/*
Написать функцию, которая возвращает количество элементов, удовлетворяющих условию:
fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/
import User

fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int{

    var counter: Int = 0
    for (user in users)
        if (condition(user))
            counter++
    return counter
}

fun main() {

    val user1 = User("Lee", 32)
    val user2 = User("Den", 48)
    val user3 = User("Joe", 33)
    val user4 = User("Sue", 45)
    val user5 = User("JoeS", 33)
    val user6 = User("SueS", 45)
    val user7 = User("LeeL", 32)
    val userList = mutableListOf(user1, user2, user3, user4, user5, user6, user7)

    println(elementsCount(userList){it.name.contains("o") })
}