package com.example.fragmentocolores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(), Comunicador {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClickButtonSumar() {
        var awa = this.findViewById<TextView>(R.id.tvResultado)
        var suma = Integer.parseInt(awa.text.toString())+1
        awa.setText(suma.toString())

    }


    override fun onClickButtonRestar() {
        var awa = this.findViewById<TextView>(R.id.tvResultado)
        var resta = Integer.parseInt(awa.text.toString())-1
        awa.setText(resta.toString())
    }
}