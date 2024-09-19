package com.salti.list_view_caca.model

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.salti.list_view_caca.R
import com.salti.list_view_caca.adapter.BuahAdapter

class RecycleBuahImageActivity : AppCompatActivity() {

    private lateinit var rv_buah1 : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_buah_image)

        rv_buah1= findViewById(R.id.rv_buah1)

        rv_buah1.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false)

        val adapter = BuahAdapter(MockList.getModel() as ArrayList<ModelBuah>)
        rv_buah1.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}