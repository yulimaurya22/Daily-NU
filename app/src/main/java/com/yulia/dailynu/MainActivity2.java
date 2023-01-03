package com.yulia.dailynu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    CardView Tombolsatu;
    CardView Tomboldua;
    CardView Tomboltiga;
    CardView Tombolempat;
    CardView Tombollima;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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
    }
}