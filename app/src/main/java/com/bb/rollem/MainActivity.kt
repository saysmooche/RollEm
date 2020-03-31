package com.bb.rollem

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

    }

        private fun rollDice() {
            diceImage.setImageResource(rolldice2())
            diceImage2.setImageResource(rolldice2())
        }

        private fun rolldice2(): Int {
            val randomInt = (1..6).random()

            return when (randomInt) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
        }
    }

//Answer these questions

//Question 1
//What is the name of the layout file for the main activity?
//
//MainActivity.java
//AndroidManifest.xml
//activity_main.xml <-------------Answer
//build.gradle

//Question 2
//What is the name of the string resource that specifies the app's name?
//
//app_name <-------------Answer
//xmlns:app
//android:name
//applicationId

//Question 3
//Which tool do you use to create a new emulator?
//
//Android Device Monitor
//AVD Manager <-------------Answer
//SDK Manager
//Theme Editor