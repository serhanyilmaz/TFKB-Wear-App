package com.portal.tfkb.wearapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Serhan on 1.9.2016.
 */
public class Finance extends Activity {
    private Button kurlar,borsa,karpayi,hisse_senedi;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.financetry);
        kurlar=(Button) findViewById(R.id.btnKur);
        borsa=(Button) findViewById(R.id.btnBorsa);
        karpayi=(Button) findViewById(R.id.btnKarPaylari);
        hisse_senedi=(Button) findViewById(R.id.btnHisseSenetleri);

        kurlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Finance.this,Kur.class);
                startActivity(i);
            }
        });

        borsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Finance.this,Borsa.class);
                startActivity(i);
            }
        });

        karpayi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Finance.this,KarPayi.class);
                startActivity(i);
            }
        });
        hisse_senedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Finance.this,HisseSenedi.class);
                startActivity(i);
            }
        });
    }
}
