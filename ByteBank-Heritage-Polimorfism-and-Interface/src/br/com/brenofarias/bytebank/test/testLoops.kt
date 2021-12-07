fun testLoops() {
//    increaseFor ()
//    decreaseFor ()
//    whileLoop()
    doWhileLoop()
}

fun increaseFor() {
    for (i in 1..5) {
        val owner: String = "br.com.brenofarias.bytebank.model.Client $i"
        val accountNumber: Int = 1336 + i
        var balance: Double = 1000.0 * i
        println("Owner: $owner")
        println("br.com.brenofarias.bytebank.model.Account Number: $accountNumber")
        println("Balance: $balance")
        println()
    }
}

fun decreaseFor() {
    for (i in 5 downTo 1 step 2) {
        if (i == 3) {
            continue
        }

        if (i == 1) {
            break
        }

        val owner: String = "br.com.brenofarias.bytebank.model.Client $i"
        val accountNumber: Int = 1336 + i
        var balance: Double = 1000.0 * i
        println("Owner: $owner")
        println("br.com.brenofarias.bytebank.model.Account Number: $accountNumber")
        println("Balance: $balance")
        println()
    }
}

fun whileLoop() {
    var i = 0
    while (i < 5) {
        val owner: String = "br.com.brenofarias.bytebank.model.Client $i"
        val accountNumber: Int = 1336 + i
        var balance: Double = 1000.0 * i
        println("Owner: $owner")
        println("br.com.brenofarias.bytebank.model.Account Number: $accountNumber")
        println("Balance: $balance")
        println()
        i++
    }
}

fun doWhileLoop() {
    var i = 5
    do {
        val owner: String = "br.com.brenofarias.bytebank.model.Client $i"
        val accountNumber: Int = 1336 + i
        var balance: Double = 1000.0 * i
        println("Owner: $owner")
        println("br.com.brenofarias.bytebank.model.Account Number: $accountNumber")
        println("Balance: $balance")
        println()
        i--
    } while (i != 0)
}