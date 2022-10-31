package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId){
            R.id.opcCalculadora -> {
                Calculadoras(null)
                true
            }
            R.id.opcColores -> {
                Colore(null)
                true
            }
            R.id.opcAlinearTexto -> {
                AlinearTextos(null)
                true
            }
            R.id.opcGaleria -> {
                Galerias(null)
                true
            }
            R.id.opcTamanotexto -> {
                TamañoTextos(null)
                true
            }
            R.id.opcImagen -> {
                Imagens(null)
                true
            }
            R.id.opcCambiarTexto -> {
                CambiarTextos(null)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    fun Calculadoras(view: View?){

        val opcMenu = Intent(this, Calculadora:: class.java).apply {  }
        startActivity(opcMenu)
    }

    fun Colore(view: View?){

        val opcMenu = Intent(this, Colores:: class.java).apply {  }
        startActivity(opcMenu)
    }

    fun AlinearTextos(view: View?){

        val opcMenu = Intent(this, AlinearTexto:: class.java).apply {  }
        startActivity(opcMenu)
    }

    fun Galerias(view: View?){

        val opcMenu = Intent(this, Galeria:: class.java).apply {  }
        startActivity(opcMenu)
    }

    fun TamañoTextos(view: View?){

        val opcMenu = Intent(this, AumentarTexto:: class.java).apply {  }
        startActivity(opcMenu)
    }

    fun Imagens(view: View?){

        val opcMenu = Intent(this, PulsarImagen:: class.java).apply {  }
        startActivity(opcMenu)
    }

    fun CambiarTextos(view: View?){

        val opcMenu = Intent(this, CambiarTexto:: class.java).apply {  }
        startActivity(opcMenu)
    }
}