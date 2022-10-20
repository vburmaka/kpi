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
import java.util.*

private const val ARG_PARAM_ID = "param1"
private const val ARG_PARAM_TITLE = "param2"

class EventFragment : Fragment() {

    private lateinit var titleEditText: EditText
    private lateinit var dateButton: Button

    private var id: String? = null
    private var title: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            id = it.getString(ARG_PARAM_ID)
            title = it.getString(ARG_PARAM_TITLE)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_event, container, false)

        titleEditText = view.findViewById(R.id.eventTitleEditText)
        dateButton = view.findViewById(R.id.eventDateButton)

        titleEditText.setText(title, TextView.BufferType.NORMAL)

        dateButton.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
                dateButton.text = "test"
            }
        })

        return view
    }

    companion object {
        @JvmStatic

        fun newInstance(id: String, title: String): EventFragment {
            return EventFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM_ID, id)
                    putString(ARG_PARAM_TITLE, title)
                }
            }
        }
    }
}