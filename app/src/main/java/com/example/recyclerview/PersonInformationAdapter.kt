package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ListItemRecylerViewBinding

class PersonInformationAdapter (
     private val personInformation : ArrayList<Pair<String, String>>
        ) : RecyclerView.Adapter<PersonInformationAdapter.PersonInformationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonInformationViewHolder {
        return PersonInformationViewHolder(
            ListItemRecylerViewBinding.inflate(
                LayoutInflater.from(parent.context),parent,false

            )
        )
    }
    override fun getItemCount(): Int {
        return personInformation.size
    }
    override fun onBindViewHolder(holder: PersonInformationViewHolder, position: Int) {
        holder.setData(personInformation[position])
    }
    inner class PersonInformationViewHolder( private val binding: ListItemRecylerViewBinding) :
        RecyclerView.ViewHolder(binding.root){


        internal fun setData(personInformation: Pair<String, String>) {

            binding.textViewName.text = personInformation.first
            binding.textViewAddress.text = personInformation.second

        }
    }
}