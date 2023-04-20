package br.com.brenofarias.bytebank.test

import br.com.brenofarias.bytebank.exception.InsufficientBalanceException

fun functionOne () {
    println("FunctionOne Start")
    try {
        functionTwo()
    } catch (exception: InsufficientBalanceException) {
        exception.printStackTrace()
    }

    println("FunctionOne End")
}

fun functionTwo () {
    println("FunctionTwo Start")
    for (i in 1..5) {
        println(i)
        throw InsufficientBalanceException()
    }
    println("FunctionTwo End")
}