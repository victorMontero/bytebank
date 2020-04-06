class Internship(
    name: String,
    id: String,
    salary: Double

    ) : Employee(
    name = name,
    id = id,
    salary = salary
) {

    override val bonus: Double
        get() {
            return super.bonus + salary * 0.10
        }
}