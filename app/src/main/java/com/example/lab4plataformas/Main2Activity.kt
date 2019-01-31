package com.example.lab4plataformas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    //Regresa a la actividad principal al seleccionar atras
    override fun onBackPressed() {
        val intent: Intent = Intent(  this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
