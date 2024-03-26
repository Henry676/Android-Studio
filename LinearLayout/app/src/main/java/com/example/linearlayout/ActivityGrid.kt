package com.example.linearlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityGrid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)
    }

    fun frame(view: View){
        when(view.getId()){
            R.id.activity_grid ->{
                val Intent = Intent(this,ActivityFrame::class.java)
                startActivity(Intent)
            }
        }
    }
}