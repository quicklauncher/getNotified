package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class c1 extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1);

        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/stuffed-eggppant-with-garlic-sauce.jpg?alt=media&token=7356415c-e89c-41af-a7b5-a6f12a8b5ce8";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
