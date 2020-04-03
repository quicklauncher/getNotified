package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class turk extends AppCompatActivity {
    ListView lv;
    String[] position={"Spiced lamb & feta gozleme ","Smoked aubergine purée","Slow-roast lamb ",
            "Rose cream & raspberry jellies","Turkish lamb pilau",
            "Smoky chicken skewers","Spicy falafels","Almond and honey pastries with orange cream",
            "Minty lamb flatbreads","Easy hummus","Turkish-style lamb","Walnut, date and honey cake",
            "Grilled lamb with rice salad","Turkish delight vodka","Apricot and Turkish delight",
            "Aubergine and hummus grills","Raspberry and rose trifles",
            "Roast aubergine with goat's cheese & toasted flatbread","Sweet potato salad","Lamb and apricot meatballs"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turk);



        lv=(ListView) findViewById(R.id.listview3);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,position);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intent=new Intent(turk.this,t1.class);
                    startActivity(intent);

                }
                if (i==1){
                    Intent intent=new Intent(turk.this,t2.class);
                    startActivity(intent);

                } if (i==2){
                    Intent intent=new Intent(turk.this,t3.class);
                    startActivity(intent);

                } if (i==3){
                    Intent intent=new Intent(turk.this,t4.class);
                    startActivity(intent);

                }
                if (i==4){
                    Intent intent=new Intent(turk.this,t5.class);
                    startActivity(intent);

                }
                if (i==5){
                    Intent intent=new Intent(turk.this,t6.class);
                    startActivity(intent);

                }
                if (i==6){
                    Intent intent=new Intent(turk.this,t7.class);
                    startActivity(intent);

                }
                if (i==7){
                    Intent intent=new Intent(turk.this,t8.class);
                    startActivity(intent);

                }
                if (i==8){
                    Intent intent=new Intent(turk.this,t9.class);
                    startActivity(intent);

                }
                if (i==9){
                    Intent intent=new Intent(turk.this,t10.class);
                    startActivity(intent);

                }
                if (i==10){
                    Intent intent=new Intent(turk.this,t11.class);
                    startActivity(intent);

                }
                if (i==11){
                    Intent intent=new Intent(turk.this,t12.class);
                    startActivity(intent);

                }
                if (i==12){
                    Intent intent=new Intent(turk.this,t13.class);
                    startActivity(intent);

                }
                if (i==13){
                    Intent intent=new Intent(turk.this,t14.class);
                    startActivity(intent);

                }
                if (i==14){
                    Intent intent=new Intent(turk.this,t15.class);
                    startActivity(intent);

                }
                if (i==15){
                    Intent intent=new Intent(turk.this,t16.class);
                    startActivity(intent);

                }
                if (i==16){
                    Intent intent=new Intent(turk.this,t17.class);
                    startActivity(intent);

                }
                if (i==17){
                    Intent intent=new Intent(turk.this,t18.class);
                    startActivity(intent);

                }
                if (i==18){
                    Intent intent=new Intent(turk.this,t19.class);
                    startActivity(intent);

                }
                if (i==19){
                    Intent intent=new Intent(turk.this,t20.class);
                    startActivity(intent);

                }


            }
        });
    }
}
