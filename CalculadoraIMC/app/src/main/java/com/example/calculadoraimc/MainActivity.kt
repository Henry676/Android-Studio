package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MiApp","onCreate()")
    }

    fun calcularIMC(view: View){
        var campo1 = true
        var campo2 = true

        val txtestatura: EditText = findViewById(R.id.editText)
        val txtpeso: EditText = findViewById(R.id.editText2)

        val estatura: Float? = txtestatura.text.toString().toFloatOrNull()
        val peso: Float? = txtpeso.text.toString().toFloatOrNull()

        txtestatura.error = null
        txtpeso.error = null

        if(txtestatura.text.toString().isEmpty()){
            campo1 = false
            txtestatura.error = "Campo requerido"
        }
        if(txtpeso.text.toString().isEmpty()){
            campo2 = false
            txtpeso.error = "Campo requerido"
        }
        if(campo1 && campo2){
            var imc = (peso ?: 0.0F) / ((estatura ?: 0.0F) * (estatura ?: 0.0F))
            if(imc <= 15){
                Toast.makeText(
                    this@MainActivity,
                    "IMC: ${imc}\nRango: Delgadez muy severa",
                    Toast.LENGTH_LONG
                ).show()
            }
            if(imc in 15.0..15.9){
                Toast.makeText(
                    this@MainActivity,
                    "IMC: ${imc}\nRango: Delgadez severa",
                    Toast.LENGTH_LONG
                ).show()
            }
            if(imc in 16.0..18.4){
                Toast.makeText(
                    this@MainActivity,
                    "IMC: ${imc}\nRango: Delgadez",
                    Toast.LENGTH_LONG
                ).show()
            }
            if(imc in 18.5..24.9){
                Toast.makeText(
                    this@MainActivity,
                    "IMC: ${imc}\nRango: Peso saludable",
                    Toast.LENGTH_LONG
                ).show()
            }
            if(imc in 25.0..29.9){
                Toast.makeText(
                    this@MainActivity,
                    "IMC: ${imc}\nRango: Sobrepeso",
                    Toast.LENGTH_LONG
                ).show()
            }
            if(imc in 30.0..34.9){
                Toast.makeText(
                    this@MainActivity,
                    "IMC: ${imc}\nRango: Obesidad moderada",
                    Toast.LENGTH_LONG
                ).show()
            }
            if(imc in 35.0..39.9){
                Toast.makeText(
                    this@MainActivity,
                    "IMC: ${imc}\nRango: Obesidad severa",
                    Toast.LENGTH_LONG
                ).show()
            }
            if(imc >= 40){
                Toast.makeText(
                    this@MainActivity,
                    "IMC: ${imc}\nRango: Obesidad muy severa (obesidad morbida)",
                    Toast.LENGTH_LONG
                ).show()
            }
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

    override fun onStop() {
        super.onStop()
        Log.e("MiApp","onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MiApp","onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("MiApp","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MiApp","onDestroy()")
    }

}