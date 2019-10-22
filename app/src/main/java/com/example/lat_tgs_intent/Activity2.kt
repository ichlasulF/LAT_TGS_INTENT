package com.example.lat_tgs_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val intent = intent
        val Data_nim = intent.getStringExtra("Nim")
        val Data_nama = intent.getStringExtra("Nama")
        val Data_nilai = intent.getIntExtra("Nilai",0)

        val ket:String

        if (Data_nilai>=80){
            ket="A"
        }
        else if(Data_nilai>=60){
            ket="B"
        }
        else if(Data_nilai>=40){
            ket="C"
        }
        else if(Data_nilai>=20){
            ket="D"
        }
        else{
            ket="E"
        }

        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text = "Nim : "+Data_nim+"\nNama: "+Data_nama+"\nNilai: "+Data_nilai+"\nKeterangan : "+ket
    }
}