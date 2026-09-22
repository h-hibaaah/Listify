package com.hibba.listify

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class listrecyclerview(val items : List<list1kt>) : RecyclerView.Adapter<listrecyclerview.viewholderlist>()
{
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): listrecyclerview.viewholderlist {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: listrecyclerview.viewholderlist, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class viewholderlist (itemview1 : View): RecyclerView.ViewHolder(itemview1)
    {
        val text1 = itemview1.findViewById<TextView>(R.id.text1)
        val text2 = itemview1.findViewById<TextView>(R.id.text2)
    }
}