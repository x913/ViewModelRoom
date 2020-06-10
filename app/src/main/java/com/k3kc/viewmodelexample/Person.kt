package com.k3kc.viewmodelexample

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "person")
class Person(var lname: String, var fname: String) {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    lateinit var uid: Integer

    @ColumnInfo(name = "last_name")
    var last_name:String = lname
    var first_name:String = fname

}