package com.portal.tfkb.wearapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Serhan on 1.9.2016.
 */
public class Account extends Activity {

    private EditText username,password;
    private Button login;
    private CheckBox cbrememberme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account);
        username=(EditText) findViewById(R.id.txtUsername);
        password=(EditText) findViewById(R.id.txtPassword);
        login=(Button) findViewById(R.id.btnLogin);
        cbrememberme=(CheckBox) findViewById(R.id.cbRememberMe);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kullaniciad=username.getText().toString();
                String parola=password.getText().toString();
                if(kullaniciad.length()==0 )
                {
                    username.requestFocus();
                    username.setError("Kullanıcı Adı  boş bırakılamaz!");
                }

                else if(kullaniciad.length()!=11)
                {
                    username.requestFocus();
                    username.setError("Lütfen 11 Haneli"+"\n"+" Kullanıcı Adınızı Giriniz!");

                }

                else if(parola.length()==0)
                {
                    password.requestFocus();
                    password.setError("Şifre boş geçilemez!");
                }

                else if(parola.length()<6 || parola.length()>15)
                {
                    password.requestFocus();
                    password.setError("Lütfen 6 ile 15 karakter"+"\n"+"arasında şifre giriniz!");
                }

                else
                {
                    Toast.makeText(getApplicationContext(), "Giriş başarılı..", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
