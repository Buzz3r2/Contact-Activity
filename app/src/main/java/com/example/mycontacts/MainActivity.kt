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
        val address = "39 Ranelagh Road"
        val isMale = true
        val dayOfBirth = "21"
        val monthOfBirth = "October"
        val yearOfBirth = "2006"
        println( "My name is Saadiq")
        println( "My last name is Steyn")
        println( "I live in my 39A Ranelagh Road")
        println( "I am Male")
        println( "My day of birth is on the 21rst")
        println( "My month of birth is October")
        println( "I was born in the year 2006")

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}