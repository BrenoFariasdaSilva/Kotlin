package br.com.brenofarias.bytebank.model

class Analist(
    cpf: String,
    name: String,
    salary: Double
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
) {
    // : br.com.brenofarias.bytebank.model.Employee == extends br.com.brenofarias.bytebank.model.Employee. It represents thar the br.com.brenofarias.bytebank.model.Manager class inheritance from class br.com.brenofarias.bytebank.model.Employee

    //    override val bonus: Double
//        get() { // override is used to rewrite a method which is already written inside mother-class.
//            return this.salary * 0.10 + this.salary
//        }
    override val bonus: Double
        get() {
            return this.salary * 0.1
        }
}