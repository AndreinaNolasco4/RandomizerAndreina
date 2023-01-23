package com.example.randomizerandreina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class Coin_flipping : AppCompatActivity() {

    lateinit var imageViewCoin: ImageView;
    lateinit var rgn: Random;
    lateinit var ButtonCoin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_flipping)

        imageViewCoin = findViewById(R.id.imageViewCoin);
        ButtonCoin = findViewById(R.id.button_Coin);

        ButtonCoin.setOnClickListener(){
            val ramdomInt = Random().nextInt(2) + 1;
            when (ramdomInt) {
                1 -> imageViewCoin.setImageResource(R.drawable.face)
                2 -> imageViewCoin.setImageResource(R.drawable.cross)
            }
        }

    }
}