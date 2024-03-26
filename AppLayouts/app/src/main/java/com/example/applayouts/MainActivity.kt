package com.example.applayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    protected var contadorLike: Int = 0
    protected var contadorDislike: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtlike: TextView=findViewById(R.id.likeCount)
        if(savedInstanceState!=null){
            contadorLike=savedInstanceState.getInt("contLike")
        }
        txtlike.text=contadorLike.toString()
        val txtdislike: TextView=findViewById(R.id.dislikeCount)
        if(savedInstanceState!=null){
            contadorDislike=savedInstanceState.getInt("contDislike")
        }
        txtlike.text=contadorDislike.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("contLike",contadorLike);
        outState.putInt("contDislike",contadorDislike);
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val txtlike: TextView=findViewById(R.id.likeCount)
        val txtDislike: TextView=findViewById(R.id.dislikeCount)
        if (savedInstanceState!=null){
            contadorLike=savedInstanceState.getInt("contLike")
        }
        txtlike.text=contadorLike.toString()
        if (savedInstanceState!=null){
            contadorDislike=savedInstanceState.getInt("contDislike")
        }
        txtDislike.text=contadorDislike.toString()
    }

    fun contarLikes(view: View){//Funcion para contar los clicks en el boton
        val txtLike: TextView = findViewById(R.id.likeCount)
        contadorLike++
        txtLike.text=contadorLike.toString()
    }
    fun contarDislike(view: View){
        val txtDislike: TextView = findViewById(R.id.dislikeCount)
        contadorDislike++
        txtDislike.text=contadorDislike.toString()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}