package com.example.kpi.core

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kpi.ui.EventListFragment
import com.example.kpi.R
import com.example.kpi.ui.EventFragment
import com.example.kpi.ui.OnEvenSelectedListener

class MainActivity : AppCompatActivity(), OnEvenSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

        if (currentFragment == null){
            val fragment = EventListFragment.newInstance()
            supportFragmentManager.beginTransaction().add(R.id.fragment_container, fragment).commit()
        }
    }

    override fun onEventSelected(eventId: String, title: String) {
        val fragment = EventFragment.newInstance(eventId, title)
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(null).commit()
    }
}