import br.com.brenofarias.bytebank.model.CheckingAccount
import br.com.brenofarias.bytebank.model.Client
import br.com.brenofarias.bytebank.model.SavingsAccount

public fun testDifferentAccounts() {
    val brenoChecking = CheckingAccount(
        owner = Client(name = "Breno", cpf = "000.111.123-45", password = 2001),
        number = 1337
    )

    val brenoSavings = SavingsAccount(
        owner = Client(name = "Breno", cpf = "000.111.123-45", password = 2002),
        number = 1357
    )

    brenoChecking.deposit(value = 100000.00)
    brenoSavings.deposit(value = 5000.00)

    println("Checking Balance: ${brenoChecking.balance}")
    println("Savings Balance: ${brenoSavings.balance}")

    brenoChecking.withdraw(value = 1000.00)
    brenoSavings.withdraw(value = 500.00)

    println("Checking Balance After Withdraw: ${brenoChecking.balance}")
    println("Savings Balance After Withdraw: ${brenoSavings.balance}")

    brenoChecking.transfer(value = 1000.00, destinyAccount = brenoSavings, password = 2001)

    println("Checking Balance After Transfer to Savings: ${brenoChecking.balance}")
    println("Savings Balance After Transfer to Checking: ${brenoSavings.balance}")

    brenoSavings.transfer(value = 1000.00, destinyAccount = brenoChecking, password = 2002)

    println("Checking Balance After Transfer to Savings: ${brenoChecking.balance}")
    println("Savings Balance After Transfer to Checking: ${brenoSavings.balance}")
}