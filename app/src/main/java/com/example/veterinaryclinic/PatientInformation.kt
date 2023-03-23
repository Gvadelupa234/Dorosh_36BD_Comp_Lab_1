package com.example.veterinaryclinic

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PatientInformation(
    val ownerFirstName: String,
    val ownerLastName: String,
    val phoneNumber: String,
    val animalType: String,
    val breed: String,
    val sex: String,
    val animalName: String,
    val age: Int,
    val weight: Double
) : Parcelable