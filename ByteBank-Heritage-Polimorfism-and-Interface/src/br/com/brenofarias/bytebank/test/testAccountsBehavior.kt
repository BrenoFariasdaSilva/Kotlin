import br.com.brenofarias.bytebank.exception.AuthenticationFailedException
import br.com.brenofarias.bytebank.exception.InsufficientBalanceException
import br.com.brenofarias.bytebank.model.CheckingAccount
import br.com.brenofarias.bytebank.model.Client
import br.com.brenofarias.bytebank.model.SavingsAccount

public fun testAccountsBehavior() {
    val breno = Client(name = "Breno", cpf = "111.222.333-45", password = 2001)
    val myAccount = CheckingAccount(owner = breno, number = 1337)
    myAccount.deposit(value = 1000.0)
    println(myAccount.owner)
    println(myAccount.number)
    println(myAccount.balance)

    val manoel = Client(name = "Manoel", cpf = "111.222.333-99", password = 1980)
    val secondAccount = SavingsAccount(owner = manoel, number = 1357)
    secondAccount.deposit(value = 102000.0)
    println(secondAccount.owner)
    println(secondAccount.number)
    println(secondAccount.balance)

    println("Depositi inside myaccount")
    myAccount.deposit(value = 100.0)
    println(myAccount.balance)

    println("Using Transfer method: ")
    try {
        myAccount.transfer(destinyAccount = secondAccount, value = 100.0, password = 2001)
        println("Transfer successfully")
    } catch (exception: InsufficientBalanceException){
            println("Transfer failed")
            println("Insufficient balance")
            exception.printStackTrace()
    } catch (exception: AuthenticationFailedException) {
        println("Transfer failed")
        println("Authentication failed")
        exception.printStackTrace()
    } catch (exception: Exception) {
        println("Unknown error")
        exception.printStackTrace()
    }
}


