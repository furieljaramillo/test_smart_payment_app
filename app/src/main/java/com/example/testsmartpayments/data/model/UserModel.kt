package com.example.testsmartpayments.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserModel (
    @PrimaryKey(autoGenerate = true)
    var id : Int = 0,
    var name : String = "",
    var paternalSurname : String = "",
    var maternalSurname : String = "",
    var dateOfBirth : String = "",
    var country : String = ""

)