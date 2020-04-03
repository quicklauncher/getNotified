package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class c4 extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c4);


        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/veg-hakka-noodles-recipe-with-step-by-step-instructions.jpg?alt=media&token=284c1402-a1b7-480e-bb5a-14cad8c2d354";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
