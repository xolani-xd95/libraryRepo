package com.example.chatlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity(), ChatInterface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun connectToSignalR() {
        Toast.makeText(this, "Testing this lib", Toast.LENGTH_LONG).show()
    }
}
