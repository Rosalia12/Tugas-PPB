package com.example.tourpekanbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivityVihara extends AppCompatActivity {
    ImageView imageviewtempatibadah;
    TextView teksviewnamatempatibadah,teksviewinfotempatibadah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_vihara);
        imageviewtempatibadah=findViewById(R.id.imageViewfotoibadah);
        teksviewnamatempatibadah=findViewById(R.id.textViewnamaTempatIbadah);
        teksviewinfotempatibadah=findViewById(R.id.textViewinfoTempatIbadah);
        getExtra();
    }
    private void getExtra(){
        if(getIntent().hasExtra("foto_tempatibadah") && getIntent().hasExtra("nama_tempatibadah") && getIntent().hasExtra("info_tempatibadah")) {
            String fototempatibadah= getIntent().getStringExtra("foto_tempatibadah");
            String namatempatibadah=getIntent().getStringExtra("nama_tempatibadah");
            String infotempatibadah=getIntent().getStringExtra("info_tempatibadah");
            setDataActivity(fototempatibadah,namatempatibadah,infotempatibadah);
        }
    }

    private void setDataActivity(String fototempatibadah, String namatempatibadah, String infotempatibadah) {
        Glide.with(this).asBitmap().load(fototempatibadah).into(imageviewtempatibadah);

        teksviewnamatempatibadah.setText(namatempatibadah);

        teksviewinfotempatibadah.setText(infotempatibadah);
    }
}