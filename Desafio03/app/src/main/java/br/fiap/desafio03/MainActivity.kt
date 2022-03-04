package br.fiap.desafio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rbMasculino = findViewById<RadioButton>(R.id.rbMasculino)
        val txtAltura = findViewById<EditText>(R.id.txtAltura)
        val btnPesoIdeal = findViewById<Button>(R.id.btnPesoIdeal)

        btnPesoIdeal.setOnClickListener {
            val altura = txtAltura.text.toString().toDouble()
            val pesoIdeal : Double
            if (rbMasculino.isChecked) {
                pesoIdeal = (72.7 * altura) - 58
            }
            else {
                pesoIdeal = (62.1 * altura) - 44.7
            }
            val dec = DecimalFormat("#.0")
            val mensagem = "Peso Ideal = ${dec.format(pesoIdeal)} kg"
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
        }
    }
}