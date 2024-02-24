package com.example.dodoapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class itemActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item1)

        val title: TextView = findViewById(R.id.item_name_one)
        val desc: TextView = findViewById(R.id.item_desc_one)
        val img: ImageView = findViewById(R.id.item_image_one)
        val imgid: Int = intent.getIntExtra("itemImg", 0)

        title.text = intent.getStringExtra("itemTitle")
        desc.text = intent.getStringExtra("itemDesc")
        img.setImageResource(imgid)
    }


}