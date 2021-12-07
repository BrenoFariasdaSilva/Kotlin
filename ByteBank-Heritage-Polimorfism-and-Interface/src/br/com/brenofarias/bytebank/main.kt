import br.com.brenofarias.bytebank.model.Address
import java.lang.IllegalStateException

// You are able to use an "alias" with the command "as":
// Example: import java.lang.String as StringJava

fun main() {
    var address: Address? = Address(logradouro = "Capitao indio bandeira", complement =  "Predio")
    val newLogradouro: String? = address?.logradouro

    address?.let { address: Address ->
        println(address.logradouro.length)
        val complementSize : Int = address.complement?.length ?: throw IllegalStateException("Complement cant be empty")
        println(complementSize)
    }

    test("")
}

fun test (value: Any) {
    val number: Int? = value as? Int
    println(number)
}

