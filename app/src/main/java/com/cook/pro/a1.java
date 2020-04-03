package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class a1 extends AppCompatActivity {
    private Button idbtn;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);

        idbtn=(Button)findViewById(R.id.idbtn);

        idbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(a1.this,OrderDetails.class);
                startActivity(intent);
            }
        });

        imageView=findViewById(R.id.image);
        String url="https://firebasestorage.googleapis.com/v0/b/procook-62704.appspot.com/o/2018-03-16-07-43-25-45TGb.jpg?alt=media&token=ab356c7e-22c7-4801-89fe-e83cb0f808f7";
        Glide.with(getApplicationContext()).load(url).into(imageView);
    }
}
