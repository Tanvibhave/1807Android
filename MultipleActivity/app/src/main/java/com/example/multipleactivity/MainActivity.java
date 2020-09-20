package com.example.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    public static final String EXTRA_MESSAGE="com.example.multipleactivity.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();
        String message=intent.getStringExtra(Activity3.EXTRA_MESSAGE3);

        EditText e1=findViewById(R.id.et1);
        e1.setText(message);
    }

    public void sendMessage(View view)
    {
        Intent intent= new Intent(this,Activity2.class);
        EditText e1=findViewById(R.id.et1);
        String message=e1.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}