package com.portal.tfkb.wearapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class CurrencyActivity extends Activity {

    private DovizTakipAsyncTask task;
    int sira_alim_sayisi=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
      //  Intent serviceintent=new Intent(CurrencyActivity.this,WifiService.class);
        //startService(serviceintent);
        task = new DovizTakipAsyncTask(this);
        task.execute(getResources().getString(R.string.doviz_takip_url));
        Button yenileButton = (Button) findViewById(R.id.yenileButton);
        yenileButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                task = new DovizTakipAsyncTask(CurrencyActivity.this);
                task.execute(getResources().getString(R.string.doviz_takip_url));

            }
        });



    }


    @Override
    protected void onResume() {
       // Intent serviceintent=new Intent(CurrencyActivity.this,WifiService.class);
        //startService(serviceintent);
        super.onResume();
    }

    @Override
    protected void onDestroy() {
       // Intent serviceintent=new Intent(CurrencyActivity.this,WifiService.class);
        //startService(serviceintent);
        super.onDestroy();
    }
}
