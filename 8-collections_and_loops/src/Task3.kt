/*
Для классов User и Car из задач по дата-классам написать функцию, которая принимает на вход список автомобилей
и пользователя и выдает список только тех автомобилей из исходного списка, которые доступны данному пользователю.

Дата-классы User и Car уже описаны в этом разделе и достуны здесь.

Проверьте работу написанной функции на примере каких-нибудь входных данных.
*/
import User
import Car

fun checkGeneralUser(usersData: List<User>): MutableList<String> {

    val generalList = mutableListOf<String>()
    for (user in usersData)
        if (user.age in 21..26 && user.experience in 2..6)
            generalList.add(user.name)
    return generalList
}

fun checkLuxlUser(usersData: List<User>): MutableList<String>{

    val luxList = mutableListOf<String>()
    for (user in usersData)
        if (user.age > 26 && user.experience > 6)
            luxList.add(user.name)
    return luxList
}

fun addGeneralCar(carsData: List<Car>): MutableList<String>{

    val generalCarsList = mutableListOf<String>()
    for (car in carsData)
        if (car.cost <= 500.0)
            generalCarsList.add(car.brand)
    return generalCarsList
}

fun addLuxCar(carsData: List<Car>): MutableList<String>{

    val luxCarsList = mutableListOf<String>()
    for (car in carsData)
        if (car.cost > 500.0)
            luxCarsList.add(car.brand)
    return luxCarsList
}

fun main() {

    val user1 = User("Lee", 22, 2)
    val user2 = User("Den", 28, 7)
    val user3 = User("Joe", 23, 3)
    val user4 = User("Sue", 35, 1)
    val users = mutableListOf(user1, user2, user3, user4)

    val car1 = Car("Lada", "Lada 8", 50.0)
    val car2 = Car("Niva", "4x4", 100.5)
    val car3 = Car("Nissan", "x-Trail", 250.0)
    val car4 = Car("Audi", "Q7", 600.0)
    val car5 = Car("BMW", "X5", 620.5)
    val car6 = Car("Mersedes", "GML400", 650.3)
    val cars = mutableListOf(car1, car2, car3, car4, car5, car6)

    val generalUsers = checkGeneralUser(users)
    val luxlUsers = checkLuxlUser(users)
    val generalCars = addGeneralCar(cars)
    val luxCars = addLuxCar(cars)

    for (user in generalUsers)
        println("Уважаемый клиент $user Вам доступны машины $generalCars")
    for (user in luxlUsers)
        println("Уважаемый клиент $user Вам доступны машины $luxCars")
}