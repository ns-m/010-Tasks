/*
Написать функцию преобразования каждого элемента коллекции пользователей в String в соответствии с заданным лямбда-выражением
fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

import User

fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>{

    val result = mutableListOf<String>()
    for (user in users) {
        val stringList = conversion(user)
        result.add(stringList)
    }
    return result
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

    val convertToString = convertToStrings(userList){"${it.name} ${it.age}"}

    println(convertToString)
}