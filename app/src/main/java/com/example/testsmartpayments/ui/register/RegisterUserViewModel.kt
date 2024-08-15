package com.example.testsmartpayments.ui.register

import androidx.lifecycle.ViewModel
import com.example.testsmartpayments.domain.usecase.InsertUserUseCase
import com.example.testsmartpayments.ui.model.RegisterUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class RegisterUserViewModel @Inject constructor(private val insertUserUseCase: InsertUserUseCase) : ViewModel() {

    private val _uiState = MutableStateFlow(RegisterUiState(false,false))
    val uiState: StateFlow<RegisterUiState> = _uiState.asStateFlow()

    fun insertUser(){

    }

}