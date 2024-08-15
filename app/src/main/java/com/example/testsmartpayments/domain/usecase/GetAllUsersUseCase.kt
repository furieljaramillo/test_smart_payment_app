package com.example.testsmartpayments.domain.usecase

import com.example.testsmartpayments.domain.model.User
import com.example.testsmartpayments.domain.repository.UserRepository
import javax.inject.Inject

class GetAllUsersUseCase @Inject constructor(private val userRepository: UserRepository) {

    suspend operator fun invoke(): List<User> = userRepository.getAllUser()

}