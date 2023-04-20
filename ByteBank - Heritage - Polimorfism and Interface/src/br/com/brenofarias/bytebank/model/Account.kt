package br.com.brenofarias.bytebank.model

import br.com.brenofarias.bytebank.exception.AuthenticationFailedException
import br.com.brenofarias.bytebank.exception.InsufficientBalanceException

var totalAccount = 0
    private set

abstract class Account(
    val owner: Client, // "Owner" stores one object of Client class
    val number: Int
): Authenticate { // If you wanted to have a standard value, just use: val number: Int = 0
    // Add () if you want to change the primary constructor
    //    private var owner = ""
    //    private var number = 0
    var balance = 0.0
        protected set

    companion object Counter {
        var total = 0
            private set // Setting this property setter as private. Read-only outside
    }

//    constructor(owner: String, number:  Int) {
//        this.owner = owner
//        this.number = number
//    }

    init { // Like a constructor, but without the need to get/send parameters.
        Counter.total++
    }

    fun deposit(value: Double) {
        if (value > 0) {
            this.balance += value
        }
    }

    open fun withdraw(value: Double): Boolean {
        if (this.balance <= value) {
            this.balance -= value
            return true
        }
        return false
    }

    fun transfer(destinyAccount: Account, value: Double, password: Int) {
        if (balance < value) {
            throw InsufficientBalanceException(message = "Balance is insufficient. Actual balance: $balance. Value for transference $value")
        }

        if (this.withdraw(value)) {
            destinyAccount.deposit(value)
        }

        if (!authenticate(password)) {
            throw AuthenticationFailedException()
        }
    }

    override fun authenticate(password: Int): Boolean {
        return owner.authenticate(password)
    }
}