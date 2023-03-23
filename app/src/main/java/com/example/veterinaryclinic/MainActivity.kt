package com.example.veterinaryclinic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.veterinaryclinic.databinding.ActivityMainBinding
import android.content.Intent

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val patient1 = PatientInformation(
            "Тарас",
            "Коваль",
            "+380971234567",
            "Felis catus",
            "Maine-Coon",
            "Чол.",
            "Барон",
            3,
            6.5
        )

        val patient2 = PatientInformation(
            "Василина",
            "Кармазіна",
            "+380677894474",
            "Felis catus",
            "Sphynx",
            "Чол.",
            "Лисик",
            2,
            3.0
        )

        val patient3 = PatientInformation(
            "Марія",
            "Сидоренко",
            "+380671234456",
            "Felis catus",
            "British Shorthair",
            "Жін.",
            "Еммелін",
            5,
            4.0
        )

        patient1?.let {
            val patientName = "${it.animalName}"
            binding.animalName1.text = patientName
            val descriptionAnimal = "Стать: ${it.sex}, Вік: ${it.age}, Вага: ${it.weight}"
            binding.descriptionAnimalText1.text = descriptionAnimal
        }

        patient2?.let {
            val patientName = "${it.animalName}"
            binding.animalName2.text = patientName
            val descriptionAnimal = "Стать: ${it.sex}, Вік: ${it.age}, Вага: ${it.weight}"
            binding.descriptionAnimalText2.text = descriptionAnimal
        }

        patient3?.let {
            val patientName = "${it.animalName}"
            binding.animalName3.text = patientName
            val descriptionAnimal = "Стать: ${it.sex}, Вік: ${it.age}, Вага: ${it.weight}"
            binding.descriptionAnimalText3.text = descriptionAnimal
        }

        binding.buttonPatient1.setOnClickListener {
            val intent = Intent(this, DetailsAnimal::class.java)
            intent.putExtra("nameAnimal1", "${patient1.animalName}" )
            intent.putExtra("ownerName", "Ім'я та прізвище власника: ${patient1.ownerLastName} ${patient1.ownerFirstName}")
            intent.putExtra("phoneNumber", "Номер телефону: ${patient1.phoneNumber}")
            intent.putExtra("animalType", "Вид: ${patient1.animalType}")
            intent.putExtra("animalBreed", "Порода: ${patient1.breed}")
            intent.putExtra("animalAge", "Вік: ${patient1.age}")
            intent.putExtra("animalWeight", "Вага: ${patient1.weight}")
            intent.putExtra("imageAnimal", R.drawable.cat_1)

            startActivity(intent)
        }

        binding.buttonPatient2.setOnClickListener {
            val intent = Intent(this, DetailsAnimal::class.java)
            intent.putExtra("nameAnimal1", "${patient2.animalName}" )
            intent.putExtra("ownerName", "Ім'я та прізвище власника: ${patient2.ownerLastName} ${patient2.ownerFirstName}")
            intent.putExtra("phoneNumber", "Номер телефону: ${patient2.phoneNumber}")
            intent.putExtra("animalType", "Вид: ${patient2.animalType}")
            intent.putExtra("animalBreed", "Порода: ${patient2.breed}")
            intent.putExtra("animalAge", "Вік: ${patient2.age}")
            intent.putExtra("animalWeight", "Вага: ${patient2.weight}")
            intent.putExtra("imageAnimal", R.drawable.cat_2)

            startActivity(intent)
        }

        binding.buttonPatient3.setOnClickListener {
            val intent = Intent(this, DetailsAnimal::class.java)
            intent.putExtra("nameAnimal1", "${patient3.animalName}" )
            intent.putExtra("ownerName", "Ім'я та прізвище власника: ${patient3.ownerLastName} ${patient3.ownerFirstName}")
            intent.putExtra("phoneNumber", "Номер телефону: ${patient3.phoneNumber}")
            intent.putExtra("animalType", "Вид: ${patient3.animalType}")
            intent.putExtra("animalBreed", "Порода: ${patient3.breed}")
            intent.putExtra("animalAge", "Вік: ${patient3.age}")
            intent.putExtra("animalWeight", "Вага: ${patient3.weight}")
            intent.putExtra("imageAnimal", R.drawable.cat_3)

            startActivity(intent)
        }
    }
}
