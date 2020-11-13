package com.lnt.calculator1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.mariuszgromada.math.mxparser.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isDigit;

public class MainActivity extends AppCompatActivity {
    String Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button one = (Button) findViewById(R.id.one);
        Button two = (Button) findViewById(R.id.two);
        Button three = (Button) findViewById(R.id.three);
        Button four = (Button) findViewById(R.id.four);
        Button five = (Button) findViewById(R.id.five);
        Button six = (Button) findViewById(R.id.six);
        Button seven = (Button) findViewById(R.id.seven);
        Button eight = (Button) findViewById(R.id.eight);
        Button nine = (Button) findViewById(R.id.nine);
        Button zero = (Button) findViewById(R.id.zero);
        Button dot = (Button) findViewById(R.id.dot);
        Button abs = (Button) findViewById(R.id.abs);
        Button ac = (Button) findViewById(R.id.ac);
        Button c = (Button) findViewById(R.id.c);
        Button slash = (Button) findViewById(R.id.slash);
        Button minus = (Button) findViewById(R.id.minus);
        Button plus = (Button) findViewById(R.id.plus);
        Button x = (Button) findViewById(R.id.mul);
        Button mod = (Button) findViewById(R.id.mod);
        Button equals = (Button) findViewById(R.id.equals);
        final TextView ques = (TextView) findViewById(R.id.textView7);
        final TextView ans = (TextView) findViewById(R.id.textView8);

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addtext("%");
            }
        });

        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addtext("^");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                addtext("+");

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                addtext("-");
            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                addtext("*");

            }
        });
        slash.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                addtext("/");

            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                TextView ques = (TextView) findViewById(R.id.textView7);
                TextView res = (TextView) findViewById(R.id.textView8);
                String old = ques.getText().toString();
                String r=evaluate(old);
                if(r=="NaN" && ques.getText().toString()=="")
                {
                    res.setText("");
                    Toast.makeText(getApplicationContext(),"Enter something to calculate",Toast.LENGTH_LONG).show();
                }
                else if(r=="NaN")
                {
                    res.setText("");
                    ques.setText("");
                    Toast.makeText(getApplicationContext(),"Syntax Error",Toast.LENGTH_LONG).show();
                }
                else {
                    ques.setText("");
                    res.setText(r);
                }
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addtext("1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addtext("2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addtext("3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addtext("4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addtext("5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addtext("6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addtext("7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addtext("8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addtext("9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addtext("0");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addtext(".");
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ques.setText("");
                ans.setText("");
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String old = ques.getText().toString();
                    String neww = old.substring(0, old.length() - 1);
                    ques.setText(neww);
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Error you cant do it :-)",Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    public void addtext(String s) {
        TextView ques = (TextView) findViewById(R.id.textView7);
        String old = ques.getText().toString();
        s = old + s;
        if (s.length() < 80)
            ques.setText(s);
    }

    public static String evaluate(String input) {
    Expression exp=new Expression(input);
    String result=String.valueOf(exp.calculate());
    return result;
    }
}