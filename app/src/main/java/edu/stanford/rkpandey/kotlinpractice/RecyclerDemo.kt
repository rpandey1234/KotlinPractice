package edu.stanford.rkpandey.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_demo.*

class RecyclerDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_demo)
        
        // To build a recycler view:
        // 0. Add the library for recycler view -- DONE
        // 1. Create the data source -- DONE
        // 2. Setup the adapter -- DONE
        // 3. Bind the adapter to the RecyclerView
        // 4. Bind a layout manager to the RecyclerView -- DONE
        
        val contacts = createContacts()
        // contacts: ["Person 0", "Person 1", "Person 2", ...]
        val myAdpater = ContactsAdapter(applicationContext, contacts)
        rvContacts.adapter = myAdpater
        rvContacts.layoutManager = LinearLayoutManager(this)
    }

    private fun createContacts(): List<String> {
        val contactList = mutableListOf<String>()
        for (i in 0 until 10000) {
            contactList.add("Person $i")
        }
        return contactList
    }
}