package com.example.kpi.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kpi.EventListViewModel
import com.example.kpi.EventRepository

class EventRepositoryViewModelFactory(private val repository: EventRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return EventListViewModel(repository) as T
    }
}