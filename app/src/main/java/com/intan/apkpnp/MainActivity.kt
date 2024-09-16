package com.intan.apkpnp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Find buttons from the layout and set click listeners to open new activities
        val btnManajemenInformatika = findViewById<Button>(R.id.btnManajemenInformatika)
        val btnTeknikKomputer = findViewById<Button>(R.id.btnTeknikKomputer)
        val btnGaleriPhoto = findViewById<Button>(R.id.btnGaleriPhoto)

        // Open Manajemen Informatika activity
        btnManajemenInformatika.setOnClickListener {
            val intent = Intent(this, ManajemenInformatikaActivity::class.java)
            startActivity(intent)
        }

        // Open Teknik Komputer activity
        btnTeknikKomputer.setOnClickListener {
            val intent = Intent(this, TeknikKomputerActivity::class.java)
            startActivity(intent)
        }

        // Open Galeri Photo activity
        btnGaleriPhoto.setOnClickListener {
            val intent = Intent(this, GaleriPhotoActivity::class.java)
            startActivity(intent)
        }
    }
}