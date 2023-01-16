package com.seliimyilmaaz.landmarkkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView
import com.seliimyilmaaz.landmarkkotlin.databinding.ActivityListOfElementBinding

class LandMarkAdepter(var landMarkList : ArrayList<Landmark>) :
    RecyclerView.Adapter<LandMarkAdepter.LandMarkHolder>() {

    class LandMarkHolder(var binding: ActivityListOfElementBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandMarkHolder {
        var binding = ActivityListOfElementBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return LandMarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandMarkHolder, position: Int) {
        holder.binding.textView.text = landMarkList.get(position).name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            Singelton.chosenLandMark = landMarkList.get(position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return landMarkList.size
    }

}