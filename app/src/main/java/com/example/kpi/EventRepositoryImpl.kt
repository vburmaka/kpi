package com.example.kpi

import android.content.Context
import com.example.kpi.models.EventModel
import java.util.*

class EventRepositoryImpl(private val context: Context) : EventRepository {

    companion object {
        fun getInstance(context: Context): EventRepository = EventRepositoryImpl(context)
    }

    override fun getAllEvents(): List<EventModel> {
        val events = mutableListOf<EventModel>()
        for (i in 0 until 100) {
            val event = EventModel()
            event.title = "Event #$i"
            events += event
        }
        return events
    }

    override fun getEventById(id: UUID): EventModel {
        TODO("Not yet implemented")
    }

    override fun upDateEventById(id: UUID) {
        TODO("Not yet implemented")
    }
}