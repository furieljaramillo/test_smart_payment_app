package com.example.testsmartpayments.di

import android.content.Context
import androidx.room.Room
import com.example.testsmartpayments.data.db.AppDataBase
import com.example.testsmartpayments.data.db.dao.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Provides
    fun provideUserDao(appDataBase: AppDataBase) : UserDao{
        return appDataBase.userDao()
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext : Context) : AppDataBase{
        return Room.databaseBuilder(
            appContext,
            AppDataBase::class.java,
            "UserDatabase"
        ).build()
    }
}