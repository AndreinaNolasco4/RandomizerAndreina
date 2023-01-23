package com.example.randomizerandreina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Llama el boton de coin flipping y cuando le das click cambia de pantalla.
        findViewById<Button>(R.id.Button_Coin).setOnClickListener(){
            // abriendo la pantalla de coin flipping
            startActivity(Intent(this, Coin_flipping::class.java))
        }
        // LLama el boton de RollDice, cuando le das click cambia de pantalla
        findViewById<Button>(R.id.Button_Roll).setOnClickListener(){
            // Abriendo la pantalla de Roll d
            startActivity(Intent(this, MainActivityRoll::class.java))
        }

    }
}