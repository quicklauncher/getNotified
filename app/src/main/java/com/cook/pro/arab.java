package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class arab extends AppCompatActivity {
    ListView lv;
    String[] position={"Arabic Chicken Sajji","Arabic Mutton Stew","Arabic Shahi Tukray",
            "Arabic Stuffed Paratha",
            "Arabic Sheer Khurma","Arabic Rice","Ruz Bukhari (Arabic Rice Dish)",
            "Umm-e-Ali (Bread Pudding)",
            "Mutabbaq (Arabic Paratha)",
            "Khoshaf (Arabic Drink)","Shish Taouk (Kabab)",
            "Arabic Stiffed Paratha","Verde Arabic Salad",

            "Arabic Peanuts","Arabic Chicken with Rice","Kabsa","Qatayf (Arabic Desert)",
            "Arabic Saloona","Arabic Coffee (The Saudi Way)","Brownie Batter Hummus"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arab);
        lv=(ListView) findViewById(R.id.listview2);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,position);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intent=new Intent(arab.this,a1.class);
                    startActivity(intent);

                }
                if (i==1){
                    Intent intent=new Intent(arab.this,a2.class);
                    startActivity(intent);

                }
                if (i==2){
                    Intent intent=new Intent(arab.this,a3.class);
                    startActivity(intent);

                }
                if (i==3){
                    Intent intent=new Intent(arab.this,a4.class);
                    startActivity(intent);

                }
                if (i==4){
                    Intent intent=new Intent(arab.this,a5.class);
                    startActivity(intent);

                }
                if (i==5){
                    Intent intent=new Intent(arab.this,a6.class);
                    startActivity(intent);

                }
                if (i==6){
                    Intent intent=new Intent(arab.this,a7.class);
                    startActivity(intent);

                }
                if (i==7){
                    Intent intent=new Intent(arab.this,a8.class);
                    startActivity(intent);

                }
                if (i==8){
                    Intent intent=new Intent(arab.this,a9.class);
                    startActivity(intent);

                }
                if (i==9){
                    Intent intent=new Intent(arab.this,a10.class);
                    startActivity(intent);

                }
                if (i==10){
                    Intent intent=new Intent(arab.this,a11.class);
                    startActivity(intent);

                }
                if (i==11){
                    Intent intent=new Intent(arab.this,a12.class);
                    startActivity(intent);

                }
                if (i==12){
                    Intent intent=new Intent(arab.this,a13.class);
                    startActivity(intent);

                }
                if (i==13){
                    Intent intent=new Intent(arab.this,a14.class);
                    startActivity(intent);

                }
                if (i==14){
                    Intent intent=new Intent(arab.this,a15.class);
                    startActivity(intent);

                }
                if (i==15){
                    Intent intent=new Intent(arab.this,a16.class);
                    startActivity(intent);

                }
                if (i==16){
                    Intent intent=new Intent(arab.this,a17.class);
                    startActivity(intent);

                }
                if (i==17){
                    Intent intent=new Intent(arab.this,a18.class);
                    startActivity(intent);

                }
                if (i==18){
                    Intent intent=new Intent(arab.this,a19.class);
                    startActivity(intent);

                }
                if (i==19){
                    Intent intent=new Intent(arab.this,a20.class);
                    startActivity(intent);

                }

            }
        });
    }
}
