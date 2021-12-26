package com.example.recyclerview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class ItemAdapter(private var context:Activity, private var images:ArrayList<String>, private var names:ArrayList<String>)
    : RecyclerView.Adapter<ItemAdapter.ItemHolder>(){

    //ViewHolder class holds each list item in memory
    class ItemHolder(view: View):RecyclerView.ViewHolder(view) {
            val image = view.findViewById<CircleImageView>(R.id.circle_image)
            val imageText = view.findViewById<TextView>(R.id.list_text)
            val parentLayout = view.findViewById<RelativeLayout>(R.id.parent_layout)

    }

    //onCreateViewHolder to inflate the item layout and create the holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val inflator = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)

        return ItemHolder(inflator)
    }

    //onBindViewHolder to set the view attributes based on the data
    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val image = holder.image
        //using glide to set the images
        Glide.with(context).  //specify context for Glide
            asBitmap()        //need to be in a bitmap so we can use it arraylist i guess
            .load(images[position]). //where to load the image from
            into(image)
        //setting the imageText
        holder.imageText.text = names[position]
        //setting the onClick listener on touching each list item
        holder.parentLayout.setOnClickListener{
            Toast.makeText(context, names[position], Toast.LENGTH_SHORT).show()
        }

    }

    //getItemCount to determine the number of items
    override fun getItemCount(): Int {
        return names.size
    }


}