package com.example.dodoapp

import android.widget.ImageView

class Item(val id: Int, val image: String, val name: String, val desc: String, val price: Int) {
}

class SearchItem(val image: ImageView, val name: String, val desc: String, val price: Int) {
}