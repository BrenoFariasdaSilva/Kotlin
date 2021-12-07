import br.com.brenofarias.bytebank.model.CheckingAccount
import br.com.brenofarias.bytebank.model.Client

fun testCopiesAndReferencesToAccounts() {
    val numberX = 10
    var numberY = numberX // Copy of the current numberX value
    numberY++
    println("NumberX: $numberX")
    println("NumberY: $numberY")

    val amanda = Client (name = "Amanda", cpf = "123.321.123-55", password = 1997)
    val amandaAccount = CheckingAccount(owner = amanda, number = 6969)
    val newAccount = amandaAccount // newAccount points to amandaAccount!

    println("br.com.brenofarias.bytebank.model.Account Owner Amanda: ${amandaAccount.owner}")
    println("br.com.brenofarias.bytebank.model.Account Owner Random: ${newAccount.owner}")
    println(amandaAccount)
    println(newAccount) // newAccount references to amandaAccount.
}