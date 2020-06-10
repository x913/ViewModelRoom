package com.k3kc.viewmodelexample

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class RandomNumber: ViewModel() {

    var TAG: String = "AAA"
    var isInitalized: Boolean = false
    var randomNumber: Int = 0

    fun createRandomNumber() {
        Log.d(TAG, "CREATE NEW Random Number")
        var random = Random
        randomNumber = random.nextInt(100)
        isInitalized = true
    }

    fun getNumber(): String {
        if(!isInitalized) {
            createRandomNumber()
        }
        Log.d(TAG, "Return random number")
        return "Random number is $randomNumber"
    }

}