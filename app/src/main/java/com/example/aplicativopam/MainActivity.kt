package com.example.aplicativopam


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.toString

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exercicio_nota)

        /*
        val botaoExer1 = findViewById<Button>(R.id.btnExer1)
        val edtExer1 = findViewById<EditText>(R.id.edtExer1)
        val txtExer1 = findViewById<TextView>(R.id.txtExer1)
        botaoExer1.setOnClickListener {

            var numero = edtExer1.text.toString().toInt() * 2
            txtExer1.text = numero.toString()

        }

         */

        /*
        val botaoExer2 = findViewById<Button>(R.id.btnExer2)
        val edtExer2 = findViewById<EditText>(R.id.edtExer2)
        val txtExer2 = findViewById<TextView>(R.id.txtExer2)
        botaoExer2.setOnClickListener {

            var numero = edtExer2.text.toString().toInt() * 365
            txtExer2.text = "Voce viveu: " + numero.toString() + " dias"


        }
*/
        /*

       val botaoExer3 = findViewById<Button>(R.id.btnExer3)
       val edtExer3 = findViewById<EditText>(R.id.edtExer3)
       val txtExer3 = findViewById<TextView>(R.id.txtExer3)
       botaoExer3.setOnClickListener {

               val valorConta = edtExer3.text.toString().toDouble()

               val gorjeta = valorConta * 0.10

               txtExer3.text = String.format("%.2f", gorjeta)
           }
*/


        val botaoExer4 = findViewById<Button>(R.id.btnExer4)
        val edtExer4 = findViewById<EditText>(R.id.edtExer4)
        val txtExer4 = findViewById<TextView>(R.id.txtExer4)
        botaoExer4.setOnClickListener {

            val valorDolar = edtExer4.text.toString().toDouble()

            val Dolar = valorDolar * 5.50

            txtExer4.text = String.format("")

        }

    }
}