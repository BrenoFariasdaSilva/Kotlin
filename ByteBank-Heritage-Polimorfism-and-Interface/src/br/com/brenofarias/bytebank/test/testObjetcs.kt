package br.com.brenofarias.bytebank.test

import br.com.brenofarias.bytebank.model.Account
import br.com.brenofarias.bytebank.model.Client
import br.com.brenofarias.bytebank.model.SavingsAccount

fun testObjects() {
    val breno = Client(name = "Breno Farias", cpf = "111.222.333-45", password = 1000)
    val savingsAccount = SavingsAccount (owner = breno, number = 1990)
    println("total Accounts: ${Account.Counter.total}")
}