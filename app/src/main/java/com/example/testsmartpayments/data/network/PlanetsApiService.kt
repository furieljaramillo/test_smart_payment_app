package com.example.testsmartpayments.data.network

import com.example.testsmartpayments.data.network.response.PlanetsResponse
import retrofit2.http.GET


interface PlanetsApiService {

    @GET("/planets")
    suspend fun getAllPlanets() : PlanetsResponse
}