package com.k3kc.viewmodelexample

import androidx.room.*

@Dao
interface PersonDAO {
    @Insert
    fun insertPerson(person: Person)

    @Update
    fun updatePerson(person: Person)

    @Delete
    fun deletePerson(person: Person)

    @Query("select * from person")
    fun listPerson(): List<Person>
}