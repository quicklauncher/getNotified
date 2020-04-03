package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class china extends AppCompatActivity {

    ListView lv;
    String[] position = {"Stuffed Eggplant with Schezwan Sauce", "Almond and Chicken Momos",
            "Peri Peri Chicken Satay", "Veg Hakka Noodles", "Veg Fried Rice",
            "Honey Chilli Potato", "Garlic Soya Chicken", "Mapo Tofu with Spring Onion and Black Beans",
            "Vegetable Manchow", "Quick Noodles ",
            "Cantonese Chicken Soup", "Stir Fried Tofu with Rice", "Chicken Manchurian",
            "Chilli Fish", "Honey Chilli Potatoes", "Garlic and Egg Fried Rice",
            "Hot and Sour Soup","Chilli Soya Nuggets ","Chinese Salad","Asian BBQ Chicken "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china);


        lv = (ListView) findViewById(R.id.listview4);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, position);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(china.this, c1.class);
                    startActivity(intent);

                }
                if (i == 1) {
                    Intent intent = new Intent(china.this, c2.class);
                    startActivity(intent);

                }
                if (i == 2) {
                    Intent intent = new Intent(china.this, c3.class);
                    startActivity(intent);

                }
                if (i == 3) {
                    Intent intent = new Intent(china.this, c4.class);
                    startActivity(intent);

                }
                if (i == 4) {
                    Intent intent = new Intent(china.this, c5.class);
                    startActivity(intent);

                }
                if (i == 5) {
                    Intent intent = new Intent(china.this, c6.class);
                    startActivity(intent);

                }
                if (i == 6) {
                    Intent intent = new Intent(china.this, c7.class);
                    startActivity(intent);

                }
                if (i == 7) {
                    Intent intent = new Intent(china.this, c8.class);
                    startActivity(intent);

                }
                if (i == 8) {
                    Intent intent = new Intent(china.this, c9.class);
                    startActivity(intent);

                }
                if (i == 9) {
                    Intent intent = new Intent(china.this, c10.class);
                    startActivity(intent);

                }
                if (i == 10) {
                    Intent intent = new Intent(china.this, c11.class);
                    startActivity(intent);

                }
                if (i == 11) {
                    Intent intent = new Intent(china.this, c12.class);
                    startActivity(intent);

                }
                if (i == 12) {
                    Intent intent = new Intent(china.this, c13.class);
                    startActivity(intent);

                }
                if (i == 13) {
                    Intent intent = new Intent(china.this, c14.class);
                    startActivity(intent);

                }
                if (i == 14) {
                    Intent intent = new Intent(china.this, c15.class);
                    startActivity(intent);

                }
                if (i == 15) {
                    Intent intent = new Intent(china.this, c16.class);
                    startActivity(intent);

                }
                if (i == 16) {
                    Intent intent = new Intent(china.this, c17.class);
                    startActivity(intent);

                }
                if (i == 17) {
                    Intent intent = new Intent(china.this, c18.class);
                    startActivity(intent);

                } if (i == 18) {
                    Intent intent = new Intent(china.this, c19.class);
                    startActivity(intent);

                }
                if (i == 19) {
                    Intent intent = new Intent(china.this, c20.class);
                    startActivity(intent);

                }

            }
        });
    }
}


