package com.example.simplenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView txtjudul,txtcontent;
    SharedPreferences pref;
    Gson gson;
    ArrayList<Notes>notelist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtjudul=findViewById(R.id.TxtJudul);
        txtcontent=findViewById(R.id.txtShowNotes);

        pref= this.getSharedPreferences(getString(R.string.shared_key), Context.MODE_PRIVATE);
        txtjudul.setText("Catatan:"+pref.getString(getString(R.string.username_key),"-"));
        gson=new GsonBuilder().create();
    }

    @Override
    protected void onResume() {
        super.onResume();
        String strListNotes=pref.getString(getString(R.string.Notes_key),"[]");
        notelist=gson.fromJson(strListNotes,new TypeToken<ArrayList<Notes>>(){}.getType());

        String contentTeks= "";
        for(Notes notes:notelist){
            contentTeks += notes.toString()+'\n';
        }
        txtcontent.setText(contentTeks);

    }

    public void Logout(View v){
        pref.edit().clear().apply();
        Intent it=new Intent(this,LoginActivity.class);
        it.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(it);
    }
    public void addnotes(View v){
        Intent it= new Intent(this,NewNotesActivity.class);
        startActivity(it);
    }
}