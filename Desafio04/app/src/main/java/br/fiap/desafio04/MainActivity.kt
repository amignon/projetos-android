package br.fiap.desafio04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagemJ1 = findViewById<ImageView>(R.id.imagemJ1)
        val imagemJ2 = findViewById<ImageView>(R.id.imagemJ2)
        val btnJogar = findViewById<Button>(R.id.btnJogar)
        btnJogar.setOnClickListener {
            val j1 = Random.nextInt(1, 7)
            val j2 = Random.nextInt(1, 7)
            imagemJ1.setImageResource(idImagemDado(j1))
            imagemJ2.setImageResource(idImagemDado(j2))
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
        return when(valor) {
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