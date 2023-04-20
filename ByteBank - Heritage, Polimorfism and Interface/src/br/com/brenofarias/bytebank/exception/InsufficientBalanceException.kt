package br.com.brenofarias.bytebank.exception

class InsufficientBalanceException (message: String = "Your balance is insufficient"): Exception(message) {

}