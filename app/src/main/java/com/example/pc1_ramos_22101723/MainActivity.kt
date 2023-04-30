package com.example.pc1_ramos_22101723

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inValor1 :  EditText = findViewById(R.id.txtValor1)
        val inValor2 :  EditText = findViewById(R.id.txtValor2)
        val btnEnviar : Button = findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener{
            this.sendValues(inValor1.text.toString().toInt(),inValor2.text.toString().toInt())
        }
    }

    private fun sendValues(value1: Int,value2:Int)
    {
        val intent =  Intent(this,ResultadoActiviy::class.java)
        intent.putExtra("valor1",value1)
        intent.putExtra("valor2",value2)
        startActivity(intent)
    }

}