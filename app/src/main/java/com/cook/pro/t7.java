package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class t7 extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t7);

        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/fals.jpg?alt=media&token=622c3c1b-7fef-4972-b30e-73c98d3ab790";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
