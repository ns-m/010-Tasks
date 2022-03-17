/*
В программе каршеринга в зависимости от возраста и стажа водителя доступны разные авто. Озвучены следующие требования.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

Написать функцию, которой на вход приходят возраст и стаж водителя.
Функция должна вернуть сообщение о том может ли он пользоваться каршерингом и какие авто ему доступны.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {

    val age = readLine()!!.toInt()
    val drivingExperience = readLine()!!.toInt()

    println(checkDriver(age, drivingExperience))
}

fun checkDriver(age: Int, drivingExperience: Int): String{
    val result = if (age >= 26 && drivingExperience >=6 )
        "Crashing is available. Available premium machines"
        else if (age < 21 || drivingExperience < 2)
            "Crashing is NOT available."
        else
            "Crashing is available. Available NORMAL auto"
    return result
}