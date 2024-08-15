package com.example.testsmartpayments.domain.repository

interface PlanetsRepository {

    suspend fun getAllPlanets()

    suspend fun getPlanetById()

}