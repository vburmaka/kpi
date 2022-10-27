package com.example.kpi.ui

import java.util.UUID

interface OnEventClickListener {
    fun onEventClicked(id: UUID, title: String)
}