package com.example.piedrapapeltijeras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity(), Comunicador {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun pulsarPapel() {

        volverInvisible()
        val papel = this.findViewById<ImageView>(R.id.imgPapel2)
        papel.visibility = View.VISIBLE
    }

    override fun pulsarPiedra() {

        volverInvisible()
        val piedra = this.findViewById<ImageView>(R.id.imgPiedra2)
        piedra.visibility = View.VISIBLE
    }

    override fun pulsarTijeras() {

        volverInvisible()
        val tijeras = this.findViewById<ImageView>(R.id.imgTijeras2)
        tijeras.visibility = View.VISIBLE
    }

    private fun volverInvisible(){
        val papel = this.findViewById<ImageView>(R.id.imgPapel2)
        val piedra = this.findViewById<ImageView>(R.id.imgPiedra2)
        val tijeras = this.findViewById<ImageView>(R.id.imgTijeras2)

        papel.visibility = View.INVISIBLE
        piedra.visibility = View.INVISIBLE
        tijeras.visibility = View.INVISIBLE
    }

}