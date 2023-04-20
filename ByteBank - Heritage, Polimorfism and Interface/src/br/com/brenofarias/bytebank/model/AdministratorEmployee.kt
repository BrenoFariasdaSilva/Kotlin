package br.com.brenofarias.bytebank.model

abstract class AdministratorEmployee(
    // "abstract class" means the class is already open and have other implementations, although it can't have an instance
    // "open class" means this class can be inherited.
    cpf: String,
    name: String,
    salary: Double,
    protected val password: Int
) : Employee(
    cpf = cpf,
    name = name,
    salary = salary
), Authenticate {
    //    open val bonus: Double // With this property, you aren't allowed to initialize "bonus" val
//        get() { // Convert this property to function? open fun bonus(): Double = salary * 0.1
//            return this.salary * 0.10
//        } // Or just: open val bonus: Double get() = this.salary * 0.10

    override fun authenticate(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}
