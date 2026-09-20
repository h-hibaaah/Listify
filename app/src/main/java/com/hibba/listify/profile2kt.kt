package com.hibba.listify

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class profileadapter (val items : List<Profileitem>): RecyclerView.Adapter<profileadapter.viewholder>
{
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): viewholder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(
        holder: viewholder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class viewholder(itemview: View): RecyclerView.ViewHolder(itemview)
    {
        val item1 = itemview.findViewById<>()
    }
}