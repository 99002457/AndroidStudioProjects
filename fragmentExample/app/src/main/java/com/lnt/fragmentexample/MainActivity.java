package com.lnt.fragmentexample;

//import android.support.v7.app.AppCompatActivity;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

public class MainActivity extends AppCompatActivity {
    Button First,Second;
    Fragment f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        First=(Button) findViewById(R.id.button2);
        Second=(Button) findViewById(R.id.button);
        Second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                loadFragment(new Fragment2());
            }
    });
        First.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FirstFragement());
            }
        });

    }


    private void loadFragment(Fragment fragment)
    {
        //create a fragment manager
        FragmentManager manager=getFragmentManager();
        //create the fragment transaction
        FragmentTransaction fd=manager.beginTransaction();
        fd.replace(R.id.frameLayout,fragment);
        fd.commit();

    }
}