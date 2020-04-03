package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class a3 extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);


        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/0a1cb2bd267360d7abdfecf38bbd6a13--pakistani-desserts-pakistani-recipes.jpg?alt=media&token=d1dc1518-3e4d-49d3-85a8-51c275f6abdd";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
