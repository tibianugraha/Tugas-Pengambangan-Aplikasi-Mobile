package com.example.mesenmakanansunda

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        val tvConfirm = findViewById<TextView>(R.id.tvConfirm)
        val nama = intent.getStringExtra("nama")
        val harga = intent.getStringExtra("harga")
        val alamat = intent.getStringExtra("alamat")

        tvConfirm.text = "Pesanan Anda:\n\nMakanan: $nama\nHarga: $harga\nDikirim ke: $alamat\n\nTerima kasih sudah memesan!"
    }
}
