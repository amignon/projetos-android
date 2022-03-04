package br.fiap.desafio02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSomar.setOnClickListener {
            if (camposValidos()) {
                val n1 = txtN1.text.toString().toDouble()
                val n2 = txtN2.text.toString().toDouble()
                val soma = soma(n1, n2)
                val intentResultado = Intent(this, ResultadoActivity::class.java)
                intentResultado.putExtra("n1", n1)
                intentResultado.putExtra("n2", n2)
                intentResultado.putExtra("resultado", soma)
                startActivity(intentResultado)
            }
        }
    }

    fun camposValidos() : Boolean {
        var msg = ""
        if (txtN1.text.trim().isEmpty()) {
            msg = "Informe o primeiro número."
        }
        else if (txtN2.text.trim().isEmpty()) {
            msg = "Informe o segundo número."
        }
        else {
            return true
        }
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        return false
    }

    fun soma(n1 : Double, n2 : Double) : Double {
        return n1 + n2
    }
}