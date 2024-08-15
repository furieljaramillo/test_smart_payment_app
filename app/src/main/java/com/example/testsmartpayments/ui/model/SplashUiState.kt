package com.example.testsmartpayments.ui.model

import com.example.testsmartpayments.domain.model.User

data class SplashUiState(
    val user : User?,
    val isUserRegistred : Boolean
)
