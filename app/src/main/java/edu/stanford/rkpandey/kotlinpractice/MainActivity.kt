package edu.stanford.rkpandey.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvHelloWorld.text = "Shelter in place"

        btnClickMe.setOnClickListener { 
            Log.i("magic", "click me!!")
            Glide.with(applicationContext)
                .load("https://1rtof2h4via3gt3wm3qd6x51-wpengine.netdna-ssl.com/wp-content/uploads/2020/03/cvshelter.jpg")
                .into(ivShelterInPlace)
            ivShelterInPlace.visibility = View.VISIBLE
            
        }
    }
}