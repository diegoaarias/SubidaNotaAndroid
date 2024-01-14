package com.example.subidanota.data
import android.graphics.ColorSpace.Model
import com.example.subidanota.R
import com.example.subidanota.model.Moneda

class DataSet {
    companion object{
        val listaMonedas = ArrayList<Moneda>()
        fun obtenerListaCompleta(): ArrayList<Moneda> {

            listaMonedas.add(Moneda("Dollar",R.drawable.dollar))
            listaMonedas.add(Moneda("Euro",R.drawable.euro))
            listaMonedas.add(Moneda("Libra",R.drawable.libra))

            return listaMonedas
        }
    }
}