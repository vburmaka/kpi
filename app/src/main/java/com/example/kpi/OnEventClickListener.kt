package com.example.kpi

import java.util.UUID

interface OnEventClickListener {
    fun onEventClicked(id: UUID, title: String)
}