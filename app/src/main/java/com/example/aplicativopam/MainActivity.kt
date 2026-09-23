package com.example.aplicativopam


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exercicio_nota)

        val botaoExer1 = findViewById<Button>(R.id.btnExer1)
        val edtExer1 = findViewById<EditText>(R.id.edtExer1)
        val txtExer1 = findViewById<TextView>(R.id.txtExer1)
        botaoExer1.setOnClickListener {

            var numero = edtExer1.text.toString().toInt() * 2
            txtExer1.text = numero.toString()
        }


            }
        }


