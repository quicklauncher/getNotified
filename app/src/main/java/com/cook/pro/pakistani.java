package com.cook.pro;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class pakistani extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakistani);

        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/Haleem(2).jpg?alt=media&token=cb7b90cd-e611-48da-9237-196964b950e8";
        Glide.with(getApplicationContext()).load(url).into(imageView);


    }
}
