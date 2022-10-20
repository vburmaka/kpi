package com.example.kpi

import androidx.lifecycle.ViewModel
import com.example.kpi.models.EventModel

class EventListViewModel(private val repository: EventRepository) : ViewModel() {

    val events = repository.getAllEvents()

}