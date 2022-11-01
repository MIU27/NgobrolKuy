package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView Regis;
    TextView TV1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Regis = findViewById(R.id.register);
        TV1 = findViewById(R.id.TV1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
        TV1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(LoginActivity.this, LupaActivity.class);
                startActivity(intent2);
            }
        });
    }
}