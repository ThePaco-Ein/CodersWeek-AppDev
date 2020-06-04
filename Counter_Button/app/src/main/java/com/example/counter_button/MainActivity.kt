package com.example.counter_button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    //CONTADOR
    var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Contador(view: View){

        count++
        val textview = findViewById(R.id.textView) as TextView
        textview.text= "Usted ha hecho $count clicks"

    }
}