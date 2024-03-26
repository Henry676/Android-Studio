package com.example.calculadorabsica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MiApp","onCreate()")
    }


    fun sumarNumeros(view: View) {
        var campoN1 = true // Banderas para comprobar si se dejó el campo vacío
        var campoN2 = true

        val txtN1: EditText = findViewById(R.id.campoN1)
        val txtN2: EditText = findViewById(R.id.campoN2)
        val total: EditText = findViewById(R.id.resultado)//Solo se inicializa

        txtN1.error = null
        txtN2.error = null

        val n1: Float? = txtN1.text.toString().toFloatOrNull()
        val n2: Float? = txtN2.text.toString().toFloatOrNull()

        if (txtN1.text.toString().trim().isEmpty()) {
            campoN1 = false
            txtN1.error = getString(R.string.activity_main_error)
        }
        if (txtN2.text.toString().trim().isEmpty()) {
            campoN2 = false
            txtN2.error = getString(R.string.activity_main_error)
        }


        if (campoN1 && campoN2) {
            /*Toast.makeText(
                this@MainActivity,
                "Valor 1: ${txtN1.text}y valor 2: ${txtN2.text}",
                Toast.LENGTH_LONG
            ).show()*/

            val result = (n1 ?: 0f) + (n2 ?: 0f)
            total.setText(result.toString())
        }
    }

    fun restarNumeros(view: View){
        var campoN1 = true
        var campoN2 = true //Banderas

        var txtn1: EditText = findViewById(R.id.campoN1)
        var txtn2: EditText = findViewById(R.id.campoN2)
        var total: EditText = findViewById(R.id.resultado)

        txtn1.error = null//Limpieza de algun mensaje que se haya enviado anteriormente (campo requerido)
        txtn2.error = null

        val n1: Float? = txtn1.text.toString().toFloatOrNull()
        val n2: Float? = txtn2.text.toString().toFloatOrNull()

        if(txtn1.text.toString().trim().isEmpty()){
            campoN1 = false;
            txtn1.error = "Campo requerido"
        }
        if(txtn2.text.toString().trim().isEmpty()){
            campoN2 = false;
            txtn2.error = "Campo requerido"
        }
        if(campoN1 && campoN2) {
            /*Toast.makeText(
                this@MainActivity,
                "Valor 1: ${txtn1.text} y valor 2: ${txtn2.text}",
                Toast.LENGTH_LONG
            ).show()//Mensaje flotante indicando los valores ingresados*/
            var resultado = (n1 ?: 0f) - (n2 ?: 0F)
            total.setText(resultado.toString())
        }
    }

    fun multiplicarNumeros(view: View){
        var campoN1 = true
        var campoN2 = true

        val txtN1: EditText = findViewById(R.id.campoN1)
        val txtN2: EditText = findViewById(R.id.campoN2)
        val total: EditText = findViewById(R.id.resultado)

        val n1: Float? = txtN1.text.toString().toFloatOrNull()
        val n2: Float? = txtN2.text.toString().toFloatOrNull()

        txtN1.error = null
        txtN2.error = null

        if(txtN1.text.toString().isEmpty()){
            campoN1 = false
            txtN1.error="Campo requerido"
        }
        if(txtN2.text.toString().isEmpty()){
            campoN2 = false
            txtN2.error="Campo requerido"
        }
        if(campoN1 && campoN2){
            /*Toast.makeText(
                this@MainActivity,
                "Valor 1: ${txtN1.text} y valor 2: ${txtN2.text}",
                Toast.LENGTH_LONG
            ).show()*/
            var result =(n1 ?: 0.0F) * (n2 ?: 0.0F)
            total.setText(result.toString())
        }
    }
    fun dividirNumeros(view: View){
        var campoN1 = true
        var campoN2 = true

        val txtN1: EditText = findViewById(R.id.campoN1)
        val txtN2: EditText = findViewById(R.id.campoN2)
        val total: EditText = findViewById(R.id.resultado)

        val n1: Float? = txtN1.text.toString().toFloatOrNull()
        val n2: Float? = txtN2.text.toString().toFloatOrNull()

        txtN1.error = null
        txtN2.error = null

        if(txtN1.text.toString().isEmpty()){
            campoN1 = false
            txtN1.error="Campo requerido"
        }
        if(txtN2.text.toString().isEmpty()){
            campoN2 = false
            txtN2.error="Campo requerido"
        }
        if(campoN1 && campoN2){
            /*Toast.makeText(
                this@MainActivity,
                "Valor 1: ${txtN1.text} y valor 2: ${txtN2.text}",
                Toast.LENGTH_LONG
            ).show()*/
            var resultado = (n1 ?: 0.0F) / (n2 ?: 0.0F)
            total.setText(resultado.toString())
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("MiApp","onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.e("MiApp","onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MiApp","onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MiApp","onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("MiApp","onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MiApp","onDestroy()")
    }
}