package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Rusian_Salad extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rusian__salad);
        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/russina%20salad.jpg?alt=media&token=b8e7ae3a-fd9c-4f82-b4d5-1305e56f20c2";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
