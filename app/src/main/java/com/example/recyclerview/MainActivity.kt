package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private  var anInt: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyckerView()
    }

    private fun initRecyckerView(){

        val personInformationList = ArrayList<Pair<String, String>>()

        personInformationList.add(Pair(first = "Arefin" , second = "From :Dhaka"))
        personInformationList.add(Pair(first = "Jamil" , second = "From :Lokkhipur"))
        personInformationList.add(Pair(first = "Fahim" , second = "From :Gazipur"))
        personInformationList.add(Pair(first = "Sajjat" , second = "From :Comilla"))
        personInformationList.add(Pair(first = "Shopno" , second = "From :Natore"))
        personInformationList.add(Pair(first = "Rashadul" , second = "From :Dhaka"))
        personInformationList.add(Pair(first = "Sakib" , second = "From :Tangail"))
        personInformationList.add(Pair(first = "Nayeem" , second = "From :Dhaka"))
        personInformationList.add(Pair(first = "Hasan" , second = "From :Dhaka"))
        personInformationList.add(Pair(first = "Jamil" , second = "From :Chittagong"))
        personInformationList.add(Pair(first = "Nazmul" , second = "From :Comilla"))
        personInformationList.add(Pair(first = "Himu" , second = "From :Sylhet"))
        personInformationList.add(Pair(first = "Nabil" , second = "From :Rangamati"))
        personInformationList.add(Pair(first = "Fatema" , second = "From :Naraynganj"))
        personInformationList.add(Pair(first = "Imam" , second = "From :Dhaka"))
        personInformationList.add(Pair(first = "Ifam" , second = "From :Dhaka"))
        personInformationList.add(Pair(first = "Kamruz" , second = "From :Dhaka"))
        personInformationList.add(Pair(first = "Ifty" , second = "From :Dhaka"))

        val personInformationAdapter = PersonInformationAdapter(
            personInformation = personInformationList

        )
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
            adapter = personInformationAdapter
            setHasFixedSize(true)
        }
    }
}