package com.example.tourpekanbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivityWisata extends AppCompatActivity {
    ImageView imageviewwisata;
    TextView teksviewnamawisata,teksviewinfowisata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);
        imageviewwisata=findViewById(R.id.imageViewfotowisata);
        teksviewnamawisata=findViewById(R.id.textViewnamawisata);
        teksviewinfowisata=findViewById(R.id.textViewinfowisata);
        getIncomingExtra();
    }
    private void getIncomingExtra(){
        if(getIntent().hasExtra("foto_hotel") && getIntent().hasExtra("nama_hotel") && getIntent().hasExtra("info_hotel")) {
            String fotowisata= getIntent().getStringExtra("foto_wisata");
            String namawisata=getIntent().getStringExtra("nama_wisata");
            String infowisata=getIntent().getStringExtra("info_wisata");

            setDataActivity(fotowisata,namawisata,infowisata);
        }
    }

    private void setDataActivity(String fotowisata, String namawisata, String infowisata){
        Glide.with(this).asBitmap().load(fotowisata).into(imageviewwisata);

        teksviewnamawisata.setText(namawisata);

        teksviewinfowisata.setText(infowisata);

    }
}