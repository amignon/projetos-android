
package br.fiap.cp01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.DecimalFormat

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val assinatura = intent.getDoubleExtra("assinatura", 0.0)
        val valorLocal = intent.getDoubleExtra("valor_local", 0.0)
        val valorCelular = intent.getDoubleExtra("valor_celular", 0.0)
        val total = intent.getDoubleExtra("total", 0.0)
        val dec = DecimalFormat("#0.00")
        val mensagem = """
            |Assinatura     : R$ ${dec.format(assinatura)}
            |Chamada Local  : R$ ${dec.format(valorLocal)}
            |Chamada Celular: R$ ${dec.format(valorCelular)}
            |
            |Total          : R$ ${dec.format(total)}
            """.trimMargin()
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        tvResultado.text = mensagem
    }
}