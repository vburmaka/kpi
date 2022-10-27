package com.example.kpi

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.example.kpi.core.EventRepositoryViewModelFactory
import com.example.kpi.core.EventsApplication

/**
 * A fragment representing a list of Items.
 */
class EventListFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView

    private val eventListViewModel: EventListViewModel by viewModels {
        EventRepositoryViewModelFactory((requireActivity().application as EventsApplication).repository)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item_list, container, false)
        recyclerView = view.findViewById(R.id.list)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.addItemDecoration(DividerItemDecoration(context,VERTICAL))
        updateUI()
        return view
    }

    private fun updateUI(){
        recyclerView.adapter = EventItemRecyclerViewAdapter(eventListViewModel.events)
    }

    companion object {

        @JvmStatic
        fun newInstance() = EventListFragment()
    }
}