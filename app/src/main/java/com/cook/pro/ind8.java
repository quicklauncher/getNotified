package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ind8 extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ind8);

        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/paneer.jpg?alt=media&token=01afa5e2-2044-4f16-a487-63c1a0584b68";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
