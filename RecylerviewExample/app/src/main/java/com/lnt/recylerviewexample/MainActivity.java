package com.lnt.recylerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> persoNames= new ArrayList<>(Arrays.asList("Album 1","Album 2","Album 3","Album 4","Album 5","Album 6","Album 7","Album 8","Album 9"));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView album=(RecyclerView)findViewById(R.id.album); //2 step
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager((getApplicationContext()));
        album.setLayoutManager(linearLayoutManager);
        CustomeAdapter customeAdapter =new CustomeAdapter(persoNames,MainActivity.this);
        album.setAdapter(customeAdapter);


    }
}