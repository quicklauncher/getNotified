package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class a11 extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a11);

        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/Shish-Tawook-Lebanese-Chicken-Skewers-6932.21.jpg?alt=media&token=89134558-9897-449a-9c17-fadfecf47fa3";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
