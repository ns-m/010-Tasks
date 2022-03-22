fun main (){

    val user1 = Employee("Lee", 320)
    val user2 = Employee("Den", 480)
    val user3 = Employee("Joe", 330)
    val user4 = Employee("Sue", 450)
    val user5 = Employee("JoeS", 330)
    val user6 = Employee("SueS", 450)
    val user7 = Employee("LeeL", 320)

    user1.callToClient("Client1")
    user2.callToClient("Client22")
}

class Employee(
    val name: String,
    val salary: Int
){
    fun callToClient(clientName: String){
        println("Emp ${name}: call client $clientName")
    }
}