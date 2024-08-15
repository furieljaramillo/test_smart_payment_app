package com.example.testsmartpayments.data.repository

import com.example.testsmartpayments.data.db.dao.UserDao
import com.example.testsmartpayments.data.model.UserModel
import com.example.testsmartpayments.domain.model.User
import com.example.testsmartpayments.domain.repository.UserRepository
import com.example.testsmartpayments.mappers.toUserData
import com.example.testsmartpayments.mappers.toUserDomain
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userDao: UserDao
) : UserRepository {

    override suspend fun getAllUser(): List<User> {
       return  withContext(Dispatchers.IO){
            userDao.getALlUser().map {
                it.toUserDomain()
            }
        }

    }

    override suspend fun insertUser(user :User) {
        withContext(Dispatchers.IO){
            userDao.insertUser(user.toUserData())
        }
    }
}