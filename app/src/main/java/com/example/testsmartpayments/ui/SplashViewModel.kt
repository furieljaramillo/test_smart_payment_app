package com.example.testsmartpayments.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testsmartpayments.domain.model.User
import com.example.testsmartpayments.domain.usecase.GetAllUsersUseCase
import com.example.testsmartpayments.ui.model.SplashUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val usersUseCase: GetAllUsersUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(SplashUiState(user = User("","","","",""),false))
    val uiState: StateFlow<SplashUiState> = _uiState.asStateFlow()

    fun fetchUsers(){
        viewModelScope.launch {
            delay(5000)
            val users = usersUseCase()
            _uiState.update {
                it.copy(
                    user = users.firstOrNull(),
                    isUserRegistred = users.isEmpty()
                )
            }
        }
    }

}