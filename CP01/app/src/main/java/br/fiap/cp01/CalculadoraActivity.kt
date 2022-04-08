package br.fiap.cp01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import java.text.DecimalFormat

class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        val txtN1 = findViewById<EditText>(R.id.txtN1)
        val txtN2 = findViewById<EditText>(R.id.txtN2)
        val rgOperacoes = findViewById<RadioGroup>(R.id.rgOperacoes)

        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        btnCalcular.setOnClickListener {
            val valor1 = txtN1.text.toString().toDouble()
            val valor2 = txtN2.text.toString().toDouble()
            val resultado = when (rgOperacoes.checkedRadioButtonId) {
                R.id.rbSoma -> valor1 + valor2
                R.id.rbSubtracao ->  valor1 - valor2
                R.id.rbMultiplicacao -> valor1 * valor2
                R.id.rbDivisao -> valor1 / valor2
                else -> 0.0
            }
            val dec = DecimalFormat("#0.00")
            val mensagem = "Resultado = ${dec.format(resultado)}"
            Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
        }
    }
}