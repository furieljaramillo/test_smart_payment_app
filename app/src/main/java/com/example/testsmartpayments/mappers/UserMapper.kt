package com.example.testsmartpayments.mappers

import com.example.testsmartpayments.data.model.UserModel
import com.example.testsmartpayments.domain.model.User

fun UserModel.toUserDomain() = User(
    name = this.name,
    paternalSurname = this.paternalSurname,
    maternalSurname = this.maternalSurname,
    dateBirth = this.dateOfBirth,
    country = this.country
)


fun User.toUserData() = UserModel(
    paternalSurname = this.paternalSurname,
    maternalSurname = this.maternalSurname,
    dateOfBirth = this.dateBirth,
    name = this.name,
    country = this.country
)