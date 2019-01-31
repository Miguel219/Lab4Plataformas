package com.example.lab4plataformas

import android.app.Application

class MyApplication: Application() {
    companion object {
        //Se crea un arreglo de los proyectos
        var labArray: ArrayList<String> = arrayListOf("Laboratorio 2","Laboratorio 3","Laboratorio 4")
        //Se crea una variable que guarde la posicion seleccionada por el usuario
        var selectedPosition: Int = 0
    }
}