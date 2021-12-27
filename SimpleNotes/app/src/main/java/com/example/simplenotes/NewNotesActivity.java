package com.example.simplenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class NewNotesActivity extends AppCompatActivity {
    SharedPreferences pref;
    Gson gson;
    ArrayList<Notes>noteslist;
    EditText edtjudul,edtcatatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_notes);
        pref=this.getSharedPreferences(getString(R.string.shared_key), Context.MODE_PRIVATE);
        gson= new GsonBuilder().create();

        edtjudul=findViewById(R.id.edtJudul);
        edtcatatan=findViewById(R.id.edtcontet);
    }
    public void saveNotes(View v){
        String strListNotes=pref.getString(getString(R.string.Notes_key),"[]");
        noteslist=gson.fromJson(strListNotes,new TypeToken<ArrayList<Notes>>(){}.getType());
        if(noteslist==null) noteslist= new ArrayList<>();
        noteslist.add(new Notes(edtjudul.getText().toString(),edtcatatan.getText().toString()));

        strListNotes= gson.toJson(noteslist);
        pref.edit().putString(getString(R.string.Notes_key),strListNotes).apply();

        finish();

    }

    public void cancel(View v){
        finish();
    }
}