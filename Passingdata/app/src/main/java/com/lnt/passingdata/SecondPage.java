package com.lnt.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        Intent intent=getIntent();
        String msg=intent.getStringExtra(MainActivity.MESSAGE);
        TextView text=(TextView)findViewById(R.id.name);
        text.setText(msg);
        //TextView message=(TextView)findViewById(R.id.message);
        //message.setText(getIntent().getStringExtra("My message"));
    }
}