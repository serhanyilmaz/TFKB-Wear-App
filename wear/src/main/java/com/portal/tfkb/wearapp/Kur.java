package com.portal.tfkb.wearapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by Serhan on 2.9.2016.
 */
public class Kur  extends Activity{
    String sehir[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kur);
        Button tfkb_doviz_kur,serbest_piyasa,tcmb_kur,uluslararası_parite;
        tfkb_doviz_kur=(Button) findViewById(R.id.btnTfkbDovizKur);
        serbest_piyasa=(Button) findViewById(R.id.btnSerbestPiyasa);
        tcmb_kur=(Button) findViewById(R.id.btnTcmbKur);
        uluslararası_parite=(Button) findViewById(R.id.btnUluslararasıParite);
        tfkb_doviz_kur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Kur.this,CurrencyActivity.class);
                startActivity(i);
            }
        });
        serbest_piyasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tcmb_kur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        uluslararası_parite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
