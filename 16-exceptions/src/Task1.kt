/*
Переделайте функцию findEmployeeBySalary  из задачи по null safety таким образом, чтобы ее возвращаемый тип
был SomeEmployee,а не SomeEmployee?.
А в случае если подходящий сотрудник не найден, выбрасывайте исключительную ситуацию.
Вызовите эту функцию из main, обернув ее в try catch, обработав эту исключительную ситуацию в функции main.

p.s. здесь речь не идет о том, что такой вариант в данном случае предпочтительнее, чем использование null.
Рассматривайте это просто как практику работы с Exceptions

Для этой задачи есть видео с разбором.
*/

fun main() {
    val user1 = SomeEmployee("Lee", 320)
    val user2 = SomeEmployee("Den", 480)
    val user3 = SomeEmployee("Joe", 330)
    val user4 = SomeEmployee("Sue", 450)
    val userList = mutableListOf(user1, user2, user3, user4)
    val inputSalary: Int = readLine()!!.toInt()
    try {
        val emp = findEmployeeBySalary(userList, inputSalary)
        emp.callToClient("Best client")
    }catch (e: Exception){
        println(e.message)
    }
}

class SomeEmployee(
        val name: String,
        val salary: Int
) {
    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee {
    for (emp in employees)
        if (emp.salary == salary)
            return emp
    throw Exception("No found employee with salary - $salary")
}