package com.example.lab4plataformas

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        lab2.setOnClickListener {
            webView.webViewClient = WebViewClient()
            webView.loadUrl("https://github.com/Miguel219/Lab2Plataformas")
        }
        lab3.setOnClickListener {
            webView.webViewClient = WebViewClient()
            webView.loadUrl("https://github.com/Miguel219/Lab3Plataformas")
        }
        lab4.setOnClickListener {
            webView.webViewClient = WebViewClient()
            webView.loadUrl("https://github.com/Miguel219/Lab4Plataformas")
        }
    }

    override fun onBackPressed() {
        val intent: Intent = Intent(  this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
