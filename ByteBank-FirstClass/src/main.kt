fun main() {
    val myAccount = Account(owner = "Breno Farias", number = 1337)
    myAccount.deposit(value = 1000.0)
    println(myAccount.owner)
    println(myAccount.number)
    println(myAccount.balance)

    val secondAccount = Account(owner = "Manoel Campos", number = 1357)
    secondAccount.deposit(value = 102000.0)
    println(secondAccount.owner)
    println(secondAccount.number)
    println(secondAccount.balance)

    println("Depositi inside myaccount")
    myAccount.deposit(value = 100.0)
    println(myAccount.balance)

    println("Using Transfer method: ")
    if (myAccount.transfer(secondAccount, value = 100.0)) {
        println("Transfer successfully")
    } else {
        println("Transfer failed")
    }

//    testCopiesAndReferences
}

class Account(
    val owner: String,
    val number: Int
) { // If you wanted to have a standard value, just use: val number: Int = 0
    // Add () if you want to change the primary constructor
    //    private var owner = ""
//    private var number = 0
    var balance = 0.0
        private set

//    constructor(owner: String, number:  Int) {
//        this.owner = owner
//        this.number = number
//    }

    fun deposit(value: Double) {
        if (value > 0) {
            this.balance += value
        }
    }

    fun withdraw(value: Double): Boolean {
        if (this.balance <= value) {
            this.balance -= value
            return true
        }
        return false
    }

    fun transfer(destinyAccount: Account, value: Double): Boolean {
        if (this.withdraw(value)) {
            destinyAccount.deposit(value)
            return true
        }
        return false
    }
}

fun testCopiesAndReferences() {
    val numberX = 10
    var numberY = numberX // Copy of the current numberX value
    numberY++
    println("NumberX: $numberX")
    println("NumberY: $numberY")

    val amandaAccount = Account(owner = "Amanda Farias", number = 6969)
    val newAccount = amandaAccount // newAccount points to amandaAccount!

    println("Account Owner Amanda: ${amandaAccount.owner}")
    println("Account Owner Random: ${newAccount.owner}")
    println(amandaAccount)
    println(newAccount) // newAccount references to amandaAccount.
}