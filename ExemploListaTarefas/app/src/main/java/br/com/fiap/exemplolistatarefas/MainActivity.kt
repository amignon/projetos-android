package br.com.fiap.exemplolistatarefas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // lista de tarefas
    var tarefas = ArrayList<String>()
    // adapter para o ListView
    var adapter : ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // define o adapter para o ListView
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, tarefas)
        lstTarefas.adapter = adapter

        // define o evento de tratamento do botão
        fab.setOnClickListener {
            adicionarTarefa()
        }

        // define o evento de tratmento quando um item da lista é clicado
        lstTarefas.setOnItemClickListener { parent, view, position, id ->
            var tarefa = parent.adapter.getItem(position).toString()
            atualizarTarefa(tarefa, position)
        }
    }

    fun adicionarTarefa() {
        // cria um AlertDialog para o usuário inserir uma tarefa
        var builder = AlertDialog.Builder(this)
        builder.setTitle("Nova Tarefa");
        // adiciona um EditText ao AlertDialog
        val entrada = EditText(this)
        builder.setView(entrada)
        // define o tratamento para quando o botão OK for pressionado
        builder.setPositiveButton("OK") { dialog, which ->
            tarefas.add(entrada.text.toString())
            adapter?.notifyDataSetChanged()
        }
        builder.setNegativeButton("Cancel", null)
        builder.create().show()
    }

    fun atualizarTarefa(tarefa: String, posicao : Int) {
        var builder = AlertDialog.Builder(this)
        builder.setTitle("Atualizar Tarefa");
        val entrada = EditText(this)
        entrada.setText(tarefa, TextView.BufferType.EDITABLE)
        builder.setView(entrada)
        // tratamento do botão OK
        builder.setPositiveButton("OK") { dialog, which ->
            tarefas[posicao] = entrada.text.toString()
            adapter?.notifyDataSetChanged()
        }
        builder.setNegativeButton("Cancel", null)
        // tratamento do botão Excluir
        builder.setNeutralButton("Excluir") { dialog, which ->
            tarefas.removeAt(posicao)
            adapter?.notifyDataSetChanged()
        }
        builder.create().show()
    }
}