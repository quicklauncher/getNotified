package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Bef_Qorma extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bef__qorma);
        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/beef%20qeemsa.jpg?alt=media&token=9f000c07-4e9a-4afe-bed7-e5d5948783b7";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
