package com.example.testsmartpayments.data.network.response

import com.google.gson.annotations.SerializedName

data class PlanetsResponse(
    @SerializedName("results")
    val planets : List<PlanetResponse>
)

data class PlanetResponse (
    @SerializedName("name")
    val name : String = "",
    @SerializedName("url")
    val url : String = ""
)
