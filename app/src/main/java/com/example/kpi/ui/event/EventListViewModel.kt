package com.example.kpi.ui.event

import androidx.lifecycle.ViewModel
import com.example.kpi.core.EventRepository

class EventListViewModel(private val repository: EventRepository) : ViewModel() {

    val eventsLiveData = repository.getAllEvents()

}