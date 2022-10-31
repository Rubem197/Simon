package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
        supportActionBar?.hide()


        val buttonClick = findViewById<Button>(R.id.btnSalir)
        buttonClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

    }

    fun sumar(view: View){

        val n1 = findViewById<EditText>(R.id.tbN1)
        val n2 = findViewById<EditText>(R.id.tbN2)
        val suma = Integer.parseInt(n1.text.toString())+Integer.parseInt(n2.text.toString())
        val resultado =  findViewById<TextView>(R.id.tResultado)

        resultado.text = suma.toString()

    }
}