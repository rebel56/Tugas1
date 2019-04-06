package com.example.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView txtHello;
    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        txtHello = (TextView) findViewById(R.id.textView15);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        txtHello.setText("Beres! Sekarang "+ nama + "\n" +
                "udah bisa ngecek\n" +
                "penggunaan HP "+ nama + "\n" +
                "tiap hari buat bantu "+ nama + "\n" +
                "ngatur waktu :) ");
    }

    public void clickexit (View V) {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}