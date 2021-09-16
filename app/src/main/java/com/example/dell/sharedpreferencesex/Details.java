package com.example.dell.sharedpreferencesex;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {
     TextView name,email,pwd;
    String namestr,emailstr,pwdstr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        SharedPreferences editor=getSharedPreferences("data",MODE_PRIVATE);
        namestr=editor.getString("name","");
        emailstr=editor.getString("email","");
        pwdstr=editor.getString("pwd","");
       name= (TextView) findViewById(R.id.name);
        email=(TextView)findViewById(R.id.email);
        pwd=(TextView)findViewById(R.id.pwd);
        name.setText(namestr);
        pwd.setText(pwdstr);
        email.setText(emailstr);

    }
}
