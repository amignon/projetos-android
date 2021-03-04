package br.com.dominiodaaplicacao.exemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotao(view: View) {
        val msg = "Olá Mundo!"
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }
}