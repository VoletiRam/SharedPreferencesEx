package com.example.dell.sharedpreferencesex;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    EditText name,email,pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= (EditText) findViewById(R.id.name);
        email= (EditText) findViewById(R.id.email);
        pwd=(EditText)findViewById(R.id.pwd);

    }

    public void nextPage(View view)
    {
        String nametxt=name.getText().toString();
        String emailtxt=email.getText().toString();
        String pwdtxt=pwd.getText().toString();
       SharedPreferences.Editor editor=getSharedPreferences("data",MODE_PRIVATE).edit();
        editor.putString("name",nametxt);
        editor.putString("email",emailtxt);
        editor.putString("pwd",pwdtxt);
        editor.commit();
        Toast.makeText(this,"data inserted successfully",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,Details.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
