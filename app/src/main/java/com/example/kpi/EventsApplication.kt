package com.example.kpi

import android.app.Application

class EventsApplication : Application() {

    lateinit var repository: EventRepository

    override fun onCreate() {
        super.onCreate()
        repository = EventRepositoryImpl.getInstance(this)
    }
}