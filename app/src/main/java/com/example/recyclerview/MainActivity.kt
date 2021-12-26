package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
     private var mImages = ArrayList<String>()
     private var mNames = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initiliasing the arraylists
        initArrayLists()

        //getting the recyclerview
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val recyclerViewAdapter = ItemAdapter(this,mImages, mNames)
        recyclerView.adapter = recyclerViewAdapter
        //setting the layout manager
        recyclerView.layoutManager = LinearLayoutManager(this)


    }
    private fun initArrayLists(){
        mImages.add("https://i.redd.it/ev2my9mxi7i71.png")
        mNames.add("Havasu Falls")

        mImages.add("https://i.redd.it/tpsnoz5bzo501.jpg")
        mNames.add("Trondheim")

        mImages.add("https://i.redd.it/qn7f9oqu7o501.jpg")
        mNames.add("Portugal")

        mImages.add("https://i.redd.it/j6myfqglup501.jpg")
        mNames.add("Rocky Mountain National Park")


        mImages.add("https://i.redd.it/0h2gm1ix6p501.jpg")
        mNames.add("Mahahual")

        mImages.add("https://i.redd.it/k98uzl68eh501.jpg")
        mNames.add("Frozen Lake")


        mImages.add("https://i.redd.it/glin0nwndo501.jpg")
        mNames.add("White Sands Desert")

        mImages.add("https://i.redd.it/obx4zydshg601.jpg")
        mNames.add("Austrailia")

        mImages.add("https://i.imgur.com/ZcLLrkY.jpg")
        mNames.add("Washington")
    }
}