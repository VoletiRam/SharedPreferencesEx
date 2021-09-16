package com.example.dell.sharedpreferencesex;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText email,pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        email= (EditText) findViewById(R.id.email);
        pwd=(EditText)findViewById(R.id.pwd);

    }

    public void nextPage(View view) {
        String emailtxt=email.getText().toString();
        String pwdtxt=pwd.getText().toString();
        SharedPreferences.Editor editor=getSharedPreferences("logindata",MODE_PRIVATE).edit();
        editor.putString("email",emailtxt);
        editor.putString("pwd",pwdtxt);
        editor.commit();
        Intent intent=new Intent(this,Details2.class);
        startActivity(intent);

    }
}
