package com.example.testsmartpayments.data.repository

import com.example.testsmartpayments.data.network.PlanetsApiService
import com.example.testsmartpayments.domain.repository.PlanetsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class PlanetsRepositoryImpl @Inject constructor(private val planetsApiService : PlanetsApiService) : PlanetsRepository {

    override suspend fun getAllPlanets() {
        withContext(Dispatchers.IO){
            planetsApiService.getAllPlanets()
        }
    }

    override suspend fun getPlanetById() {
        withContext(Dispatchers.IO){
            planetsApiService.getAllPlanets()
        }
    }


}