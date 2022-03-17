/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает средний возраст всех пользователей.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun averageEmployeeAge(usersAge: List<Employee>): Int {

    var sum = 0
    for (userAge in usersAge)
        sum +=userAge.age
    return sum/usersAge.size
}

fun main() {

    val employee1 = Employee(readLine().toString(), readLine()!!.toInt())
    val employee2 = Employee(readLine().toString(), readLine()!!.toInt())
    val employee3 = Employee(readLine().toString(), readLine()!!.toInt())
    val employee4 = Employee(readLine().toString(), readLine()!!.toInt())
    val employees = mutableListOf(employee1, employee2, employee3, employee4)

    val x = averageEmployeeAge(employees)

    println(x)
}
