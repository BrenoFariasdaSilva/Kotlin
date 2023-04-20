package br.com.brenofarias.bytebank.model

class BonusCalculator {
    var total: Double = 0.0
    private set

    fun register(employee: Employee) {
        this.total +=employee.bonus
    }
    // Polymorfism avoid you to have to create an if for each type of employee.


//    fun register(manager: br.com.brenofarias.bytebank.model.Manager) {
//        this.total +=manager.bonus
//    }
//
//    fun register(director: br.com.brenofarias.bytebank.model.Director) {
//        this.total +=director.bonus
//    }
}