package com.example.linearlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityConstraint : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint)
    }
    fun grid(view: View) {
        when (view.getId()) {
            R.id.activity_constraint -> {
                val Intent = Intent(this, ActivityGrid::class.java)
                startActivity(Intent)
            }
        }
    }
}