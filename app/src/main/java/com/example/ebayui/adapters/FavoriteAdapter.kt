package com.example.ebayui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ebayui.R
import com.example.ebayui.models.Favorite

class FavoriteAdapter(private val context: Context, private val list: ArrayList<Favorite>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater =
            LayoutInflater.from(context).inflate(R.layout.item_feed_favorite, parent, false)
        return StoryViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val favorite = list[position]

        if (holder is StoryViewHolder) {
            (holder as StoryViewHolder).textViewTitle.text = favorite.title
            (holder as StoryViewHolder).imageView.setImageResource(favorite.image)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    private class StoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewTitle: TextView = itemView.findViewById(R.id.tv_title)
        val imageView: ImageView = itemView.findViewById(R.id.iv_profile)
    }
}

