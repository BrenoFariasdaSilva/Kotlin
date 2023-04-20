fun testConditionals(balance: Double) { // You have to specify the variable type!
    //    if (balance > 0.0) {
    //        println("Positive account")
    //    } else if (balance == 0.0 ) {
    //        println("Neutral account")
    //    } else {
    //        println("Negative account")
    //    }

    when { // Similar to switch-case.
        balance > 0.0 -> { // Or just: balance > 0.0 -> println("Positive account")
            println("Positive account")
        }
        balance == 0.0 -> { // Or just: balance == 0.0 -> println("Neutral account")
            println("Neutral account")
        }
        else -> { // Or just: else -> println("Negative account")
            println("Negative account")
        }
    }
}