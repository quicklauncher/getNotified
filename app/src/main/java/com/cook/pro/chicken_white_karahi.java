package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class chicken_white_karahi extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken_white_karahi);
        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/white%20chiken.jpg?alt=media&token=19fb9d6b-465c-4b38-85c4-47aeeb165d15";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
