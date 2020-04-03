package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class t18 extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t18);

        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/rost.jpg?alt=media&token=0c21f660-77ea-4b2c-95dd-0ea01674329dhttps://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/rost.jpg?alt=media&token=0c21f660-77ea-4b2c-95dd-0ea01674329d";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
