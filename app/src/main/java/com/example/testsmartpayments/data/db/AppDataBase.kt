package com.example.testsmartpayments.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.testsmartpayments.data.db.dao.UserDao
import com.example.testsmartpayments.data.model.UserModel

@Database(entities = [UserModel::class], version = 1)
abstract class AppDataBase : RoomDatabase(){
    abstract fun userDao() : UserDao
}