package com.cook.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Pakki extends AppCompatActivity {
    ListView lv;
    String[] position={"Haleem","Hareesa","Loaded Cheese Fries Karahai","Murgh Mussalam","Kofta Pulao"
            ,"Lahori Murgh Cholay",
            "Shawarma Homemade","Russian Salad","Qeema Bharay Karaylay","White Chicken","Chicken Pakora","Mutton Biryani","Mutton Rosh"
            ,"Beef Qorma","Aaloo Kabab Naan","Macroni Chaat","Tikka Pulao","Chicken Shashlik",
            "Qeema Biryani","Khattay Methay Aalo","Afghani Pulao","Chicken  Qeema Paratha","Imli ki Chutny","Mutton Nehari","Smoked Kaleji"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakki);






        lv=(ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,position);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intent=new Intent(Pakki.this,pakistani.class);
                    startActivity(intent);

                }
                if (i==1){
                    Intent intent=new Intent(Pakki.this,hareesa.class);
                    startActivity(intent);

                }
                if (i==2){
                    Intent intent=new Intent(Pakki.this,chicken_white_karahi.class);
                    startActivity(intent);

                } if (i==3){
                    Intent intent=new Intent(Pakki.this,Murgh_Mussalam.class);
                    startActivity(intent);

                }
                if (i==4){
                    Intent intent=new Intent(Pakki.this,testm.class);
                    startActivity(intent);

                }
                if (i==5){
                    Intent intent=new Intent(Pakki.this,lahori_mrg_cholay.class);
                    startActivity(intent);

                }
                if (i==6){
                    Intent intent=new Intent(Pakki.this,Homemade_Shawarma.class);
                    startActivity(intent);

                }
                if (i==7){
                    Intent intent=new Intent(Pakki.this,Rusian_Salad.class);
                    startActivity(intent);

                }
                if (i==8){
                    Intent intent=new Intent(Pakki.this,keema_karaylay.class);
                    startActivity(intent);

                }
                if (i==9){
                    Intent intent=new Intent(Pakki.this,white_chick.class);
                    startActivity(intent);

                }
                if (i==10){
                    Intent intent=new Intent(Pakki.this,Chick_Pakora.class);
                    startActivity(intent);

                }
                if (i==11){
                    Intent intent=new Intent(Pakki.this,Mutton_Bir.class);
                    startActivity(intent);

                }
                if (i==12){
                    Intent intent=new Intent(Pakki.this,muton_Rosh.class);
                    startActivity(intent);

                }
                if (i==13){
                    Intent intent=new Intent(Pakki.this,Bef_Qorma.class);
                    startActivity(intent);

                }
                if (i==14){
                    Intent intent=new Intent(Pakki.this,Aalo_Kabab_Naan.class);
                    startActivity(intent);

                }
                if (i==15){
                    Intent intent=new Intent(Pakki.this,Macroni_Chat.class);
                    startActivity(intent);

                }
                if (i==16){
                    Intent intent=new Intent(Pakki.this,Tika_Pulao.class);
                    startActivity(intent);

                }
                if (i==17){
                    Intent intent=new Intent(Pakki.this,Chick_Shashlik.class);
                    startActivity(intent);

                }
                if (i==18){
                    Intent intent=new Intent(Pakki.this,Keema_Biryani.class);
                    startActivity(intent);

                }
                if (i==19){
                    Intent intent=new Intent(Pakki.this,Khatay_Methay_Aalo.class);
                    startActivity(intent);

                }
                if (i==20){
                    Intent intent=new Intent(Pakki.this,Afghani_Palao.class);
                    startActivity(intent);

                }
                if (i==21){
                    Intent intent=new Intent(Pakki.this,Chicken_Keema_Paratha.class);
                    startActivity(intent);

                }
                if (i==22){
                    Intent intent=new Intent(Pakki.this,Imli_Ke_Chtney.class);
                    startActivity(intent);

                }
                if (i==23){
                    Intent intent=new Intent(Pakki.this,Muton_Nehari.class);
                    startActivity(intent);

                }
                if (i==24){
                    Intent intent=new Intent(Pakki.this,Smoked_Kalyji.class);
                    startActivity(intent);

                }



            }
        });



            }

}
