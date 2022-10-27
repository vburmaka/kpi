package com.example.kpi.core

import com.example.kpi.models.EventModel
import java.util.UUID

interface EventRepository {
    fun getAllEvents(): List<EventModel>
    fun getEventById(id: UUID): EventModel
    fun upDateEventById(id: UUID)
}