package com.k3kc.viewmodelexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class RNModel: ViewModel() {

    var mRandomNumber = MutableLiveData<String>()
    var mInitalized: Boolean = false

    fun getNumber(): MutableLiveData<String> {
        if(!mInitalized)
            createRandomNumber()
        return mRandomNumber
    }

    fun createRandomNumber() {
        var random = Random
        mRandomNumber.value = "New random value is ${random.nextInt(100)}"
        mInitalized = true
    }

}