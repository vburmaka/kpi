package com.example.kpi

import androidx.lifecycle.ViewModel
import com.example.kpi.models.EventModel

class EventListViewModel : ViewModel() {

    val events = mutableListOf<EventModel>()

    init {
        for (i in 0 until 100) {
            val event = EventModel()
            event.title = "Event #$i"
            events += event
        }
    }
}