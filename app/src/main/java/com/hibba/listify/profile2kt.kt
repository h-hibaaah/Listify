package com.hibba.listify

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class profileadapter (val items : List<Profileitem>):
    RecyclerView.Adapter<profileadapter.viewholder>()
{
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): viewholder {
val view = android.view.LayoutInflater.from(parent.context).inflate( R.layout.profileitem,parent,false )
        return viewholder(view)
    }

    override fun onBindViewHolder(
        holder: viewholder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class viewholder(itemview: View): RecyclerView.ViewHolder(itemview)
    {
        val item1 = itemview.findViewById<TextView>(R.id.textview)
    }
}