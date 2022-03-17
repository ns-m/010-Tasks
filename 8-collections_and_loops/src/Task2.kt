/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает самого младшего из них

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/
import Employee
import kotlin.math.min

fun littelEmployeeAge(usersAge: List<Employee>): Int? {

    val minAge = mutableListOf<Int>()

    for (userAge in usersAge)
        minAge.add(userAge.age)
    val result = minAge.toList().minOrNull()

    return result
}

fun main() {
    val employee1 = Employee(readLine().toString(), readLine()!!.toInt())
    val employee2 = Employee(readLine().toString(), readLine()!!.toInt())
    val employee3 = Employee(readLine().toString(), readLine()!!.toInt())
    val employee4 = Employee(readLine().toString(), readLine()!!.toInt())
    val employees = mutableListOf(employee1, employee2, employee3, employee4)

    val x = littelEmployeeAge(employees)

    println(x)
}