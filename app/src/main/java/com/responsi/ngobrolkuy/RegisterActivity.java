package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {
    CardView Regis2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Regis2 = findViewById(R.id.register2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Regis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regis = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(regis);
            }
        });
    }
}