package br.com.brenofarias.bytebank.model

class Client(
    val name: String,
    val cpf: String,
    val address: Address = Address(),
    val password: Int
): Authenticate {
    override fun authenticate(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}