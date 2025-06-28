package com.example.financetracker



import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class categorypage : AppCompatActivity() {

    private lateinit var mySpinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorypage)

        mySpinner = findViewById(R.id.mySpinner)

        // Dropdown list items
        val items = arrayOf("Month", "January", "February", "March", "April" , "May" , "June" , "July" ,"August" , "September" , "October" , "November" , "December")
        val adapter = ArrayAdapter(this, R.layout.spinner_item, items)
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item)
        mySpinner.adapter = adapter

        mySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                val selected = parent.getItemAtPosition(position).toString()
                if (position != 0) { // skip "Select Item"
                    Toast.makeText(this@categorypage, "Selected: $selected", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Do nothing
            }
        }
    }
}
