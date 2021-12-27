package com.example.tourpekanbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnwisata,btnhotel,btnkuliner,btnibadah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnhotel=(Button)findViewById(R.id.btnhotel);
        btnwisata=(Button) findViewById(R.id.btnwisata);
        btnibadah=(Button) findViewById(R.id.btnibadah);
        btnkuliner=(Button) findViewById(R.id.btnkuliner);

        btnhotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, MainActivityHotel.class);
                startActivity(intent);
            }
        });
        btnwisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, MainActivityWisata.class);
                startActivity(intent);
            }
        });
        btnibadah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, MainActivityTempatIbadah.class);
                startActivity(intent);
            }
        });
        btnkuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, MainActivityKuliner.class);
                startActivity(intent);
            }
        });


    }
}