package com.lnt.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.lnt.cardview.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> persoNames= new ArrayList<>(Arrays.asList("Bill Gates","Jack Ma","Sundar Pichai","Satya Nadella","Narayana Murthy","Jeff Bezos","Mark Zuckerberg"));
    ArrayList<String> designation= new ArrayList<>(Arrays.asList("Founder of Microsoft","Founder of Ali Baba","CEO of Google","CEO of Microsoft","Founder of Infosys","Founder of Amazon","Founder of Facebook"));
    Integer[] ar={R.drawable.a1,R.drawable.a3,R.drawable.a7,R.drawable.a6,R.drawable.a5,R.drawable.a2,R.drawable.a4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView album=(RecyclerView)findViewById(R.id.album); //2 step

        LinearLayoutManager linearLayoutManager= new LinearLayoutManager((getApplicationContext()));
        album.setLayoutManager(linearLayoutManager);
        CustomeAdapter customeAdapter =new CustomeAdapter(persoNames,designation,ar,MainActivity.this);

        album.setAdapter(customeAdapter);


    }
}