package com.example.aplicacionregistro

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class RegistroLogueo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_logueo)

        val btnSalir: Button = findViewById(R.id.btnSalir)

        btnSalir.setOnClickListener{

            val titleMsg: String = "Confirmación"
            val bodyMsg: String = "¿Está seguro que desea abandonar la aplicación?"

            showModalConfirmExit(titleMsg, bodyMsg);

        }

}

    private fun showModalConfirmExit(titleMsg: String, bodyMsg: String) {
        val dialogConfirm = Dialog(this)
        dialogConfirm.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogConfirm.setCancelable(false)
        dialogConfirm.setContentView(R.layout.custom_model_dialog)

        dialogConfirm.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        //INICIO

        val titleModal : TextView = dialogConfirm.findViewById(R.id.modalTitle)
        val bodyMsgModal : TextView = dialogConfirm.findViewById(R.id.modalMessage)

        val btnSi : Button = dialogConfirm.findViewById(R.id.btnModalSi)
        val btnNo: Button = dialogConfirm.findViewById(R.id.btnModalNo)

        titleModal.text = titleMsg
        bodyMsgModal.text = bodyMsg

        btnSi.setOnClickListener {
            val pantallaInicial = Intent(this, PantallaInicial::class.java)
            startActivity(pantallaInicial)
        }

        btnNo.setOnClickListener {

            dialogConfirm.dismiss()
        }

        dialogConfirm.show()

    }

    }
