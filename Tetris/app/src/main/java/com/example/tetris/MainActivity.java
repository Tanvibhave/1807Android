package com.example.tetris;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button red,yellow,blue,green;
    LinearLayout myRelativeLayout;
    LayoutInflater layoutInflater;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red=(Button)findViewById(R.id.btnRed);
        yellow=(Button)findViewById(R.id.btnYellow);
        blue=(Button)findViewById(R.id.btnBlue);
        green=(Button)findViewById(R.id.btnGreen);

        red.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                myRelativeLayout=(LinearLayout)findViewById(R.id.abcd);
                View view=getLayoutInflater().inflate(R.layout.activity_next,null);
                textView=view.findViewById(R.id.txtView);
                textView.setBackgroundColor(Color.RED);
                myRelativeLayout.addView(view);
            }
        });

        green.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                myRelativeLayout=(LinearLayout)findViewById(R.id.abcd);
                View view=getLayoutInflater().inflate(R.layout.activity_next,null);
                textView=view.findViewById(R.id.txtView);
                textView.setBackgroundColor(Color.GREEN);
                myRelativeLayout.addView(view);
            }
        });

        blue.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                myRelativeLayout=(LinearLayout)findViewById(R.id.abcd);
                View view=getLayoutInflater().inflate(R.layout.activity_next,null);
                textView=view.findViewById(R.id.txtView);
                textView.setBackgroundColor(Color.BLUE);
                myRelativeLayout.addView(view);
            }
        });

        yellow.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                myRelativeLayout=(LinearLayout)findViewById(R.id.abcd);
                View view=getLayoutInflater().inflate(R.layout.activity_next,null);
                textView=view.findViewById(R.id.txtView);
                textView.setBackgroundColor(Color.YELLOW);
                myRelativeLayout.addView(view);
            }
        });
    }
}