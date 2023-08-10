package com.curso.android.app.practica.appintegradora

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity





  class MainActivity : AppCompatActivity() {

      private lateinit var bot1: Button
      private lateinit var text1: EditText
      private lateinit var text2: EditText
      private lateinit var tview1: TextView

      @SuppressLint("MissingInflatedId", "SetTextI18n")
      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          this.tview1 = findViewById(R.id.tview1)
          this.text1 = findViewById(R.id.text1)
          this.text2 = findViewById(R.id.text2)
          this.bot1 = findViewById(R.id.bot1)


          val text1 = text1
          val text2  = text2
          val tview1 : TextView = tview1
          bot1.setOnClickListener{



            val text1 = text1.text.toString()
            val text2 = text2.text.toString()
              tview1.text ="Escriba texto en ambos campos y pulse el boton paea comparar"


            if (text1 contentEquals  text2){
                tview1.text =  "Los campos  coinciden"
                return@setOnClickListener

            } else {
                tview1.text = "Los campos no coinciden"
                return@setOnClickListener

            }

            }

        }
    }




