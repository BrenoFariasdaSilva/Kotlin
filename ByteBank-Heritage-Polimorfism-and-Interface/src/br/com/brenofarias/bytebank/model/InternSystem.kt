package br.com.brenofarias.bytebank.model

class InternSystem {
    fun login(administratorEmployee: Authenticate, password: Int) {
        if (administratorEmployee.authenticate(password)) {
            println("Welcome to ByteBank, administrator")
        } else {
            println("Failed while authenticating, please try again")
        }
    }
}