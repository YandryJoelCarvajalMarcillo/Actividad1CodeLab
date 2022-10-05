package com.example.actividad1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main() {
    val myFirstDice = Dice(6)
    println("Tus dados de ${myFirstDice.numSides} caras tiraron ${myFirstDice.roll()}!")

    val mySecondDice = Dice(20)
    println("Tus dados de ${mySecondDice.numSides} caras tiraron ${mySecondDice.roll()}!")
}

class Dice (val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}