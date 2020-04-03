package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Aalo_Kabab_Naan extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aalo__kabab__naan);
        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/alo%20kababk%20nan.jpg?alt=media&token=56901a07-2e45-4dd3-b334-bcb7a0c772da";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
