package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Muton_Nehari extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muton__nehari);
        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/2018-03-16-07-43-25-45TGb.jpg?alt=media&token=ab356c7e-22c7-4801-89fe-e83cb0f808f7https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/nehari.jpg?alt=media&token=fd49fff9-7b33-4226-8936-a0ff4be69f41";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
