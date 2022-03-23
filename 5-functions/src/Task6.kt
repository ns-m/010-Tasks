/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

Написать функцию, принимающую на вход марку авто(String), возраст и стаж пользователя и возвращающую
Boolean (доступно ему это авто или нет)

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/


fun main() {

    val modelAuto:String = readLine().toString()
    val age = readLine()!!.toInt()
    val drivingExperience = readLine()!!.toInt()

    println(driverCheck (modelAuto, age, drivingExperience))

}

fun driverCheck (modelAuto: String, age: Int, drivingExperience: Int): Boolean{
    return (modelAuto.contains("Audi") || modelAuto.contains("BMW")) && age >= 26 && drivingExperience >=6
}