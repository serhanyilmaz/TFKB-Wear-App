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
public class Anasayfa  extends Activity{
    String sehir[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);
        Button hesabim,portal,sube,atm;
        hesabim=(Button) findViewById(R.id.btnHesabım);
        portal=(Button) findViewById(R.id.btnFinansPortalı);
        sube=(Button) findViewById(R.id.btnBranch);
        atm=(Button) findViewById(R.id.btnAtm);
        hesabim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Anasayfa.this,Account.class);
                startActivity(i);
            }
        });
        portal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Anasayfa.this,Finance.class);
                startActivity(i);
            }
        });
        sube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Anasayfa.this,Branch.class);
                startActivity(i);
            }
        });
        atm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
