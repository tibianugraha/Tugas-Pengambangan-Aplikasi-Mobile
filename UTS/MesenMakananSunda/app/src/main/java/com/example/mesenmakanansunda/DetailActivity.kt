package com.example.mesenmakanansunda

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val img = findViewById<ImageView>(R.id.imgDetail)
        val tvNama = findViewById<TextView>(R.id.tvNamaDetail)
        val tvHarga = findViewById<TextView>(R.id.tvHargaDetail)
        val tvDesc = findViewById<TextView>(R.id.tvDescDetail)
        val etAlamat = findViewById<EditText>(R.id.etAlamat)
        val btnOrder = findViewById<Button>(R.id.btnOrder)

        val nama = intent.getStringExtra("nama")
        val harga = intent.getStringExtra("harga")
        val deskripsi = intent.getStringExtra("deskripsi")
        val gambar = intent.getIntExtra("gambar", 0)

        tvNama.text = nama
        tvHarga.text = harga
        tvDesc.text = deskripsi
        img.setImageResource(gambar)

        btnOrder.setOnClickListener {
            val alamat = etAlamat.text.toString()
            val intent = Intent(this, ConfirmActivity::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("harga", harga)
            intent.putExtra("alamat", alamat)
            startActivity(intent)
        }
    }
}
