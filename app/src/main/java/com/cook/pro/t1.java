package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class t1 extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t1);


        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/lam.jpg?alt=media&token=ecec377b-9080-4cf9-85df-27d51f1df5e7";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
