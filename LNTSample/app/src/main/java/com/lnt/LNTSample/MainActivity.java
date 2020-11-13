package com.lnt.LNTSample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //use of the super class methods
        setContentView(R.layout.activity_main);

        Button  b= (Button)findViewById(R.id.Submit);
        final EditText e=(EditText)findViewById(R.id.text);
        final TextView t=(TextView)findViewById(R.id.text1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String s= e.getText().toString();
            s=s+" LNT";
            t.setText(s);
            }
        });


    }
}