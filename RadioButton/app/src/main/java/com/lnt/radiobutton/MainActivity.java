package com.lnt.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioButton john =(RadioButton) findViewById(R.id.john);
        final RadioButton Gold =(RadioButton) findViewById(R.id.gb);
        final RadioButton roman =(RadioButton) findViewById(R.id.rome);
        final RadioButton sheamus =(RadioButton) findViewById(R.id.shemus);
        final RadioButton randy =(RadioButton) findViewById(R.id.randy);
        Button submit =(Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randy.isChecked()){
                    selected="Selected Randy Ortan";
                }
                else if(john.isChecked())
                {
                    selected="Selected John Cena";
                }
                else if(Gold.isChecked())
                {
                    selected="Selected Gold Berg";
                }
                else if(roman.isChecked())
                {
                    selected="Selected Roman Reings";
                }
                else if(sheamus.isChecked())
                {
                    selected="Selected Sheamus";
                }
                Toast.makeText(getApplicationContext(),selected, Toast.LENGTH_SHORT).show();
            }

        });
    }
}