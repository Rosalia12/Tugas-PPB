package com.example.tourpekanbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivityHotel extends AppCompatActivity {
    ImageView imageviewfotohotel;
    TextView teksviewnamahotel,teksviewinfohotel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_detailhotel);
        imageviewfotohotel=findViewById(R.id.imageViewfotohotel);
        teksviewnamahotel=findViewById(R.id.textViewnamahotel);
        teksviewinfohotel=findViewById(R.id.textViewinfohotel);
        getIncomingExtra();
    }
    private void getIncomingExtra(){
        if(getIntent().hasExtra("foto_hotel") && getIntent().hasExtra("nama_hotel") && getIntent().hasExtra("info_hotel")) {
            String fotohotel= getIntent().getStringExtra("foto_hotel");
            String namahotel=getIntent().getStringExtra("nama_hotel");
            String infohotel=getIntent().getStringExtra("info_hotel");

            setDataActivity(fotohotel,namahotel,infohotel);
        }
    }

    private void setDataActivity(String fotohotel, String namahotel, String infohotel){
        Glide.with(this).asBitmap().load(fotohotel).into(imageviewfotohotel);

        teksviewnamahotel.setText(namahotel);

        teksviewinfohotel.setText(infohotel);

    }
}