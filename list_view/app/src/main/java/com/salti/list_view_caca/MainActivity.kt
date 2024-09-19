package com.salti.list_view_caca

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.salti.list_view_caca.loginpage.MovieActivity
import com.salti.list_view_caca.model.RecycleBuahImageActivity

class MainActivity : AppCompatActivity() {

    private lateinit var eUser : EditText
    private lateinit var ePass : EditText
    private lateinit var btnLogin : Button
    private lateinit var btnList : Button
    private lateinit var btnRecycleView1 : Button
    private lateinit var btnRecycleBuah1 : Button
    private lateinit var btnRecycleMovie : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        eUser = findViewById(R.id.eUser1)
        ePass = findViewById(R.id.ePass1)
        btnLogin = findViewById(R.id.btnLogin1)
        btnList = findViewById(R.id.btnList1)
        btnRecycleView1 = findViewById(R.id.btnRecycleView1)
        btnRecycleBuah1 = findViewById(R.id.btnRecycleBuah1)
        btnRecycleMovie = findViewById(R.id.btnRecycleMovie)

        btnLogin.setOnClickListener(){
            val nUsername = eUser.text.toString()
            val nPassword = ePass.text.toString()

            val intentPassingData = Intent(this@MainActivity,WelcomePage::class.java)
            intentPassingData.putExtra("username", nUsername)
            intentPassingData.putExtra("password", nPassword)

            Log.d("cek data username", nUsername)
            Log.d("cek data password", nPassword)
            startActivity(intentPassingData)
        }

        btnList.setOnClickListener{
            val intent = Intent(this@MainActivity, ListView::class.java)
            startActivity(intent)
        }

        btnRecycleView1.setOnClickListener{
            val intent = Intent(this@MainActivity, RecycleView::class.java)
            startActivity(intent)
        }

        btnRecycleBuah1.setOnClickListener{
            val intent = Intent(this@MainActivity, RecycleBuahImageActivity::class.java)
            startActivity(intent)
        }

        btnRecycleMovie.setOnClickListener{
            val intent = Intent(this@MainActivity, MovieActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}