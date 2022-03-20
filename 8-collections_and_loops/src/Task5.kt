/*
Дана следующая структура классов.
Компания: data class Company(val name: String, val departments: List<Department>)
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функции для подсчета общего количества человек, работающих в заданной компании и их среднего возраста:
fun totalNumberOfEmployees(company: Company): Int
fun averageAgeOfEmployees(company: Company): Int

Для этой задачи есть видео с разбором.
*/
import Company
import Department
import Employee

fun totalNumberOfEmployees(company: Company): Int{

/*    var counter: Int = 0
    var i: Int = 0
    while (i < company.departments.size){
        company.departments[i].employees.forEach{u -> if (company.departments[i].employees.size != 0) counter += 1}
        i ++
    }
    return counter*/

    var counter: Int = 0
    for (dep in company.departments)
        counter += dep.employees.size
    return counter
}

fun averageAgeOfEmployees(company: Company): Double{

/*    var counter: Int = 0
    var i: Int = 0
    while (i < company.departments.size){
        var i2: Int = 0
        while (i2 < company.departments[i].employees.size){
            counter += company.departments[i].employees[i2].age
            i2++
        }
        i++
    }
    return counter*/

    var counter: Int = 0
    var sumAge: Int = 0
    for (dep in company.departments)
        for (emp in dep.employees){
            counter++
            sumAge += emp.age
        }
    return sumAge.toDouble()/counter.toDouble()
}

fun main() {

    val user1 = Employee("Lee", 32)
    val user2 = Employee("Den", 48)
    val user3 = Employee("Joe", 33)
    val user4 = Employee("Sue", 45)
    val user5 = Employee("JoeS", 33)
    val user6 = Employee("SueS", 45)
    val user7 = Employee("LeeL", 32)
//    val user8 = Employee("DenN", 34)

    val poolDep1 = Department("Dep1", mutableListOf(user1, user2, user5, user7))
    val poolDep2 = Department("Dep2", mutableListOf(user3, user4, user6))
//  val poolDep3 = Department("Dep3", users3)


    val com = Company("BEst Com", listOf(poolDep1, poolDep2))

    println("Total workers - ${totalNumberOfEmployees(com)}")
    println("Middle age workers - ${averageAgeOfEmployees(com)}")
}