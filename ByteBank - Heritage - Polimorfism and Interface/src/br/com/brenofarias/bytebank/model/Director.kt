package br.com.brenofarias.bytebank.model

class Director (
    cpf: String,
    name: String,
    salary: Double,
    password: Int,
    val plr: Double
) : AdministratorEmployee(
    name = name,
    cpf = cpf,
    salary = salary,
    password = password
) {
    // : br.com.brenofarias.bytebank.model.Employee == extends br.com.brenofarias.bytebank.model.Employee. It represents that the br.com.brenofarias.bytebank.model.Manager class inheritance from class br.com.brenofarias.bytebank.model.Employee
//    override val bonus: Double
//        get() { // override is used to rewrite a method which is already written inside mother-class.
//            return super.bonus() + this.salary + plr
//        }
    override val bonus: Double
        get() {
            return this.salary + plr
        }

    override fun authenticate(password: Int): Boolean {
        return super<AdministratorEmployee>.authenticate(password)
    }
}