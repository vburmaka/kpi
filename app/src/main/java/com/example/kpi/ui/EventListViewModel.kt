package com.example.kpi.ui

import androidx.lifecycle.ViewModel
import com.example.kpi.core.EventRepository

class EventListViewModel(private val repository: EventRepository) : ViewModel() {

    val events = repository.getAllEvents()

}