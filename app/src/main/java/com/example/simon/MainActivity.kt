package com.example.simon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), Comunicador  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
     val listaSimon = ArrayList<Int>()

    override fun pulsarVerde() {
        val btnVerde = this.findViewById<Button>(R.id.btnVerde)
        val btnVerdeIluminado = this.findViewById<Button>(R.id.btnVerde2)

        cambiarVisivilidad(btnVerde, btnVerdeIluminado)

        Handler(Looper.getMainLooper()).postDelayed(
            {

                cambiarVisivilidad(btnVerdeIluminado, btnVerde)
            },
            2000 // value in milliseconds
        )

    empezarPartida()

    }

    override fun pulsarRojo() {
        val btnRojo = this.findViewById<Button>(R.id.btnRojo)
        val btnRojoIluminado = this.findViewById<Button>(R.id.btnRojo2)

        cambiarVisivilidad(btnRojo, btnRojoIluminado)

        Handler(Looper.getMainLooper()).postDelayed(
            {

                cambiarVisivilidad(btnRojoIluminado, btnRojo)
            },
            2000 // value in milliseconds
        )
    }

    override fun pulsarAmarillo() {
        val btnAmarillo = this.findViewById<Button>(R.id.btnAmarillo)
        val btnAmarilloIluminado = this.findViewById<Button>(R.id.btnAmarillo2)

        cambiarVisivilidad(btnAmarillo, btnAmarilloIluminado)

        Handler(Looper.getMainLooper()).postDelayed(
            {

                cambiarVisivilidad(btnAmarilloIluminado, btnAmarillo)
            },
            2000 // value in milliseconds
        )
    }

    override fun pulsarAzul() {
        val btnAzul = this.findViewById<Button>(R.id.btnAzul)
        val btnAzulIluminado = this.findViewById<Button>(R.id.btnAzul2)

        cambiarVisivilidad(btnAzul, btnAzulIluminado)

        Handler(Looper.getMainLooper()).postDelayed(
            {

                cambiarVisivilidad(btnAzulIluminado, btnAzul)
            },
            2000 // value in milliseconds
        )

    }

    fun empezarPartida(){

        listaSimon.clear()


        empezarRonda()

    }

    fun empezarRonda(){

        listaSimon.add(generarNumeroAleatorio())

        iluminarBotones(listaSimon)
    }

    fun cambiarVisivilidad( boton1 : Button , boton2: Button ){

        boton1.visibility= View.INVISIBLE;
        boton2.visibility= View.VISIBLE;
    }
    fun generarNumeroAleatorio(): Int{
        val opcionesRandom = arrayOf( 0, 1, 2, 3)


        val eleccionRandom = opcionesRandom[(0..3).random()]
        println(eleccionRandom)
        return eleccionRandom
    }

    fun iluminarBotones(lista : List<Int>){

        for (i in lista.indices){
            if (lista[i] == 0){
                pulsarVerde()
            }
            else if (lista[i] == 1){
                pulsarRojo()
            }
            else if (lista[i] == 2){
                pulsarAmarillo()
            }
            else{
                pulsarAzul()
            }
        }

    }

}