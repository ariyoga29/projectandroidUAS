package com.example.musclely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BeliActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edNama;
    EditText edAlamat;
    EditText edJumlah;
    Button btnLanjut;
    Button btnKonfirmasi;
    Button btnMain;
    TextView tvNama;
    TextView tvAlamat;
    TextView tvJumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beli);

        edNama = findViewById(R.id.ed_nama);
        edAlamat = findViewById(R.id.ed_alamat);
        edJumlah = findViewById(R.id.ed_jumlah);
        btnLanjut = findViewById(R.id.btn_lanjut);
        btnKonfirmasi = findViewById(R.id.btn_konfirmasi);
        btnMain = findViewById(R.id.btn_kembali);
        tvNama = findViewById(R.id.tv_penerima);
        tvAlamat = findViewById(R.id.tv_alamat);
        tvJumlah = findViewById(R.id.tv_jumlah);

        btnLanjut.setOnClickListener(this);
        btnKonfirmasi.setOnClickListener(this);
        btnMain.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_lanjut:
                EditText simpanNama = (EditText) findViewById(R.id.ed_nama);
                String nama = simpanNama.getText().toString();
                tvNama.setText(String.valueOf(nama));

                EditText simpanAlamat = (EditText) findViewById(R.id.ed_alamat);
                String alamat = simpanAlamat.getText().toString();
                tvAlamat.setText(String.valueOf(alamat));

                EditText simpanJumlah = (EditText) findViewById(R.id.ed_jumlah);
                String jumlah = simpanJumlah.getText().toString();
                tvJumlah.setText(String.valueOf(jumlah));
                break;
            case R.id.btn_konfirmasi:
                Intent pindahBayar = new Intent(BeliActivity.this, BayarActivity.class);
                startActivity(pindahBayar);
                break;
            case R.id.btn_kembali:
                Intent pindahMain = new Intent(BeliActivity.this, MainActivity.class);
                startActivity(pindahMain);
                break;
        }
    }
}
