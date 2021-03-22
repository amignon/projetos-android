package br.com.fiap.pesoideal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPesoIdeal.setOnClickListener { _: View ->
            var altura = txtAltura.text.toString().toDouble()
            var pesoIdeal : Double
            if (rbMasculino.isChecked) {
                pesoIdeal = (72.7 * altura) - 58
            }
            else {
                pesoIdeal = (62.1 * altura) - 44.7
            }
            val dec = DecimalFormat("#.0")
            val mensagem = "Peso Ideal: ${dec.format(pesoIdeal)}  kg"
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
        }
    }
}