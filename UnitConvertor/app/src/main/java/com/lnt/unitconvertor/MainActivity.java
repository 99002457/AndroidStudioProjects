package com.lnt.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    static final String NAME="Conversion";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView are=(CardView)findViewById(R.id.area);
        CardView cur=(CardView)findViewById(R.id.currency);
        CardView len=(CardView)findViewById(R.id.length);
        CardView temp=(CardView)findViewById(R.id.temperature);
        CardView time=(CardView)findViewById(R.id.time);
        CardView weight=(CardView)findViewById(R.id.weight);
        final Intent intent=new Intent(this,conversion1.class);
        are.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra(NAME,"area");
                startActivity(intent);
            }
        });
        cur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra(NAME,"currency");
                startActivity(intent);
            }
        });
        len.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.putExtra(NAME,"length");
                startActivity(intent);

            }
        });
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.putExtra(NAME,"temp");
                startActivity(intent);

            }
        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.putExtra(NAME,"time");
                startActivity(intent);
            }
        });
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra(NAME,"weight");
                startActivity(intent);
            }
        });

    }
}