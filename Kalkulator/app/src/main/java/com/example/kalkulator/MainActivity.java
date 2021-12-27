package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edt1,edt2,edthasil;
    Button btnhasil;
    RadioButton rkali,rbagi,rtambah,rkurang;
    String pilihan="tambah";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=(EditText) findViewById(R.id.edt1);
        edt2=(EditText) findViewById(R.id.edt2);
        btnhasil=(Button) findViewById(R.id.btnHasil);
        rkali=(RadioButton) findViewById(R.id.rkali);
        rbagi=(RadioButton) findViewById(R.id.rbagi);
        rkurang=(RadioButton) findViewById(R.id.rkurang);
        rtambah=(RadioButton) findViewById(R.id.rtambsh);
        edthasil=(EditText) findViewById(R.id.edthasil);

      btnhasil.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if(rkali.isChecked()){pilihan="Kali";}
              else if (rbagi.isChecked()){pilihan="Bagi";}
              else if(rtambah.isChecked()){pilihan="Tambah";}
              else if(rkurang.isChecked()){pilihan="Kurang";}
              String b1=edt1.getText().toString();
              String b2=edt2.getText().toString();
              double db1=Double.parseDouble(b1);
              double db2=Double.parseDouble(b2);
              double h=0;
              if(pilihan.equalsIgnoreCase("kali")){
                    h=db1 *db2;
              }
              else if(pilihan.equalsIgnoreCase("Bagi")){
                  h=db1/db2;
              }
              else if(pilihan.equalsIgnoreCase("Tambah")){
                  h=db1+db2;
              }
              else if(pilihan.equalsIgnoreCase("Kurang")){
                  h=db1-db2;
              }
              String sh=String.valueOf(h);
              edthasil.setText(sh);
          }

      });
    }

}
