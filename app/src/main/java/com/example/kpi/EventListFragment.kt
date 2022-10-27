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
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*

/**
 * A fragment representing a list of Items.
 */
class EventListFragment : Fragment(), OnEventClickListener {
    private lateinit var recyclerView: RecyclerView

    private val eventListViewModel: EventListViewModel by viewModels {
        EventRepositoryViewModelFactory((requireActivity().application as EventsApplication).repository)
    }

    private var addEventFAB: FloatingActionButton? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        recyclerView = view.findViewById(R.id.newList)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.addItemDecoration(DividerItemDecoration(context,VERTICAL))
        addEventFAB = view.findViewById(R.id.addEventFAB)

        addEventFAB?.setOnClickListener {
            onEventClicked(UUID.randomUUID(),"")
        }

        updateUI()
        return view
    }

    private fun updateUI(){
        recyclerView.adapter = EventItemRecyclerViewAdapter(eventListViewModel.events, this)
    }

    companion object {

        @JvmStatic
        fun newInstance() = EventListFragment()
    }

    override fun onEventClicked(id: UUID, title: String) {
        val fragment = EventFragment.newInstance(id.toString(), title)
        activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.fragment_container, fragment)?.commit()
    }
}