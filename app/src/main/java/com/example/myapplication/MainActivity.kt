package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.model.Pedido
import com.example.myapplication.model.Produto

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val nome = "Fulano"
        //println("Hello ${nome}")
        //val celular = Produto(1,"celular",700.0)
        //println(celular.nome);

        var pedido = Pedido()
        pedido.add(Produto(1,"celular",700.0))
        pedido.add(Produto(2,"tablet",930.0))
        pedido.add(Produto(3,"mouse",70.0))
        pedido.frete = 10.0
        println(pedido.getValorTotal())
        println(pedido.getQuantidade())


    }
}
