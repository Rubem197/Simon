package com.example.primeraaplicacion

import android.annotation.SuppressLint
import android.media.Image
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView

class Galeria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria)
        val imagen2 = findViewById<ImageView>(R.id.imagen2)
        imagen2.visibility = View.INVISIBLE
        supportActionBar?.hide()
    }


    fun anterior(view: View){

        val imagen1 = findViewById<ImageView>(R.id.imagen1)
        val imagen2 = findViewById<ImageView>(R.id.imagen2)

        imagen1.visibility = View.INVISIBLE
        imagen2.visibility = View.VISIBLE
    }
    fun siguiente(view: View){

        val imagen1 = findViewById<ImageView>(R.id.imagen1)
        val imagen2 = findViewById<ImageView>(R.id.imagen2)

        imagen1.visibility = View.VISIBLE
        imagen2.visibility = View.INVISIBLE
    }
}