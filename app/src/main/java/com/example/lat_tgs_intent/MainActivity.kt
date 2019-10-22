package com.example.lat_tgs_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nim = findViewById<EditText>(R.id.nim)
        val nama = findViewById<EditText>(R.id.nama)
        val nilai = findViewById<EditText>(R.id.nilai)
        val proses = findViewById<Button>(R.id.proses)

        proses.setOnClickListener(){
            val Data_nim =nim.text.toString()
            val Data_nama=nama.text.toString()
            val Data_nilai=nilai.text.toString().toInt()

            intent=Intent(this,Activity2::class.java)
            intent.putExtra("Nim",Data_nim)
            intent.putExtra("Nama",Data_nama)
            intent.putExtra("Nilai",Data_nilai)
            startActivity(intent)
        }
    }
}
