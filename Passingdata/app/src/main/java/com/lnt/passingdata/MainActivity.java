package com.lnt.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE="My message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                =edit.getText().toString();

            }
        });*/
    }
   public void sendMyMessage(View view)
    {

       EditText edit=(EditText)findViewById(R.id.name);
        Intent intent= new Intent(this, SecondPage.class);
        String message=edit.getText().toString();
        intent.putExtra(MESSAGE,message);
        startActivity(intent);
    }

}