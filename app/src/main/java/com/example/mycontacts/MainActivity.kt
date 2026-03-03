package com.example.mycontacts

import android.os.Bundle
import android.util.Log
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
        Log.d(
            "Good evening",
            firstName + " " + lastName + ", from what I recall, you live in " + myAddress +
                    " and you were born on the " + dayOfBirth + " " + monthOfBirth + " " + yearOfBirth +
                    " and it was also mentioned that you are " + (if (isMale) "male" else "female")
        )
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}