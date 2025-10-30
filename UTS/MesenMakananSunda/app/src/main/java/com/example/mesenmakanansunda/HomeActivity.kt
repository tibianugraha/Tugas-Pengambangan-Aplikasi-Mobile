package com.example.mesenmakanansunda

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mesenmakanansunda.adapter.MakananAdapter
import com.example.mesenmakanansunda.model.Makanan

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val recyclerView = findViewById<RecyclerView>(R.id.rvMakanan)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val listMakanan = listOf(
            Makanan("Nasi Liwet", "Rp 25.000", "Nasi gurih khas Sunda dengan lauk ayam dan sambal.", R.drawable.nasi_liwet),
            Makanan("Sayur Asem", "Rp 15.000", "Sayur segar dengan rasa asam pedas.", R.drawable.sayur_asem),
            Makanan("Pepes Ikan", "Rp 20.000", "Ikan berbumbu khas dibungkus daun pisang.", R.drawable.pepes_ikan),
            Makanan("Karedok", "Rp 12.000", "Sayuran segar dengan bumbu kacang khas Sunda.", R.drawable.karedok)
        )

        val adapter = MakananAdapter(this, listMakanan)
        recyclerView.adapter = adapter
    }
}
