package br.com.brenofarias.bytebank.model

class SavingsAccount(
    owner: Client,
    number: Int
) : Account(
    owner = owner,
    number = number
) {
    override fun withdraw(value: Double): Boolean {
        if (this.balance >= value) {
            this.balance -= value
            return true
        }
        return false
    }
}