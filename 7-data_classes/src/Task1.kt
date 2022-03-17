/*
Опишите дата классы для хранения информации из задания 5 по функциям.
Для пользователя (User) должно храниться имя, возраст, стаж. Для автомобиля (Car): бренд, цена аренды

Переделайте задачи 5 и 6 из раздела функции на работу с этими дата-классами.
Т.е. функции должны принимать не возраст, стаж и бренд авто, а объекты классов User и Car
(функции пишите в этом файле заново)

Поля «имя» в классе User и «цена аренды» в классе Car никак не будут использоваться в тех функциях, которые вы напишите.
Это нормально. Не обязательно вся информация всегда нужна.

Проверьте работу написанных функций на примере каких-нибудь входных данных.
*/

fun main() {
    val driver = Driver(readLine().toString(), readLine()!!.toInt(), readLine()!!.toInt())
    val car = Car(readLine().toString(), readLine()!!.toInt())

    println(checkCrashing(driver))
    println(checkAuto(driver, car))
}

fun checkCrashing(user: Driver): String {
    val result: String = if (user.age >= 21 && user.drivingExperience >= 2)
        "Crashing is available"
    else
        "Crashing is NOT available"
    return result
}

fun checkAuto(user: Driver, car: Car): String{
    val result: String = if ((user.age >= 26 && user.drivingExperience > 6) && (car.modelCar.contains("Audi") || car.modelCar.contains("BMW")))
        "${user.name} - You is available premium machines ${car.modelCar} for ${car.costRent}"
    else
        ""
    return result
}

data class Driver(val name: String, val age: Int, val drivingExperience: Int)
data class Car(val modelCar: String, val costRent: Int)
