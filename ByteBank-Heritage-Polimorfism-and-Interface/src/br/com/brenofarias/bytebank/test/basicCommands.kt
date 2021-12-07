fun basicCommands() {
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
    println("br.com.brenofarias.bytebank.model.Account Number: $accountNumber")
    println("Balance: $balance")
    println()
}