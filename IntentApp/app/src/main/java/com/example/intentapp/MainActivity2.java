package com.example.intentapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity
{
    TextView txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtName = (TextView)findViewById(R.id.textView2);
        Intent i=getIntent();
        //Get the USERNAME passed from IntentExampleActivity
        String uname = (String) i.getSerializableExtra("USERNAME");
        //String s2 =i.getStringExtra("Name");
//Set text for greetMsg TextView
        txtName.setText(uname);

    }
}