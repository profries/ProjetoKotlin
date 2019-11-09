package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.model.Produto

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nome = "Fulano"
        println("Hello ${nome}")
        val celular = Produto(1,"celular",700.0)
        println(celular.nome);


    }
}
