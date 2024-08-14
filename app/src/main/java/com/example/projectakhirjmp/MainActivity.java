package com.example.projectakhirjmp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnlistdata,btninputdata,btninformasi,btnkeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlistdata = findViewById(R.id.buttonList);
        btninputdata = findViewById(R.id.buttonInput);
        btninformasi = findViewById(R.id.buttonInformasi);
        btnkeluar = findViewById(R.id.buttonKeluar);

        btnlistdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ListData.class);
                startActivity(intent);
            }
        });
        btnkeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Login.class);
                startActivity(intent);
                finish();
            }
        });
        btninputdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,InputData.class);
                startActivity(intent);
            }
        });
        btninformasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Informasi.class);
                startActivity(intent);
            }
        });
    }
}