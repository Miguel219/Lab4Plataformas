package com.example.lab4plataformas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main4.*

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        //Se setean los valores segun la opcion elegida
        labTextView.text = "Laboratorio "+(MyApplication.selectedPosition+2)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://github.com/Miguel219/Lab"+(MyApplication.selectedPosition+2)+"Plataformas")

    }
    //Regresa a la actividad de la lista de los proyectos al seleccionar atras
    override fun onBackPressed() {
        val intent: Intent = Intent(  this, Main3Activity::class.java)
        startActivity(intent)
        finish()
    }
}
