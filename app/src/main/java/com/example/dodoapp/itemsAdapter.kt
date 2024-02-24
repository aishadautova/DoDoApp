package com.example.dodoapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemsAdapter (var items: List<Item>, var context: Context) :
    RecyclerView.Adapter<ItemsAdapter.MyViewHolder>() {

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val image: ImageView = view.findViewById(R.id.item_image)
        val title: TextView = view.findViewById(R.id.item_name)
        val desc: TextView = view.findViewById(R.id.item_desc)
        val price: TextView = view.findViewById(R.id.item_price)
        val btn: Button = view.findViewById(R.id.button2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = items[position].name
        holder.desc.text = items[position].desc
        holder.price.text = "от " + items[position].price.toString() + " KZT"

        val imageId = context.resources.getIdentifier(
            items[position].image,
            "drawable",
            context.packageName
        )

        holder.image.setImageResource(imageId)

        holder.btn.setOnClickListener(){
            val intent = Intent(context, itemActivity::class.java)

            intent.putExtra("itemTitle", items[position].name)
            intent.putExtra("itemDesc", items[position].desc)
            intent.putExtra("itemImg", imageId)

            context.startActivity(intent)
        }
    }
}