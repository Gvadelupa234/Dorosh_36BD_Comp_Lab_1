package com.example.veterinaryclinic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veterinaryclinic.databinding.ActivityDetailsAnimalBinding

class DetailsAnimal : AppCompatActivity() {

    lateinit var binding: ActivityDetailsAnimalBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsAnimalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nameAnimal = intent.getStringExtra("nameAnimal1")
        val ownerName = intent.getStringExtra("ownerName")
        val phoneNumber = intent.getStringExtra("phoneNumber")
        val animalType = intent.getStringExtra("animalType")
        val animalBreed = intent.getStringExtra("animalBreed")
        val animalAge = intent.getStringExtra("animalAge")
        val animalWeight = intent.getStringExtra("animalWeight")
        val imageAnimal = intent.getIntExtra("imageAnimal",0)

        binding.nameAnimalDetails.text = nameAnimal
        binding.nameOwner.text = ownerName
        binding.phoneNumber.text = phoneNumber
        binding.animalType.text = animalType
        binding.animalBreed.text = animalBreed
        binding.animalAge.text = animalAge
        binding.animalWeight.text = animalWeight
        binding.animalImage.setImageResource(imageAnimal)
    }
}