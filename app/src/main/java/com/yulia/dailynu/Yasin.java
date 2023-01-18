package com.yulia.dailynu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Yasin extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yasin);
        getSupportActionBar().setTitle("Pilihan Bacaan");
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }
    public void tawassul(View view) {
        Intent intent = new Intent(Yasin.this, Tawassul.class);
        startActivity(intent);
    }

    public void suratyasin(View view) {
        Intent intent = new Intent(Yasin.this, SuratYasin.class);
        startActivity(intent);
    }


    public void Doayasin(View view) {
        Intent intent = new Intent(Yasin.this, DoaYasin.class);
        startActivity(intent);
    }
}