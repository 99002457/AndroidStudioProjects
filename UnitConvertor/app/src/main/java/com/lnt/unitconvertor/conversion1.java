package com.lnt.unitconvertor;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class conversion1 extends AppCompatActivity {
    Button btn;
    EditText edit1;
    EditText edit2;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion1);

        Intent intent=getIntent();
        final String msg=intent.getStringExtra(MainActivity.NAME);
        btn=(Button) findViewById(R.id.con);
        Button clear=(Button) findViewById(R.id.button);
        edit1=(EditText) findViewById(R.id.editTextTextPersonName);
        edit2=(EditText) findViewById(R.id.editTextTextPersonName3);
        TextView title=(TextView) findViewById(R.id.title);
        TextView from=(TextView) findViewById(R.id.from);
        TextView to=(TextView) findViewById(R.id.to);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
                edit2.setText("");
            }
        });
        if(msg.equalsIgnoreCase("area"))
        {
          title.setText("Area Conversion");
          from.setText("Square Foot");
          to.setText("Square Inch");
        }
        else if(msg.equalsIgnoreCase("currency"))
        {
            title.setText("Currency Conversion");
            from.setText("US Dollar");
            to.setText("Rupees");
        }
        else if(msg.equalsIgnoreCase("length"))
        {
            title.setText("Length Conversion");
            from.setText("Centimeter");
            to.setText("Meter");
        }
        else if(msg.equalsIgnoreCase("temp"))
        {
            title.setText("Temperature Conversion");
            from.setText("Celsius");
            to.setText("Fahrenheit");
        }
        else if(msg.equalsIgnoreCase("time"))
        {
            title.setText("Time Conversion");
            from.setText("Hours");
            to.setText("Minutes");
        }
        else if(msg.equalsIgnoreCase("weight"))
        {
            title.setText("Weight Conversion");
            from.setText("Grams");
            to.setText("Kilo Grams");
        }
        btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(msg!=null) {
                   if (msg.equalsIgnoreCase("area")) {
                       if(edit1.getText().toString().equalsIgnoreCase("") && edit2.getText().toString().equalsIgnoreCase(""))
                       {
                           Toast.makeText(getApplicationContext(),"Enter input",Toast.LENGTH_LONG).show();
                       }
                       else if(!edit1.getText().toString().equalsIgnoreCase("") && !edit2.getText().toString().equalsIgnoreCase(""))
                       {
                           Toast.makeText(getApplicationContext(),"Enter one Input please",Toast.LENGTH_LONG).show();
                       }
                       else {
                           if (edit2.getText().toString().equalsIgnoreCase("")) {

                               String s=edit1.getText().toString();
                               Double d=new Double(s).doubleValue();
                               Double str=d *144.0;
                               str= BigDecimal.valueOf(str).setScale(3, RoundingMode.HALF_UP).doubleValue();
                               String res=Double.toString(str);
                               edit2.setText(res);
                           }
                           else if (edit1.getText().toString().equalsIgnoreCase("")) {
                               String s=edit2.getText().toString();
                               Double d=new Double(s).doubleValue();
                               Double str = null;
                               if(d!=0.0)
                               {   str=d/144.0; str= BigDecimal.valueOf(str).setScale(3, RoundingMode.HALF_UP).doubleValue();}
                               String res=Double.toString(str);
                               edit1.setText(res);
                           }
                       }

                   } else if (msg.equalsIgnoreCase("currency")) {

                       if(edit1.getText().toString().equalsIgnoreCase("") && edit2.getText().toString().equalsIgnoreCase(""))
                       {
                           Toast.makeText(getApplicationContext(),"Enter input",Toast.LENGTH_LONG).show();
                       }
                       else if(!edit1.getText().toString().equalsIgnoreCase("") && !edit2.getText().toString().equalsIgnoreCase(""))
                       {
                           Toast.makeText(getApplicationContext(),"Enter one Input please",Toast.LENGTH_LONG).show();
                       }
                       else {
                           if (edit2.getText().toString().equalsIgnoreCase("")) {

                               String s=edit1.getText().toString();
                               Double d=new Double(s).doubleValue();
                               Double str=d *73.36;
                               str= BigDecimal.valueOf(str).setScale(3, RoundingMode.HALF_UP).doubleValue();
                               String res=Double.toString(str);
                               edit2.setText(res);
                           }
                           else if (edit1.getText().toString().equalsIgnoreCase("")) {
                               String s=edit2.getText().toString();
                               Double d=new Double(s).doubleValue();
                               Double str = null;
                               if(d!=0.0)
                               {str=d/73.36; str= BigDecimal.valueOf(str).setScale(3, RoundingMode.HALF_UP).doubleValue();}
                               String res=Double.toString(str);
                               edit1.setText(res);
                           }
                       }

                   } else if (msg.equalsIgnoreCase("length")) {

                       if(edit1.getText().toString().equalsIgnoreCase("") && edit2.getText().toString().equalsIgnoreCase(""))
                       {
                           Toast.makeText(getApplicationContext(),"Enter input",Toast.LENGTH_LONG).show();
                       }
                       else if(!edit1.getText().toString().equalsIgnoreCase("") && !edit2.getText().toString().equalsIgnoreCase(""))
                       {
                           Toast.makeText(getApplicationContext(),"Enter one Input please",Toast.LENGTH_LONG).show();
                       }
                       else {
                           if (edit2.getText().toString().equalsIgnoreCase("")) {

                               String s=edit1.getText().toString();
                               Double d=new Double(s).doubleValue();
                               Double str = null;
                               if(d!=0.0)
                               {   str=d/100; str= BigDecimal.valueOf(str).setScale(3, RoundingMode.HALF_UP).doubleValue();}
                               String res=Double.toString(str);
                               edit2.setText(res);
                           }
                           else if (edit1.getText().toString().equalsIgnoreCase("")) {
                               String s=edit2.getText().toString();
                               Double d=new Double(s).doubleValue();
                               Double str=d*100;
                               str= BigDecimal.valueOf(str).setScale(3, RoundingMode.HALF_UP).doubleValue();
                               String res=Double.toString(str);
                               edit1.setText(res);
                           }
                       }

                   } else if (msg.equalsIgnoreCase("temp")) {

                       if(edit1.getText().toString().equalsIgnoreCase("") && edit2.getText().toString().equalsIgnoreCase(""))
                       {
                           Toast.makeText(getApplicationContext(),"Enter input",Toast.LENGTH_LONG).show();
                       }
                       else if(!edit1.getText().toString().equalsIgnoreCase("") && !edit2.getText().toString().equalsIgnoreCase(""))
                       {
                           Toast.makeText(getApplicationContext(),"Enter one Input please",Toast.LENGTH_LONG).show();
                       }
                       else {
                           if (edit2.getText().toString().equalsIgnoreCase("")) {

                               String s=edit1.getText().toString();
                               Double d=new Double(s).doubleValue();
                               Double str=(d*9/5)+32;
                               str= BigDecimal.valueOf(str).setScale(3, RoundingMode.HALF_UP).doubleValue();
                               String res=Double.toString(str);
                               edit2.setText(res);
                           }
                           else if (edit1.getText().toString().equalsIgnoreCase("")) {
                               String s=edit2.getText().toString();
                               Double d=new Double(s).doubleValue();
                               Double str=(d-32)*5/9;
                               str= BigDecimal.valueOf(str).setScale(3, RoundingMode.HALF_UP).doubleValue();
                               String res=Double.toString(str);
                               edit1.setText(res);
                           }
                       }

                   } else if (msg.equalsIgnoreCase("time")) {

                       if(edit1.getText().toString().equalsIgnoreCase("") && edit2.getText().toString().equalsIgnoreCase(""))
                       {
                           Toast.makeText(getApplicationContext(),"Enter input",Toast.LENGTH_LONG).show();
                       }
                       else if(!edit1.getText().toString().equalsIgnoreCase("") && !edit2.getText().toString().equalsIgnoreCase(""))
                       {
                           Toast.makeText(getApplicationContext(),"Enter one Input please",Toast.LENGTH_LONG).show();
                       }
                       else {
                           if (edit2.getText().toString().equalsIgnoreCase("")) {

                               String s=edit1.getText().toString();
                               Double d=new Double(s).doubleValue();
                               Double str=d*60;
                               str= BigDecimal.valueOf(str).setScale(3, RoundingMode.HALF_UP).doubleValue();
                               String res=Double.toString(str);
                               edit2.setText(res);
                           }
                           else if (edit1.getText().toString().equalsIgnoreCase("")) {
                               String s=edit2.getText().toString();
                               Double d=new Double(s).doubleValue();
                               Double str=null;
                               if(d!=0.0)
                               {    str=d/60;
                               str= BigDecimal.valueOf(str).setScale(3, RoundingMode.HALF_UP).doubleValue();}
                               String res=Double.toString(str);
                               edit1.setText(res);
                           }
                       }

                   } else if (msg.equalsIgnoreCase("weight")) {

                       if(edit1.getText().toString().equalsIgnoreCase("") && edit2.getText().toString().equalsIgnoreCase(""))
                       {
                           Toast.makeText(getApplicationContext(),"Enter input",Toast.LENGTH_LONG).show();
                       }
                       else if(!edit1.getText().toString().equalsIgnoreCase("") && !edit2.getText().toString().equalsIgnoreCase(""))
                       {
                           Toast.makeText(getApplicationContext(),"Enter one Input please",Toast.LENGTH_LONG).show();
                       }
                       else {
                           if (edit2.getText().toString().equalsIgnoreCase("")) {

                               String s=edit1.getText().toString();
                               Double d=new Double(s).doubleValue();
                               Double str=null;
                               if(d!=0.0)
                               {   str=d/1000;
                               str= BigDecimal.valueOf(str).setScale(3, RoundingMode.HALF_UP).doubleValue();}
                               String res=Double.toString(str);
                               edit2.setText(res);
                           }
                           else if (edit1.getText().toString().equalsIgnoreCase("")) {
                               String s=edit2.getText().toString();
                               Double d=new Double(s).doubleValue();
                               Double str=d*1000;
                               str= BigDecimal.valueOf(str).setScale(3, RoundingMode.HALF_UP).doubleValue();
                               String res=Double.toString(str);
                               edit1.setText(res);
                           }
                       }

                   }
               }
           }
       });

    }

}