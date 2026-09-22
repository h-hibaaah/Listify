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
        val view = android.view.LayoutInflater.from(parent.context).inflate(R.layout.fragment_lists,parent,false)
        return viewholderlist(view)
    }

    override fun onBindViewHolder(holder: listrecyclerview.viewholderlist, position: Int) {
        holder.text1.text = items[position].text1
        holder.text2.text = items[position].text2    }

    override fun getItemCount(): Int {
        return items.size
    }

    class viewholderlist (itemview1 : View): RecyclerView.ViewHolder(itemview1)
    {
        val text1 = itemview1.findViewById<TextView>(R.id.text1)
        val text2 = itemview1.findViewById<TextView>(R.id.text2)
    }
}