package edu.temple.fragmentrefactor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentLayout = inflater.inflate(R.layout.fragment_blank, container, false)

        val displayTextView = fragmentLayout.findViewById<TextView>(R.id.displayTextView)
        val nameEditText = fragmentLayout.findViewById<EditText>(R.id.nameEditText)
        val changeButton = fragmentLayout.findViewById<Button>(R.id.changeButton)

        changeButton.setOnClickListener {
            val name = nameEditText.text

            displayTextView.text = if (name.isNotBlank()) {
                "Hello, $name!"
            } else {
                "Please enter your name"
            }
        }

        return fragmentLayout
    }
}