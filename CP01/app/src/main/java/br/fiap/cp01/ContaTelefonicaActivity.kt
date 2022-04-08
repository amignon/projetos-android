package br.fiap.cp01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ContaTelefonicaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conta_telefonica)

        val txtAssinatura = findViewById<EditText>(R.id.txtAssinatura)
        val txtMinLocal = findViewById<EditText>(R.id.txtMinLocal)
        val txtMinCelular = findViewById<EditText>(R.id.txtMinCelular)
        val btnCalcularConta = findViewById<Button>(R.id.btnCalcularConta)
        btnCalcularConta.setOnClickListener {
            val assinatura = txtAssinatura.text.toString().toDouble()
            val minLocal = txtMinLocal.text.toString().toDouble() * 0.04
            val minCelular = txtMinCelular.text.toString().toDouble() * 0.20
            val total = assinatura + minLocal + minCelular
            val intentResultado = Intent(this, ResultadoActivity::class.java)
            intentResultado.putExtra("assinatura", assinatura)
            intentResultado.putExtra("valor_local", minLocal)
            intentResultado.putExtra("valor_celular", minCelular)
            intentResultado.putExtra("total", total)
            startActivity(intentResultado)
        }
    }
}