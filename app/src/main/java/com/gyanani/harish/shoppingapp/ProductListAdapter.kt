package com.gyanani.harish.shoppingapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gyanani.harish.shoppingapp.models.Products

class ProductListAdapter(val context: Context, val products: List<Products>): RecyclerView.Adapter<ProductListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.text.text = product.name
        Glide.with(context)
            .load(product.image_url)
            .into(holder.image)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    class ViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView){
        val text = itemView.findViewById<TextView>(R.id.productName)
        val image = itemView.findViewById<ImageView>(R.id.productImage)
    }
}