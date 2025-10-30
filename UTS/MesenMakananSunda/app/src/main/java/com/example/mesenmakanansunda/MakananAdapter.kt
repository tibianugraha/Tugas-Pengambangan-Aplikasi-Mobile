package com.example.mesenmakanansunda.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mesenmakanansunda.DetailActivity
import com.example.mesenmakanansunda.R
import com.example.mesenmakanansunda.model.Makanan


class MakananAdapter(private val context: Context, private val list: List<Makanan>) :
    RecyclerView.Adapter<MakananAdapter.MakananViewHolder>() {

        inner class MakananViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val imgMakanan: ImageView = itemView.findViewById(R.id.imgMakanan)
            val tvNama: TextView = itemView.findViewById(R.id.txtNama)
            val tvHarga: TextView = itemView.findViewById(R.id.txtHarga)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakananViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.item_makanan, parent, false)

        return MakananViewHolder(view)
    }


    override fun onBindViewHolder(holder: MakananViewHolder, position: Int) {
        val makanan = list[position]

        holder.tvNama.text = makanan.nama
        holder.tvHarga.text = makanan.harga

        Glide.with(context).load(makanan.gambar).into(holder.imgMakanan)

        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)

            intent.putExtra("nama", makanan.nama)
            intent.putExtra("harga", makanan.harga)
            intent.putExtra("deskripsi", makanan.deskripsi)
            intent.putExtra("gambar", makanan.gambar)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = list.size
}
