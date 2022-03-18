/*
Даны классы
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функцию, которая на вход принимает объект класса Department и возвращает средний возраст сотрудников этого отдела
Проверить работу написанной функции на примере каких-нибудь входных данных.
*/
import Department
import Employee

fun averageAgeDepartment(users:List<Department>): Int {

    var sumAge: Int = 0
    var i: Int = 0
    val dep: String = readLine().toString()
    for (user in users){
        while (user.name == dep && i < users.size){
            sumAge += user.employees[i].age
            i++
            }
        }
    return sumAge/users.size
}

fun main() {

    val user1 = Employee("Lee", 32)
    val user2 = Employee("Den", 48)
    val user3 = Employee("Joe", 33)
    val user4 = Employee("Sue", 45)
    val users1 = mutableListOf(user1, user2)
    val users2 = mutableListOf(user3, user4)

    val poolDep1 = Department("Dep1", users1)
    val poolDep2 = Department("Dep2", users2)
    val poolDeps = mutableListOf(poolDep1, poolDep2)

    println(averageAgeDepartment(poolDeps))
}
