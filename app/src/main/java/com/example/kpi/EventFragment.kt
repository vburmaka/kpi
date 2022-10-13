package com.example.kpi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class EventFragment : Fragment() {

    private lateinit var titleEditText: EditText
    private lateinit var dateButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_event, container, false)

        titleEditText = view.findViewById(R.id.eventTitleEditText)
        dateButton = view.findViewById(R.id.eventDateButton)

        dateButton.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
                dateButton.text = "test"
            }
        })

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = EventFragment()
    }
}