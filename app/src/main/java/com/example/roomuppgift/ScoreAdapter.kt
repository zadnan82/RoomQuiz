package com.example.roomuppgift

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ScoreAdapter(val context: Context, val scoreList: List<Score> ):
    RecyclerView.Adapter<ScoreAdapter.ViewHolder>(){

    val layoutInflater = LayoutInflater.from(context)

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        val nameTV = itemView.findViewById<TextView>(R.id.nameTV)
        val scoreTV = itemView.findViewById<TextView>(R.id.scoreTV)
        var scorePosition = 0

    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): ScoreAdapter.ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_score,parent,false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ScoreAdapter.ViewHolder, position: Int) {
        val score = scoreList[position]

        holder.nameTV.text = score.namn
        holder.scoreTV.text = (score.points.toString())
        holder.scorePosition= position
    }
    override fun getItemCount(): Int {
        return scoreList.size
    }
}


