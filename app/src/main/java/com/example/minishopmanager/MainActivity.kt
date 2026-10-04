package com.example.minishopmanager
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener {

            Toast.makeText(
                this,
                "Bonjour Maryam Khanfir !",
                Toast.LENGTH_SHORT
            ).show()

            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        Log.d("LIFECYCLE", "onCreate appelé")
    }
}