package com.yulia.dailynu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Manaqib extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manaqib);

    }

    public void bab1(View view) {
        Intent intent = new Intent(Manaqib.this, Bab1.class);
        startActivity(intent);
    }

    public void bab2(View view) {
        Intent intent = new Intent(Manaqib.this, Bab2.class);
        startActivity(intent);
    }

    public void bab3(View view) {
        Intent intent = new Intent(Manaqib.this, Bab3.class);
        startActivity(intent);
    }

    public void bab4(View view) {
        Intent intent = new Intent(Manaqib.this, Bab4.class);
        startActivity(intent);
    }

    public void bab5(View view) {
        Intent intent = new Intent(Manaqib.this, Bab5.class);
        startActivity(intent);
    }

    public void bab6(View view) {
        Intent intent = new Intent(Manaqib.this, Bab6.class);
        startActivity(intent);
    }

    public void bab7(View view) {
        Intent intent = new Intent(Manaqib.this, Bab7.class);
        startActivity(intent);
    }

    public void bab8(View view) {
        Intent intent = new Intent(Manaqib.this, Bab8.class);
        startActivity(intent);
    }
}