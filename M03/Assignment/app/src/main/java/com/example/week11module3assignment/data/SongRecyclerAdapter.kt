package com.example.week11module3assignment.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.week11module3assignment.R
import com.example.week11module3assignment.data.model.Song


class SongRecyclerAdapter(songs: ArrayList<Song>, context: Context) : RecyclerView.Adapter<SongRecyclerAdapter.SongHolder>() {

   inner class SongHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       var albumImageView = R.id.song_artwork_iv as ImageView
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SongRecyclerAdapter.SongHolder {
        TODO()
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: SongRecyclerAdapter.SongHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}