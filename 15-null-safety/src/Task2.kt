/*
Есть классы:
class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)

Напишите функцию fun employeeCity(employee: Employee): String, которая возвращает название города,
в которой располагается организация, в которой работает данный человек.
В случае если он нигде не работает (в company лежит null), функция должна выводить: «Неизвестен»
Используйте функции безопасного вызова и оператор элвис

Для этой задачи есть видео с разбором.
*/

fun main() {
    val addres1 = Address("1 Street", "NY")
    val addres2 = Address("2 Street", "Boston")
    val addres3 = Address("5 Avenu", "Atlanta")

    val company1 = Company("IBM", addres1)
    val company2 = Company("Apple", addres2)
    val company3 = Company("Apple", addres3)

    val user1 = Employee("Lee", company1)
    val user2 = Employee("Den", company1)
    val user3 = Employee("Joe", company2)
    val user4 = Employee("Sue", null)

    println(employeeCity(user4))

}
fun employeeCity(employee: Employee): String{
    val result = employee.company?.address?.city ?: "Unknown"
    return result
}

class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)