/*
fun main (){

    val user1 = Employee("Lee", 320)
    val user2 = Employee("Den", 480)
    val user3 = Employee("Joe", 330)
    val user4 = Employee("Sue", 450)
    val user5 = Employee("JoeS")
    val user6 = Employee("SueS", 450)
    val user7 = Employee("LeeL", 320)
*/
/*    user1.callToClient("Client1")
    user2.callToClient("Client22")*//*

    user3.startProject("'Project 'Morning star''")
    user3.startProject("'Project 'Black Sea''")
    user3.startProject("'Project 'Blue fish''")
    user3.userProjects()
    user6.startProject("'Project 'Barbarian''")
    user6.userProjects()
}

class Employee(
    val name: String,
    val salary: Int = 250

){
    private val projects: MutableList<String> = mutableListOf<String>()

    fun callToClient(clientName: String){
        println("Emp $name: call client $clientName")
    }
    fun startProject(projectName: String){
        projects.add(projectName)
        println("Employee $name: starts project $projectName")
    }
    fun userProjects(){
        for (project in projects)
            println("List user projects - $project")
    }
}*/

/*
open class Employee(val name: String,val salary: Int) {
    private val projects: MutableList<String> = mutableListOf<String>()
    fun startProject(projectName: String) {
        projects.add(projectName)
        println("Employee $name: starts project $projectName")
    }
    fun userProjects() {
        println("List user $name projects - ${projects.joinToString()}")
    }
}

class Programmer(name: String, salary: Int): Employee(name, salary){
    fun readArticle(articleName: String){
        println("Programmer $name read $articleName")
    }
}

class Manager(name: String, salary: Int): Employee(name, salary){
    fun callToClient(clientName: String) {
        println("Emp $name: call client $clientName")
    }
}
fun main(){
    val programmer1 = Programmer("Lee", 320)
    val programmer2 = Programmer("Den", 480)
    val programmer3 = Programmer("Joe", 330)
    val programmer4 = Programmer("Sue", 450)
    val programmer5 = Programmer("Joseph", 510)

    val manager1 = Manager("SueM", 450)
    val manager2 = Manager("LeeM", 320)

    val employees = mutableListOf<Employee>(programmer1, programmer2, programmer3, programmer4,programmer5, manager1, manager2)

    programmer1.startProject("'Project 'Morning star''")
    programmer3.startProject("'Project 'Flashmobe''")
    programmer5.startProject("'Project 'Black Sea''")
    programmer5.startProject("'Project 'Blue fish''")
    manager1.startProject("'Project 'Barbarian''")

    for (emp in employees)
        if (emp.salary > 330)
            emp.startProject("General impotant project!")
    for (emp in employees)
        emp.userProjects()

}*/

/*
abstract class Employee(val name: String, val salary: Int) {
    protected val projects: MutableList<String> = mutableListOf<String>()
    abstract fun startProject(projectName: String)
    fun userProjects() {
        println("List user $name projects - ${projects.joinToString()}")
    }
}

class Programmer(name: String, salary: Int): Employee(name, salary){
    fun readArticle(articleName: String){
        println("Programmer $name read $articleName")
    }
    override fun startProject(projectName: String) {
        projects.add(projectName)
        println("Programmer $name: starts project $projectName")
    }
}

class Manager(name: String, salary: Int): Employee(name, salary){
    fun callToClient(clientName: String) {
        println("Emp $name: call client $clientName")
    }
    override fun startProject(projectName: String) {
        projects.add(projectName)
        println("Manager $name: get project $projectName to programmers")
    }
}
fun main(){
    val programmer1 = Programmer("Lee", 320)
    val programmer2 = Programmer("Den", 480)
    val programmer3 = Programmer("Joe", 330)
    val programmer4 = Programmer("Sue", 450)
    val programmer5 = Programmer("Joseph", 510)

    val manager1 = Manager("SueM", 450)
    val manager2 = Manager("LeeM", 320)

    val employees = mutableListOf<Employee>(programmer1, programmer2, programmer3, programmer4,programmer5, manager1, manager2)

    programmer1.startProject("'Project 'Morning star''")
    programmer3.startProject("'Project 'Flashmobe''")
    programmer5.startProject("'Project 'Black Sea''")
    programmer5.startProject("'Project 'Blue fish''")
    manager1.startProject("'Project 'Barbarian''")

    for (emp in employees)
        if (emp.salary > 330)
            emp.startProject("General impotant project!")
    for (emp in employees)
        emp.userProjects()

    for (emp in employees)
        emp.startProject("Some project")

}*/

/*
abstract class Employee(val name: String, val salary: Int) {
    protected val projects: MutableList<String> = mutableListOf<String>()
    abstract fun startProject(projectName: String)
    fun userProjects() {
        println("List user $name projects - ${projects.joinToString()}")
    }
}

class Programmer(name: String, salary: Int): Employee(name, salary), ClientsWorcker{
    fun readArticle(articleName: String){
        println("Programmer $name read $articleName")
    }
    override fun startProject(projectName: String) {
        projects.add(projectName)
        println("Programmer $name: starts project $projectName")
    }

    override fun callToClient(clientName: String) {
        TODO("Not yet implemented")
    }

    override fun writeEmail(clientName: String) {
        TODO("Not yet implemented")
    }
}

class Manager(name: String, salary: Int): Employee(name, salary), ClientsWorcker{
    override fun callToClient(clientName: String) {
        println("Emp $name: call client $clientName")
    }

    override fun writeEmail(clientName: String) {
        println("Manager $name: send email client $clientName")
    }

    override fun startProject(projectName: String) {
        projects.add(projectName)
        println("Manager $name: get project $projectName to programmers")
    }
}

class Robot(val id: Int): ClientsWorcker{

    override fun callToClient(clientName: String) {
        println("Robot $id: call client $clientName")
    }

    override fun writeEmail(clientName: String) {
        println("Robot $id: send email client $clientName")
    }
}

interface ClientsWorcker{
    fun callToClient(clientName: String)
    fun writeEmail(clientName: String)
}

fun main(){
*/
/*    val programmer1 = Programmer("Lee", 320)
    val programmer2 = Programmer("Den", 480)
    val programmer3 = Programmer("Joe", 330)
    val programmer4 = Programmer("Sue", 450)
    val programmer5 = Programmer("Joseph", 510)

    val manager1 = Manager("SueM", 450)
    val manager2 = Manager("LeeM", 320)

    val employees = mutableListOf<Employee>(programmer1, programmer2, programmer3, programmer4,programmer5, manager1, manager2)

    programmer1.startProject("'Project 'Morning star''")
    programmer3.startProject("'Project 'Flashmobe''")
    programmer5.startProject("'Project 'Black Sea''")
    programmer5.startProject("'Project 'Blue fish''")
    manager1.startProject("'Project 'Barbarian''")*//*


    val robot1 = Robot(101)
    robot1.callToClient("Some company")
    val manager1 = Manager("SueM", 450)
    manager1.callToClient("Some client")

    val clientsWorcker = listOf<ClientsWorcker>(robot1, manager1)

    for (clWrc in clientsWorcker)
        clWrc.callToClient("Very impotant client")

}
*/

/*
fun main(){
    val inputChildrensCounter: Int? = null
    val childrenCounter = inputChildrensCounter ?: 0
}*/

/*
class Rectangle(val x: Int, val y: Int){
    fun rectangleArea(){
        println(x*y)
    }
}

fun main(){
    val rectangle: Rectangle? = null
*/
/*    if (rectangle != null){
        rectangle.rectangleArea()
    }*//*

    rectangle?.rectangleArea()
}*/

/*
fun main(){
    val xString = "r10r"
    val y = 5
    try {
        val x = xString.toInt()
        val result = x/y
        println(result)
    }catch (e: Exception){
        println(e.toString())
    }catch (e: NumberFormatException){
        println(e.toString())
    }
}*/

fun singIn(login: String, password: String, confirmPass: String){
    if (login.length < 5)
        throw Exception("Login too short")
    if (password.length > 20)
        throw Exception("Password too long")
    if (password != confirmPass)
        throw Exception("Confirm password fail")

    //send data "sing in" to server
}

fun main(){
    val login = readLine().toString()
    val password = readLine().toString()
    val confirmPass = readLine().toString()

    try {
        singIn(login, password, confirmPass)
    }catch (e: Exception){
        println(e.message)
    }
}
