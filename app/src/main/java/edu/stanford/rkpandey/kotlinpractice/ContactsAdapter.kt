package edu.stanford.rkpandey.kotlinpractice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(val applicationContext: Context, val contacts: List<String>) : 
    RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(applicationContext)
            .inflate(android.R.layout.simple_list_item_1, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contactName = contacts[position]
        val textView = holder.itemView.findViewById<TextView>(android.R.id.text1)
        textView.text = contactName
    }
    
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) 

}
