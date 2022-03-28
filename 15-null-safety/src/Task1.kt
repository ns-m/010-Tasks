/*
1.	Есть класс:
    class SomeEmployee(
            val name: String,
            val salary: Int
    ) {

        fun callToClient(clientName: String) {
            println("Сотрудник ${name}: звоню клиенту $clientName")
        }
    }

Написать функцию
fun findEmployeeBySalary(employees: List<SomeEmployee>, age: Int): SomeEmployee?
которая ищет в списке сотрудников сотрудника с заданной зарплатой.
Сделайте так, чтобы функция возвращала null в случае если такого сотрудника в списке нет
Создать произвольный список сотрудников. Используя эту функцию найти в списке сотрудника с определенной зарплатой.
Вызвать у него функцию callToClient, используя безопасный вызов (?)
*/

fun main() {
    val user1 = SomeEmployee("Lee", 320)
    val user2 = SomeEmployee("Den", 480)
    val user3 = SomeEmployee("Joe", 330)
    val user4 = SomeEmployee("Sue", 450)
    val userList = mutableListOf(user1, user2, user3, user4)
    val inputSalary: Int = readLine()!!.toInt()
    val emp = findEmployeeBySalary(userList, inputSalary)
    emp?.callToClient("Best client")
}

class SomeEmployee(
        val name: String,
        val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee? {
    for (emp in employees)
        if (emp.salary == salary)
           return emp
    return null
}