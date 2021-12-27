package com.example.tourpekanbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivityKuliner extends AppCompatActivity {
    ImageView imageviewfotokuliner;
    TextView teksviewnamakuliner,teksviewinfokuliner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kuliner);
        imageviewfotokuliner=findViewById(R.id.imageViewfotokuliner);
        teksviewnamakuliner=findViewById(R.id.textViewnamakuliner);
        teksviewinfokuliner=findViewById(R.id.textViewinfokuliner);
        getIncomingExtra();
    }
    private void getIncomingExtra(){
        if(getIntent().hasExtra("foto_kuliner") && getIntent().hasExtra("nama_kuliner") && getIntent().hasExtra("info_kuliner")) {
            String fotokuliner= getIntent().getStringExtra("foto_kuliner");
            String namakuliner=getIntent().getStringExtra("nama_kuliner");
            String infokuliner=getIntent().getStringExtra("info_kuliner");

            setDataActivity(fotokuliner,namakuliner,infokuliner);
        }
    }

    private void setDataActivity(String fotokuliner, String namakuliner, String infokuliner){
        Glide.with(this).asBitmap().load(fotokuliner).into(imageviewfotokuliner);

        teksviewnamakuliner.setText(namakuliner);

        teksviewinfokuliner.setText(infokuliner);

    }
}