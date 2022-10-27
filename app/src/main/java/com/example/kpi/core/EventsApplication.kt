package com.example.kpi.core

import android.app.Application
import com.example.kpi.EventRepository
import com.example.kpi.EventRepositoryImpl

class EventsApplication : Application() {

    lateinit var repository: EventRepository

    override fun onCreate() {
        super.onCreate()
        repository = EventRepositoryImpl.getInstance(this)
    }
}