package com.example.dodoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()

        items.add(Item(1, "pesto", "Песто", "Сочный цыпленок с пикантным соусом песто, кубики брынзы, томаты, моцарелла и соус альфредо",2700))
        items.add(Item(2, "myasnaya", "Мясная", "Сочный цыпленок, ветчина, пикантная пепперони, острые колбаски чоризо, моцарелла и томатный соус",2700))
        items.add(Item(3, "fourcheese", "Четыре сыра", "Увеличенная порция моцареллы, сыры чеддер и пармезан, сыр блю чиз, фирменный соус альфредо",2700))
        items.add(Item(4, "pepperoni", "Пепперони", "Пикантная пепперони, мно-о-ого моцареллы и томатный соус. Самая популярная пицца",2700))
        items.add(Item(5, "margarita", "Маргарита", "Много-много моцареллы, томаты, томатный соус и итальянские травы. Классика!",2100))
        items.add(Item(6, "vetengrib", "Ветчина и грибы", "Ветчина, много моцареллы, шампиньоны, томатный соус",2400))
        items.add(Item(7, "hawaii", "Гавайская с альфредо", "Двойная порция цыпленка, кусочки ананасов, моцарелла, соус альфредо",2400))
        items.add(Item(8, "cheese", "Сырная", "Моцарелла, сыры чеддер и пармезан, соус альфредо",1900))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)

        val btn : ImageButton = findViewById(R.id.button_search)

        btn.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

    }

//    val ButtonName = listOf<String>("Пиццы", "Комбо", "Закуски", "Коктейли", "Кофе", "Десерты", "Напитки", "Соусы")


}

