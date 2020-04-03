package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class c18 extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c18);


        imageView=findViewById(R.id.image);
        String url="Hot and Sour Soup";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
