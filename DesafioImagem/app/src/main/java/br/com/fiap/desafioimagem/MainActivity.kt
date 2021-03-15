package br.com.fiap.desafioimagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotao(view : View) {
        when (view.id) {
            R.id.btn1 -> imagem.setImageResource(R.drawable.dino1)
            R.id.btn2 -> imagem.setImageResource(R.drawable.dino2)
            R.id.btn3 -> imagem.setImageResource(R.drawable.dino3)
        }
    }
}