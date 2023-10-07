package com.example.aplicacionregistro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class PantallaInicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_inicial)

        val btnCrear = findViewById<Button>(R.id.btnCrear);
        val btnCancelar: Button = findViewById(R.id.btnCancelar);

        btnCrear.setOnClickListener{
            val productScreen = Intent(this, RegistroLogueo::class.java)
            startActivity(productScreen)
        };

        btnCancelar.setOnClickListener {
            Toast.makeText(this, "El usuario esta intentando cancelar el registro", Toast.LENGTH_LONG).show();
        }


    }
}