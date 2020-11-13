package com.lnt.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimePicker time=(TimePicker) findViewById(R.id.time);
        time.setIs24HourView(false);
        final TextView text=(TextView)findViewById(R.id.textView3);
        Button date=(Button) findViewById(R.id.date);
        Button back=(Button) findViewById(R.id.date);
        final String[] s = new String[1];
        time.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(getApplicationContext(),"Hour: "+ hourOfDay+" "+"Minute: "+ minute,Toast.LENGTH_LONG).show();
                s[0] ="Time is: "+hourOfDay+" hours "+minute+" minutes";
                text.setText("Time is: "+hourOfDay+" hours "+minute+" minutes");
            }
        });
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("MESSAGE", s[0]);
                MainActivity.this.startActivity(intent);
            }
        });

    }
}