package com.k3kc.viewmodelexample

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var data = RandomNumber()
        //var data = ViewModelProviders.of(this).get(RandomNumber::class.java)
        //textHolder.text = data.getNumber()

        var app = packageManager.getApplicationInfo("com.k3kc.viewmodelexample", PackageManager.GET_META_DATA)


        //Log.d("AAA0", PackageManager.GET_META_DATA.toString())

        var bundle = app.metaData
        if(bundle == null) {
            Log.d("AAA1 ", "Bundle is null")
        } else
            Log.d("AAA2 ", bundle.getString("unity.intent"))

        var data = ViewModelProviders.of(this).get(RNModel::class.java)
        var mNumber = data.getNumber()

        button.setOnClickListener {
            data.createRandomNumber()
            data.getNumber()
        }

        mNumber.observe(this, Observer<String> {
            textHolder.text = it
        })

    }
}
