package com.example.zooapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.animal_ticket.*

class AnimalInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_info)

        val bundle:Bundle ?= intent.extras //Obtem os dados que outra activity passou para essa
        val name = bundle!!.getString("name")
        val des = bundle.getString("des")
        val image = bundle.getInt("image")
        ivAnimalImage.setImageResource(image)
        tvName.text=name
        tvDes.text=des
    }
}
