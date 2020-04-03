package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class c6 extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c6);


        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/Crispy-Honey-Chilli-Potatoes-1.jpg?alt=media&token=8d80f304-944a-4bbb-9251-fa6d047f7898";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
