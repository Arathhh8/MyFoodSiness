package com.example.MyFoodSiness

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.Int as Int1

class NewsAdapter(val newsList: ArrayList<News>):RecyclerView.Adapter<NewsAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int1): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.news_item,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int1) {
        holder.bindItems(newsList[position])
    }

    override fun getItemCount(): Int1 {
        return newsList.size
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        fun bindItems(news:News){
            var image = itemView.findViewById<ImageView>(R.id.newImage)
            val id = itemView.findViewById<TextView>(R.id.new_id)
            val title = itemView.findViewById<TextView>(R.id.news_title)
            val resume = itemView.findViewById<TextView>(R.id.news_resume)
            val price = itemView.findViewById<TextView>(R.id.news_date)
            val btn_add_to_cart = itemView.findViewById<Button>(R.id.btn_add_to_cart)

            image.setImageResource(news.image.toString().toInt())
            title.text = news.title.toString()
            resume.text = news.resume.toString()
            price.text = news.price.toString()

            btn_add_to_cart.setOnClickListener{
                btn_add_to_cart.text = "Añadido con éxito"
                price.text = "ver en carrito"
            }
        }
    }
}