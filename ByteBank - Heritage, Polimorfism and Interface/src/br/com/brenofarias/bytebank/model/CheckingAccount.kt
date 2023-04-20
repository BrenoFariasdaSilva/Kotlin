package br.com.brenofarias.bytebank.model

class CheckingAccount(
    owner: Client,
    number: Int
) : Account(
    owner = owner,
    number = number
) {
    override fun withdraw(value: Double): Boolean {
        val valuePlusTaxes = value + 0.10
        if (this.balance >= valuePlusTaxes) {
            this.balance -= valuePlusTaxes
            return true
        }
        return false
    }
}