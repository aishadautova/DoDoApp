package com.example.dodoapp

import android.graphics.Path.Op
import android.os.Bundle
import android.widget.ArrayAdapter
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.SearchView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val searchView : SearchView = findViewById(R.id.searchView)
        val listView : ListView = findViewById(R.id.listView)

        val names = arrayOf("Песто", "Мясная", "Четыре сыра", "Пепперони", "Маргарита", "Ветчина и грибы", "Гавайская с альфредо", "Сырная")

        val adapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)

        listView.adapter = adapter

        searchView.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchView.clearFocus()
                if (names.contains(query)){
                    adapter.filter.filter(query)
                }else{
                    Toast.makeText(
                        applicationContext, "Не найдено", Toast.LENGTH_LONG
                    ).show()
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return false
            }

        })
    }
}