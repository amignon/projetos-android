package br.com.fiap.desafio02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSomar.setOnClickListener { view : View ->
            if (camposValidos()) {
                val n1 = txtN1.text.toString().toDouble()
                val n2 = txtN2.text.toString().toDouble()
                var soma = soma(n1, n2)
                var intentResultado = Intent(this, ResultadoActivity::class.java)
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
        if (msg.equals("")) {
            return true
        }
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        return false
    }

    fun soma(n1 : Double, n2 : Double) : Double {
        return n1 + n2;
    }
}