package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LupaActivity extends AppCompatActivity {
    CardView Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Submit =findViewById(R.id.submit);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent submit = new Intent(LupaActivity.this, EmailActivity.class);
                startActivity(submit);
            }
        });
    }
}