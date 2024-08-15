package com.example.testsmartpayments.di

import com.example.testsmartpayments.data.network.PlanetsApiService
import com.example.testsmartpayments.data.repository.PlanetsRepositoryImpl
import com.example.testsmartpayments.domain.repository.PlanetsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://swapi.dev/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun providesPlanetsApiService(retrofit: Retrofit) : PlanetsApiService{
        return retrofit.create(PlanetsApiService::class.java)
    }

    @Provides
    fun providesPlanetsRepository(apiService: PlanetsApiService ) : PlanetsRepository{
        return PlanetsRepositoryImpl(apiService)
    }


}