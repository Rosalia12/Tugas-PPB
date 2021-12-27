package com.example.simplenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edtusername;
    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtusername= findViewById(R.id.edtusername);
        pref=this.getSharedPreferences(getString(R.string.shared_key), Context.MODE_PRIVATE);
        checkLogin();
    }
    public void checkLogin(){
        String username=pref.getString(getString(R.string.username_key),"");
        if(username.length()>3){
            toMain();
        }
    }
    public void toMain(){
        Intent it=new Intent(this,MainActivity.class);
        it.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(it);
    }
    public void Login(View v){
        String username=edtusername.getText().toString();
        if (username.length()>3){
            pref.edit().putString(getString(R.string.username_key),username).apply();
            toMain();
        }else
            Toast.makeText(this, "username harus lebih dari 3", Toast.LENGTH_LONG).show();
    }
}