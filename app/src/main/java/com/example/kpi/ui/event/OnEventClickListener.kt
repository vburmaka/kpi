package com.example.kpi.ui.event

import java.util.UUID

interface OnEventClickListener {
    fun onEventClicked(id: UUID, title: String)
}