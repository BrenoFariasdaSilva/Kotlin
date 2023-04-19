package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

// MainActivity extends AppCompatActivity
// AppCompatActivity is a subclass of Activity that supports all modern Android features and backward compatibility
// Using AppCompatActivity makes your app available to the largest number of devices.

// In onCreate(), you specify which layout is associated with the activity, and you inflate the layout.
// The setContentView() method does both those things.
// The R class includes all the app's assets, including the contents of the res directory.

// The Kotlin code in MainActivity is responsible for defining the interactive parts of your app, such as what happens when you tap a button.
// To write a function that executes when the button is clicked, you need to get a reference to the Button object in your inflated layout in MainActivity.

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {rollDice()}

        diceImage = findViewById(R.id.dice_image)

//        val countUpButton: Button = findViewById(R.id.countUp_button)
//        countUpButton.setOnClickListener {countUp()}
    }

    private fun rollDice() {
        val randomInt: Int =  (1..6).random()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
//        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = randomInt.toString()
    }

//    private fun countUp() {
//        val resultText: TextView = findViewById(R.id.result_text)
//        println(resultText)
//
//        if (resultText.text == "Hello World!") {
//            resultText.text = "1"
//        } else {
//            var resultInt = resultText.text.toString().toInt()
//
//            if (resultInt < 6) {
//                resultInt++
//                resultText.text = resultInt.toString()
//            }
//        }
//    }
}



