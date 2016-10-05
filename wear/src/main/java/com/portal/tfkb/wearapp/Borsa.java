package com.portal.tfkb.wearapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Serhan on 2.9.2016.
 */
public class Borsa  extends Activity{
    String sehir[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.borsa);
        Button yatırım_fonları,istanbul_altin_borsa,bist_endex,uluslararası_endex;
        yatırım_fonları=(Button) findViewById(R.id.btnYatırımFon);
        istanbul_altin_borsa=(Button) findViewById(R.id.btnIstanbuAltınlBorsa);
        bist_endex=(Button) findViewById(R.id.btnBıstEndex);
        uluslararası_endex=(Button) findViewById(R.id.btnUluslararasıEndex);
        yatırım_fonları.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        istanbul_altin_borsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bist_endex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        uluslararası_endex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
