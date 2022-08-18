package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.helloworld.ui.main.MainFragment
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
       val button =  findViewById<Button>(R.id.helloButton)
        button.setOnClickListener{
             Log.v( "hello world", "button clicked!")
             Toast.makeText(this,"Hello to you  too!", Toast.LENGTH_SHORT).show()

        }



    }
}
