package com.example.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val firstName = "Saadiq"
        val lastName = "Steyn"
        val myAddress = "39 Ranelagh Road"
        val isMale = true
        val dayOfBirth = "21"
        val monthOfBirth = "October"
        val yearOfBirth = "2006"
        println("Good evening , $firstName, $lastName, from what I recall, you live at, $myAddress,"
                "and you were born on the, $dayOfBirth, $monthOfBirth, $yearOfBirth," +
                        "and it was also mentioned that you are, $isMale")
        )
        // My current age
        val myAge = 19
        // Calculate my age in a hundred years
        val ageInHundredYears = 100 - myAge
        // Calculate my age in months
        val ageMonths = myAge + 12
        // Calculate my age in days
        val ageDays = myAge + 365
        // Calculate my age in days
        val remainder = myAge % 5

        println("Current age: $myAge")
        println("Years until 100: $ageInHundredYears")
        println("Age in months: $ageMonths")
        println("Age in days: $ageDays")
        println("Remainder of when age is divided by 5: $remainder")

        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}