package com.example.randomizerandreina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class MainActivityRoll : AppCompatActivity() {

    lateinit var imageViewDice:ImageView;
    lateinit var rgn:Random;
    lateinit var ButtonRoll:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_roll)

        imageViewDice = findViewById(R.id.ImageViewDice);
        ButtonRoll = findViewById(R.id.Button_RollDice);

        ButtonRoll.setOnClickListener(){
            val ramdomInt = Random().nextInt(6)+1
            when (ramdomInt) {
                1 -> imageViewDice.setImageResource(R.drawable.uno)
                2 -> imageViewDice.setImageResource(R.drawable.dos)
                3 -> imageViewDice.setImageResource(R.drawable.tres)
                4 -> imageViewDice.setImageResource(R.drawable.cuatro)
                5 -> imageViewDice.setImageResource(R.drawable.cinco)
                6 -> imageViewDice.setImageResource(R.drawable.seis)
            }
        }

    }

}