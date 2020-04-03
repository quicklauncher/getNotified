package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class indd extends AppCompatActivity {
    ListView lv;
    String[] position={"Malabri Fish Curry","Aamchoori Kareley Recipe","Dahi Aloo Recipe","Achaari Aloo Recipe","Dahi Aur Bhindi Recipe",
            "Malai Ghevar Recipe","Egg Paratha Recipe","Ajwaini Paneer Kofta Curry","Kesari Shrikhand",
            "Thandai Barfi","Handi Paneer","Chicken Gilafi Kebab",
            "Gajar Halwa Tart","Half Roast Chicken ",
            "Murgh Biryani","Haleem Khowsuey","Bajra-Methi Missi Roti","Arbi Kaju Ki Tikki ","Masala Chai","Awadhi Gosht Korma"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indd);

        lv=(ListView) findViewById(R.id.listview1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,position);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intent=new Intent(indd.this,ind1.class);
                    startActivity(intent);

                }
                if (i==1){
                    Intent intent=new Intent(indd.this,ind2.class);
                    startActivity(intent);

                }
                if (i==2){
                    Intent intent=new Intent(indd.this,ind3.class);
                    startActivity(intent);

                }
                if (i==3){
                    Intent intent=new Intent(indd.this,ind4.class);
                    startActivity(intent);

                }
                if (i==4){
                    Intent intent=new Intent(indd.this,ind5.class);
                    startActivity(intent);

                }
                if (i==5){
                    Intent intent=new Intent(indd.this,ind6.class);
                    startActivity(intent);

                }
                if (i==6){
                    Intent intent=new Intent(indd.this,ind7.class);
                    startActivity(intent);

                }
                if (i==7){
                    Intent intent=new Intent(indd.this,ind8.class);
                    startActivity(intent);

                }
                if (i==8){
                    Intent intent=new Intent(indd.this,ind9.class);
                    startActivity(intent);

                }
                if (i==9){
                    Intent intent=new Intent(indd.this,ind10.class);
                    startActivity(intent);

                }
                if (i==10){
                    Intent intent=new Intent(indd.this,ind11.class);
                    startActivity(intent);

                }
                if (i==11){
                    Intent intent=new Intent(indd.this,ind12.class);
                    startActivity(intent);

                }
                if (i==12){
                    Intent intent=new Intent(indd.this,ind13.class);
                    startActivity(intent);

                }
                if (i==13){
                    Intent intent=new Intent(indd.this,ind14.class);
                    startActivity(intent);

                }
                if (i==14){
                    Intent intent=new Intent(indd.this,ind15.class);
                    startActivity(intent);

                }
                if (i==15){
                    Intent intent=new Intent(indd.this,ind16.class);
                    startActivity(intent);

                }
                if (i==16){
                    Intent intent=new Intent(indd.this,ind17.class);
                    startActivity(intent);

                }
                if (i==17){
                    Intent intent=new Intent(indd.this,ind18.class);
                    startActivity(intent);

                }
                if (i==18){
                    Intent intent=new Intent(indd.this,ind19.class);
                    startActivity(intent);

                }
                if (i==19){
                    Intent intent=new Intent(indd.this,ind20.class);
                    startActivity(intent);

                }

            }
        });
    }
}
