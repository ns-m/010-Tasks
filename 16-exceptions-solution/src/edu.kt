fun main (){

    val user1 = Employee("Lee", 320)
    val user2 = Employee("Den", 480)
    val user3 = Employee("Joe", 330)
    val user4 = Employee("Sue", 450)
    val user5 = Employee("JoeS")
    val user6 = Employee("SueS", 450)
    val user7 = Employee("LeeL", 320)
/*    user1.callToClient("Client1")
    user2.callToClient("Client22")*/
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
        println("Emp ${name}: call client $clientName")
    }
    fun startProject(projectName: String){
        projects.add(projectName)
        println("Employee ${name}: starts project ${projectName}")
    }
    fun userProjects(){
        for (project in projects)
            println("List user projects - $project")
    }
}