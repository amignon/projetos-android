package br.fiap.desafio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val n1 = intent.getDoubleExtra("n1", 0.0)
        val n2 = intent.getDoubleExtra("n2", 0.0)
        val soma = intent.getDoubleExtra("resultado", 0.0)
        tvResultado.text = "$n1 + $n2 = $soma"
    }
}