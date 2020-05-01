package com.mobdev_team4_6d_uts.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import com.mobdev_team4_6d_uts.R

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var btnBack = findViewById<Button>(R.id.btnDasbord)
        btnBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        var address = findViewById<CardView>(R.id.cvAlamat)
        address.setOnClickListener {
            startActivity(Intent(this, MapsActivity::class.java))
        }
    }
}
