package com.localiza.sample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        val btn_main_activity = findViewById<Button>(R.id.btnActivity)
        btn_main_activity.setOnClickListener {
            val myIntent = Intent(this@TestActivity, MainActivity::class.java)
            startActivity(myIntent)
        }
    }
}