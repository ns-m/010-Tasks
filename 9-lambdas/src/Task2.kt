/*
Написать функцию, которая отвечает на вопрос присутствует ли в коллекции элемент, который удовлетворяет условиям
fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean


Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/
import User

/*fun convertToString(users: List<User>, conversion: (User) -> String): List<String>{

    val result = mutableListOf<String>()
    for (user in users) {
        result.add(user.name)
        result.add(user.age.toString())
    }
    return result
}

fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean{

    val dataCheck: String = readLine().toString()
    val usersList = convertToString(users){"${it.name} ${it.age}"}
    return (usersList.contains(dataCheck))

}*/

fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean{

    for (user in users)
        if (condition(user))
            return true
    return false
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
//    println(containsElement(userList){it.name.toString() == readLine().toString()})
    println(containsElement(userList){it.age>48})
}