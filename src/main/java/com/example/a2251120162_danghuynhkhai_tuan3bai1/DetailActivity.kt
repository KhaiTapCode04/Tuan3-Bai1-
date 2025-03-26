package com.example.a2251120162_danghuynhkhai_tuan3bai1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.a2251120162_danghuynhkhai_tuan3bai1.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val title = intent.getStringExtra("TITLE")
        val description = intent.getStringExtra("DESCRIPTION")

        findViewById<TextView>(R.id.detailTitle).text = title
        findViewById<TextView>(R.id.detailDescription).text = description
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}