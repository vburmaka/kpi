package com.example.kpi.core

import androidx.lifecycle.LiveData
import com.example.kpi.models.EventModel
import java.util.UUID

interface EventRepository {
    fun getAllEvents(): LiveData<List<EventModel>>
    fun getEventById(id: UUID): LiveData<EventModel?>
    suspend fun updateEvent(event: EventModel)
}