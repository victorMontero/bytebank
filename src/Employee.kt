open class Employee(
    val name: String,
    val id: String,
    val salary: Double
) {

    //    exemple of single expression function
    open val bonus: Double
        get() = salary * 0.1

}