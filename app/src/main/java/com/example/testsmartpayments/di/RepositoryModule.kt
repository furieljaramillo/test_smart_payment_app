package com.example.testsmartpayments.di

import com.example.testsmartpayments.data.repository.UserRepositoryImpl
import com.example.testsmartpayments.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Singleton
    @Binds
    fun bindsUserRepository(impl: UserRepositoryImpl ): UserRepository

}