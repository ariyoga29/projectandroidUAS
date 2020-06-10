package com.example.musclely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String nama="namadetail";
    public static final String harga="hargadetail";
    public static final String deskripsi="deskripsi";
    public static final String gambar="NULL";
    public static final String coret="coretdetail";
    public TextView tvnama;
    public TextView tvharga;
    public TextView tvdeskripsi;
    public ImageView ivgambar;
    public TextView tvcoret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvnama= findViewById(R.id.tv_nama);
        tvdeskripsi= findViewById(R.id.tv_deskripsi);
        tvharga = findViewById(R.id.tv_harga);
        ivgambar = findViewById(R.id.iv_gambar);
        tvcoret = findViewById(R.id.tv_coret);

        Button btnMain = findViewById(R.id.btn_kembali);
        Button btnBeli = findViewById(R.id.btn_beli);

        String simpanama = getIntent().getStringExtra(nama);
        String simpandeskripsi = getIntent().getStringExtra(deskripsi);
        String simpanharga = getIntent().getStringExtra(harga);
        String simpangambar = getIntent().getStringExtra(gambar);
        String simpancoret = getIntent().getStringExtra(coret);

        tvnama.setText(simpanama);
        tvharga.setText(simpanharga);
        tvdeskripsi.setText(simpandeskripsi);
        tvcoret.setText(simpancoret);
        Glide
                .with(this)
                .load(simpangambar)
                .centerCrop()
                .into(ivgambar);

        btnMain.setOnClickListener(this);
        btnBeli.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_kembali:
                Intent pindahMain = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(pindahMain);
                break;
            case R.id.btn_beli:
                Intent pindahBeli = new Intent(DetailActivity.this, BeliActivity.class);
                startActivity(pindahBeli);
                break;
        }
    }
}

