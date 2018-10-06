package com.kotlin.order.coffee.coffeeorder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ordenarTaza(view: View){
        //var txtNroTazas1 =
        //        findViewById<TextView>(R.id.txtNroTazas)

        //var resultado1 =
        //       findViewById<TextView>(R.id.resultado)
        //resultado1.setText("Usted ordeno ${txtNroTazas1.text}")
        resultado.setText(getString(R.string.orden) +
                txtNroTazas.text + "Taza")

    }
}
