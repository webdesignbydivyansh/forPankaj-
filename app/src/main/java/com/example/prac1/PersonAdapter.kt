package com.example.prac1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.Person
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_person.view.*

class PersonAdapter(val person: ArrayList<com.example.prac1.Person>): RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    class PersonViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val itemview=LayoutInflater.from(parent.context).inflate(
            R.layout.item_person,
                parent,
                false
        )
        return PersonViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.itemView.tvname.text=person[position].name
        holder.itemView.tvsurname.text=person[position].surname
        holder.itemView.tvcomp.text=person[position].comp
    }

    override fun getItemCount(): Int {
        return person.size
    }
}