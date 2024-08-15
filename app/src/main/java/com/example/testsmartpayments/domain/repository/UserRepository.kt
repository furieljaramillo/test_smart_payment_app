package com.example.testsmartpayments.domain.repository

import com.example.testsmartpayments.data.model.UserModel
import com.example.testsmartpayments.domain.model.User

interface UserRepository {
    suspend fun getAllUser() : List<User>

    suspend fun insertUser(user : User)
}