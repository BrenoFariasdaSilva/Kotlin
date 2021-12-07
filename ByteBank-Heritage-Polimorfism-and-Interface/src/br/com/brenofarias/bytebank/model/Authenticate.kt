package br.com.brenofarias.bytebank.model

interface Authenticate { // Behind the scene, everything inside and interface is abstract.
    // You can't store values inside an interface.
//    val password: Int

     fun authenticate(password: Int): Boolean
}