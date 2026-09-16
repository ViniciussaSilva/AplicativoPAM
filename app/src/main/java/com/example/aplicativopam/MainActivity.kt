package com.example.aplicativopam


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aulaid)

        val botao = findViewById<Button>(R.id.btnProxima)
        val texto = findViewById<EditText>(R.id.edtValor)

        botao.text = "Teste Botão"

        botao.setOnClickListener {
           botao.text = texto.text

            }
        }
    }

