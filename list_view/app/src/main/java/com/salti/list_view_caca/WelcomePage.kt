package com.salti.list_view_caca

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomePage : AppCompatActivity() {

    private lateinit var txtWelcome1 : TextView
    private lateinit var btnHomePage : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_page)

        txtWelcome1 = findViewById(R.id.txtWelcome1)
        // get data yang telah di put extras intent
        btnHomePage = findViewById(R.id.btnHomePage) // inisialisasi btnHomePage

        val getDataUsername = intent.getStringExtra("username")
        val getDataPassword = intent.getStringExtra("password")
        txtWelcome1.setText("Hello ${getDataUsername}!\n Password anda adalah : ${getDataPassword}")

        btnHomePage.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}