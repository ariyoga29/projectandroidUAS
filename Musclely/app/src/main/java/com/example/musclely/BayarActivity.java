package com.example.musclely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BayarActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayar);

        btnMain = findViewById(R.id.btn_kembali);

        btnMain.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent pindahMain = new Intent(BayarActivity.this, MainActivity.class);
        startActivity(pindahMain);
    }
}
