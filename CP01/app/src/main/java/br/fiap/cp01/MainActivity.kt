package br.fiap.cp01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculadora = findViewById<Button>(R.id.btnCalculadora)
        btnCalculadora.setOnClickListener {
            startActivity(Intent(this, CalculadoraActivity::class.java))
        }

        val btnContaTelefonica = findViewById<Button>(R.id.btnContaTelefonica)
        btnContaTelefonica.setOnClickListener {
            startActivity(Intent(this, ContaTelefonicaActivity::class.java))
        }

        val btnIntegrantes = findViewById<Button>(R.id.btnIntegrantes)
        btnIntegrantes.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder
                .setTitle("Desenvolvido por")
                .setMessage("Alexandre Mignon\nNome 02")
                .setPositiveButton("OK", null)
            builder.create().show()
        }
    }
}