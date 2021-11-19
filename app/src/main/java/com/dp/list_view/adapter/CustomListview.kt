package com.dp.list_view.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.dp.list_view.R

class CustomListview(context: Context) : BaseAdapter(){

    private val context : Context = context

    private val listName = arrayListOf("John Brix", "Pompom", "John Akira","May","John")


    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItem(position: Int): Any {
        return "Hello"
    }

    @SuppressLint("ViewHolder", "SetTextI18n")
    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
        val layoutInflater = LayoutInflater.from(context)
        val rowMain = layoutInflater.inflate(R.layout.design_main, viewGroup, false)

        val nameTextView = rowMain.findViewById<TextView>(R.id.name)
        nameTextView.text = listName.get(position)

        val positionTextView = rowMain.findViewById<TextView>(R.id.description)
        positionTextView.text = "ITEM NUMBER: $position"

        return  rowMain
    }

    override fun getCount(): Int {
        return listName.size
        //return 5
    }
}