package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Khatay_Methay_Aalo extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khatay__methay__aalo);
        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/methy%20aalo.jpg?alt=media&token=b7a2c45a-8b91-466e-b67d-602df53d60cb";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
