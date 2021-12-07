package br.com.brenofarias.bytebank.model

fun testExpression() {
    val input: String = "1.0"

    val receivedValue: Double? = try {
        input.toDouble()
    } catch (exception: NumberFormatException) {
        println("Invalid conversion")
        exception.printStackTrace()
        null
    }

    val valueWithTaxes: Double? = if (receivedValue != null) {
        receivedValue + 0.1
    } else {
        null
    }

    if (valueWithTaxes != null) {
        println("Value With Taxes: $valueWithTaxes")
    } else {
        println("Invalid value")
    }
}