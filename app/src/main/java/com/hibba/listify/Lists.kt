package com.hibba.listify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Lists.newInstance] factory method to
 * create an instance of this fragment.
 */
class Lists : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(
            R.layout.fragment_lists,
            container,
            false
        )

        val recyclerView = view.findViewById<RecyclerView>(
            R.id.listrecyclerview
        )

        val items = listOf(
            list1kt("Study", "8 items"),
            list1kt("Buy", "5 items"),
            list1kt("Read", "12 items"),
            list1kt("Watch", "7 items"),
            list1kt("Movies", "15 items"),
            list1kt("Books", "10 items"),
            list1kt("Assignments", "6 items"),
            list1kt("Projects", "9 items"),
            list1kt("Android", "14 items"),
            list1kt("Kotlin", "11 items"),
            list1kt("University", "18 items"),
            list1kt("Exams", "13 items"),
            list1kt("TOA", "7 items"),
            list1kt("Operating System", "16 items"),
            list1kt("Computer Architecture", "10 items"),
            list1kt("HCI", "8 items"),
            list1kt("Shopping", "20 items"),
            list1kt("Grocery", "12 items"),
            list1kt("Recipes", "9 items"),
            list1kt("Fitness", "6 items"),
            list1kt("Travel", "11 items"),
            list1kt("Ideas", "17 items"),
            list1kt("Goals", "8 items"),
            list1kt("Favorites", "14 items"),
            list1kt("Important", "5 items")
        )

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = listrecyclerview(items)

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Lists.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Lists().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}