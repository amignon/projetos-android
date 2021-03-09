package br.com.fiap.alcoolgasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        // o objeto intent permite  recuperar todos os valores definidos na tela anterior
        lbResultado.text = intent.getStringExtra("msg")

    }
}