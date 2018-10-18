package com.example.alfan.dapurresepibu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ListDetail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_detail);
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String bahan = intent.getStringExtra("bahan");
        String cara = intent.getStringExtra("cara");
        TextView ttitle = findViewById(R.id.title);
        ttitle.setText(title);
        TextView tbahan = findViewById(R.id.bahan);
        tbahan.setText(bahan);
        TextView tcara = findViewById(R.id.cara);
        tcara.setText(cara);
    }
}
