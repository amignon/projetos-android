package br.com.fiap.alcoolgasolina

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

        // Função que implementa o evento de clique em um botão
        btnCalcular.setOnClickListener {view : View? ->
            // declaração implicita do tipo da variável
            var precoAlcool = txtPrecoAlcool.text.toString().toDouble()
            var precoGasolina = txtPrecoGasolina.text.toString().toDouble()
            // declaração explícita do tipo da variável
            var resultado : Double = precoAlcool / precoGasolina
            var mensagem = ""
            if (resultado > 0.7) {
                mensagem = "Gasolina"
            }
            else if (resultado < 0.7) {
                mensagem = "Álcool"
            }
            else {
                mensagem = "Tanto faz"
            }

            // instancia do objeto Intent, apontando a Activity alvo.
            var intentResultado = Intent(this, ResultadoActivity::class.java)
            // armazenamento por conjuntos de chave-valor
            intentResultado.putExtra("msg", mensagem)
            // disparo da Intent para carregar a nova tela
            startActivity(intentResultado)

        }
    }
}