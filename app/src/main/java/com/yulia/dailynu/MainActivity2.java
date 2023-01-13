package com.yulia.dailynu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    CardView Tombolsatu;
    CardView Tomboldua;
    CardView Tomboltiga;
    CardView Tombolempat;
    CardView Tombollima;
    CardView Tombolenam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("Menu Home");

        Tombolsatu = findViewById(R.id.cdManaqib);
        Tombolsatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(MainActivity2.this, Manaqib.class);
                startActivity(open);
            }
        });
        Tomboldua = findViewById(R.id.cdIstighatsah);
        Tomboldua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(MainActivity2.this, Istighatsah.class);
                startActivity(open);
            }
        });
        Tomboltiga = findViewById(R.id.cdTahlil);
        Tomboltiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(MainActivity2.this, Tahlil.class);
                startActivity(open);
            }
        });
        Tombolempat = findViewById(R.id.cdDiba);
        Tombolempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(MainActivity2.this, Diba.class);
                startActivity(open);
            }
        });
        Tombollima = findViewById(R.id.cdTasbih);
        Tombollima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(MainActivity2.this, Tasbih.class);
                startActivity(open);
            }
        });
        Tombolenam = findViewById(R.id.cdYasin);
        Tombolenam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(MainActivity2.this, Yasin.class);
                startActivity(open);
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialog =new AlertDialog.Builder(MainActivity2.this);
        alertDialog.setTitle("Exit App");
        alertDialog.setMessage("Klik YA untuk Keluar");
        alertDialog.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finishAffinity();
            }
        });
        alertDialog.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();

            }
        });
        alertDialog.show();
    }
}