fun main() {
    welcomeMessage()
//    basicCommands()
//    testConditionals(balance)S
    testLoops()
}

fun welcomeMessage () {
    val name = "Breno Farias"
    println("Welcome to ByteBank, $name! \n")
}
fun basicCommands () {
    // var is a variable which content  can be changed
    // val is a variable which content can't be changed.
    // When you declare any variable, you need to initialize it. Avoids bad-coding habit.
    // You can in a explict way declare the variable type! Example: val owner: String = "Breno"
    val owner: String = "Breno Farias"
    val accountNumber: Int = 1337
    var balance: Double = 0.0
    balance = 100.0
    balance += 400
    // print won't use /n, but println will.
    // Avaliable from Java: println("owner: " + owner);
    // You can also use String template.
    println("Owner: $owner")
    // println(owner)
    println("Account Number: $accountNumber")
    println("Balance: $balance")
    println()
}

fun testConditionals (balance: Double) { // You have to specify the variable type!
    //    if (balance > 0.0) {
    //        println("Positive account")
    //    } else if (balance == 0.0 ) {
    //        println("Neutral account")
    //    } else {
    //        println("Negative account")
    //    }

    when { // Similar to switch-case.
        balance > 0.0 -> { // Or just: balance > 0.0 -> println("Positive account")
            println("Positive account")
        }
        balance == 0.0 -> { // Or just: balance == 0.0 -> println("Neutral account")
            println("Neutral account")
        }
        else -> { // Or just: else -> println("Negative account")
            println("Negative account")
        }
    }
}

fun testLoops() {
//    increaseFor ()
//    decreaseFor ()
//    whileLoop()
    doWhileLoop()
}

fun increaseFor () {
    for (i in 1..5) {
        val owner: String = "Client $i"
        val accountNumber: Int = 1336 + i
        var balance: Double = 1000.0  * i
        println("Owner: $owner")
        println("Account Number: $accountNumber")
        println("Balance: $balance")
        println()
    }
}

fun decreaseFor () {
    for (i in 5 downTo 1 step 2) {
        if (i == 3) {
            continue
        }

        if (i == 1) {
            break
        }

        val owner: String = "Client $i"
        val accountNumber: Int = 1336 + i
        var balance: Double = 1000.0  * i
        println("Owner: $owner")
        println("Account Number: $accountNumber")
        println("Balance: $balance")
        println()
    }
}

fun whileLoop () {
    var i = 0
    while (i < 5) {
        val owner: String = "Client $i"
        val accountNumber: Int = 1336 + i
        var balance: Double = 1000.0  * i
        println("Owner: $owner")
        println("Account Number: $accountNumber")
        println("Balance: $balance")
        println()
        i++
    }
}

fun doWhileLoop() {
    var i = 5
    do {
        val owner: String = "Client $i"
        val accountNumber: Int = 1336 + i
        var balance: Double = 1000.0  * i
        println("Owner: $owner")
        println("Account Number: $accountNumber")
        println("Balance: $balance")
        println()
        i--
    } while (i != 0)
}