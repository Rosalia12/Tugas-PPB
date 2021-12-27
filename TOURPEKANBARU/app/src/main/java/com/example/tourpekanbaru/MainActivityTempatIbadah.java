package com.example.tourpekanbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityTempatIbadah extends AppCompatActivity {
    Button btnkatolik,btnhkbp,btnvihara,btnmasjid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tempat_ibadah);
        btnkatolik=(Button)findViewById(R.id.btnkatolik);
        btnhkbp=(Button) findViewById(R.id.btngrejahkbp);
        btnvihara=(Button) findViewById(R.id.btnvihara);
        btnmasjid=(Button) findViewById(R.id.btnmasjid);

        btnkatolik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivityTempatIbadah.this, MainActivityTempatibadahkatolik.class);
                startActivity(intent);
            }
        });
        btnhkbp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivityTempatIbadah.this, MainActivityTempatIbadahHKBP.class);
                startActivity(intent);
            }
        });
        btnmasjid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivityTempatIbadah.this, MainActivityTempatIbadahMasjid.class);
                startActivity(intent);
            }
        });
        btnvihara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivityTempatIbadah.this, MainActivityTempatIbadahVihara.class);
                startActivity(intent);
            }
        });
    }
}