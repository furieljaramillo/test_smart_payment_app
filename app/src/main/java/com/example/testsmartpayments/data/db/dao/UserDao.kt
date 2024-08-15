package com.example.testsmartpayments.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.testsmartpayments.data.model.UserModel

@Dao
interface UserDao {

    @Query("SELECT * from user")
    fun getALlUser() : List<UserModel>

    @Insert
    fun insertUser(user : UserModel)

}