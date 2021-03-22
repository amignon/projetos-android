package br.com.fiap.desafio04_jogodedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnJogar.setOnClickListener {
            var j1 = Random.nextInt(1, 7)
            var j2 = Random.nextInt(1, 7)
            imageJ1.setImageResource(idImagemDado(j1))
            imageJ2.setImageResource(idImagemDado(j2))
            var msg = ""
            if (j1 > j2) {
                msg = "Vencedor: Jogador 1"
            }
            else if (j2 > j1) {
                msg = "Vencedor: Jogador 2"
            }
            else {
                msg = "Empate"
            }
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        }
    }

    fun idImagemDado(valor: Int) : Int {
        return when (valor) {
            1 -> R.drawable.face1
            2 -> R.drawable.face2
            3 -> R.drawable.face3
            4 -> R.drawable.face4
            5 -> R.drawable.face5
            6 -> R.drawable.face6
            else -> R.drawable.face1
        }
    }
}