package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class other extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        ListView lv;
        String[] position={"Carrot Cake","Dragon Fire Wings","Meat Lovers Pizza ","Chocolate Nero Cookies",
                "Butter Scotch Cookies",
                "Date And Pistachio Muffin","Jalapeno Cheese Fingers",
                "Strawberry Jam Shortbread Biscuit",
                "Restaurant Style Fried Chicken","Roasted Chicken Masala","Chatpati Aloo Chaat"
                ,"Chocolate Fudge Cookies","Paapdi Chaat","Chilli Chicken","Homemade Chicken Sandwich",

                "Dal Kachori","Sticky Tamarind Chicken Wings ","Vegetable Patties","Coconut Laddu(Balls)"
        ,"Mutton Cutlets"};


        lv=(ListView) findViewById(R.id.listview5);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,position);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intent=new Intent(other.this,o1.class);
                    startActivity(intent);

                }
                if (i==1){
                    Intent intent=new Intent(other.this,o2.class);
                    startActivity(intent);

                }
                if (i==2){
                    Intent intent=new Intent(other.this,o3.class);
                    startActivity(intent);

                }
                if (i==3){
                    Intent intent=new Intent(other.this,o4.class);
                    startActivity(intent);

                }
                if (i==4){
                    Intent intent=new Intent(other.this,o5.class);
                    startActivity(intent);

                }
                if (i==5){
                    Intent intent=new Intent(other.this,o6.class);
                    startActivity(intent);

                }
                if (i==6){
                    Intent intent=new Intent(other.this,o7.class);
                    startActivity(intent);

                }
                if (i==7){
                    Intent intent=new Intent(other.this,o8.class);
                    startActivity(intent);

                }
                if (i==8){
                    Intent intent=new Intent(other.this,o9.class);
                    startActivity(intent);

                }
                if (i==9){
                    Intent intent=new Intent(other.this,o10.class);
                    startActivity(intent);

                }
                if (i==10){
                    Intent intent=new Intent(other.this,o11.class);
                    startActivity(intent);

                }
                if (i==11){
                    Intent intent=new Intent(other.this,o12.class);
                    startActivity(intent);

                }
                if (i==12){
                    Intent intent=new Intent(other.this,o13.class);
                    startActivity(intent);

                }
                if (i==13){
                    Intent intent=new Intent(other.this,o14.class);
                    startActivity(intent);

                }
                if (i==14){
                    Intent intent=new Intent(other.this,o15.class);
                    startActivity(intent);

                }
                if (i==15){
                    Intent intent=new Intent(other.this,o16.class);
                    startActivity(intent);

                }
                if (i==16){
                    Intent intent=new Intent(other.this,o17.class);
                    startActivity(intent);

                }
                if (i==17){
                    Intent intent=new Intent(other.this,o18.class);
                    startActivity(intent);

                }
                if (i==18){
                    Intent intent=new Intent(other.this,o19.class);
                    startActivity(intent);

                }
                if (i==19){
                    Intent intent=new Intent(other.this,o20.class);
                    startActivity(intent);

                }

            }
        });
    }
}
