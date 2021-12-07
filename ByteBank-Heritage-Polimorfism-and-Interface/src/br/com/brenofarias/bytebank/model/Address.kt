package br.com.brenofarias.bytebank.model

class Address(
    var logradouro: String = "",
    var number: Int = 0,
    var bairro: String = "",
    var city: String = "",
    var state: String = "",
    var cep: String = "",
    var complement: String = ""
){
    override fun toString(): String {
        return """
        Address(logradouro='$logradouro', 
        number=$number, 
        bairro='$bairro', 
        city='$city', 
        state='$state', 
        cep='$cep', 
        comeplement='$complement')
        """.trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (logradouro != other.logradouro) return false
        if (number != other.number) return false
        if (bairro != other.bairro) return false
        if (city != other.city) return false
        if (state != other.state) return false
        if (cep != other.cep) return false
        if (complement != other.complement) return false

        return true
    }

    override fun hashCode(): Int {
        var result = logradouro.hashCode()
        result = 31 * result + number
        result = 31 * result + bairro.hashCode()
        result = 31 * result + city.hashCode()
        result = 31 * result + state.hashCode()
        result = 31 * result + cep.hashCode()
        result = 31 * result + complement.hashCode()
        return result
    }


}