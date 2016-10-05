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
public class HisseSenedi  extends Activity{
    String sehir[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hisse_senedi);
        Button artan,azalan,islem_goren,hisse_senedi;
        artan=(Button) findViewById(R.id.btnArtan);
        azalan=(Button) findViewById(R.id.btnAzalan);
        islem_goren=(Button) findViewById(R.id.btnIslem);
        hisse_senedi=(Button) findViewById(R.id.btnSenet);
        artan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        azalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        islem_goren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        hisse_senedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
