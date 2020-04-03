package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class a19 extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a19);

        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/a-woman-is-pouring-turkish-coffee-in-to-a-vintage-turkish-coffee-cup-600103930-5825fe325f9b58d5b129c1a3.jpg?alt=media&token=54ce0fae-187a-4c1b-8d35-d11ddced2740";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
