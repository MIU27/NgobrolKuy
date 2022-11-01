package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EmailActivity extends AppCompatActivity {
    CardView Kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Kembali=findViewById(R.id.kembali);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        Kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(EmailActivity.this, LoginActivity.class);
                startActivity(kembali);
            }
        });
    }
}