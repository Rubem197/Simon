package com.example.primeraaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.EditText
import android.widget.TextView

class AlinearTexto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alinear_texto)
    }


    fun alinearIzquierda(view: View){

        val izquieda = findViewById<TextView>(R.id.tvAlinear)

        izquieda.gravity = Gravity.LEFT
    }
    fun alinearDerecha(view: View){

        val izquieda = findViewById<TextView>(R.id.tvAlinear)

        izquieda.gravity = Gravity.RIGHT
    }
}