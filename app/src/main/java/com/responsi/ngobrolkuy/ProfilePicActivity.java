package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfilePicActivity extends AppCompatActivity {
    private CircleImageView image;
    private static final int GALLERY_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_pic);
        image=findViewById(R.id.profilePic);

    }
}