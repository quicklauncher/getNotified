package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class t5 extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t5);


        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/pilo.jpg?alt=media&token=b0eb1fac-7169-4041-98da-d1a5bc111244";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
