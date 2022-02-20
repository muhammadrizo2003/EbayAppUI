package com.example.ebayui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ebayui.adapters.FavoriteAdapter
import com.example.ebayui.models.Favorite

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        context = this
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        refreshAdapter(prepareFavorites())

    }

    private fun refreshAdapter(items: ArrayList<Favorite>) {
        val adapter = FavoriteAdapter(context, items)
        recyclerView.adapter = adapter
    }

    private fun prepareFavorites(): ArrayList<Favorite> {
        val list = ArrayList<Favorite>()

        for (i in 1..10) {
            list.add(Favorite("Apple", R.drawable.im_item_feed))
            list.add(Favorite("Apple", R.drawable.im_item_feed))
            list.add(Favorite("Apple", R.drawable.im_item_feed))
            list.add(Favorite("Apple", R.drawable.im_item_feed))
            list.add(Favorite("Apple", R.drawable.im_item_feed))
            list.add(Favorite("Apple", R.drawable.im_item_feed))
        }
        return list
    }
}

