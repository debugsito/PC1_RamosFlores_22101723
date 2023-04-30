package com.example.pc1_ramos_22101723

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActiviy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_activiy)

        val valor1 =  intent.getIntExtra("valor1",0)
        val valor2 =  intent.getIntExtra("valor2",0)
        val tvSuma = findViewById<TextView>(R.id.tvSuma)
        val tvResta = findViewById<TextView>(R.id.tvResta)
        val tvMulti = findViewById<TextView>(R.id.tvMulti)
        val tvDivision = findViewById<TextView>(R.id.tvDivision)
        tvSuma.text = (valor1+valor2).toString()
        tvResta.text = (valor1-valor2).toString()
        tvMulti.text = (valor1*valor2).toString()
        if(valor2!=0){
            tvDivision.text = (valor1/valor2).toString()
        }

        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}