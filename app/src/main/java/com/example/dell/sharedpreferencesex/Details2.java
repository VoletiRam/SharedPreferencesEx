package com.example.dell.sharedpreferencesex;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Details2 extends AppCompatActivity {
   TextView email,pwd;
    String emailstr,pwdstr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);
        SharedPreferences editor=getSharedPreferences("logindata",MODE_PRIVATE);
        emailstr=editor.getString("email","");
        pwdstr=editor.getString("pwd","");
        email=(TextView)findViewById(R.id.email);
        pwd=(TextView)findViewById(R.id.pwd);
        pwd.setText(pwdstr);
        email.setText(emailstr);
    }
}
