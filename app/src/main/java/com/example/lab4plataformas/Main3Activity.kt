package com.example.lab4plataformas

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //Se utiliza adapter para agregar el arreglo al listview
        var adapter = ArrayAdapter(this, R.layout.listview_item, MyApplication.labArray)
        labList.adapter = adapter
        //Al seleccionar un contacto se va a la activity del laboratorio seleccionado
        labList.setOnItemClickListener {
                parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            //Se guarda la posicion seleccionada
            MyApplication.selectedPosition = position
            val intent: Intent = Intent(  this, Main4Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
    //Regresa a la actividad principal al seleccionar atras
    override fun onBackPressed() {
        val intent: Intent = Intent(  this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
