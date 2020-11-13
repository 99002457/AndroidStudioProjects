package com.lnt.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
      final DatePicker date = (DatePicker) findViewById(R.id.time);
        Button time = (Button) findViewById(R.id.submit);
        Button back = (Button) findViewById(R.id.back);
        final String[] s = new String[1];
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Day = " Day: " + date.getDayOfMonth();
                String month = " Month:" + date.getMonth();
                String year = " Year : " + date.getYear();
                Toast.makeText(getApplicationContext(), Day + month + year, Toast.LENGTH_LONG).show();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                intent.putExtra("MESSAGE", s[0]);
                MainActivity2.this.startActivity(intent);
            }
        });

    }
}