package com.example.talaatmagdy.colorchange;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;

    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         b1 = (Button)findViewById(R.id.b1);
         b2 = (Button)findViewById(R.id.b2);
         b3 = (Button)findViewById(R.id.b3);
         b4 = (Button)findViewById(R.id.b4);
         b5 = (Button)findViewById(R.id.b5);


    }
    public void action (View v )
    {
        String Btn_text = ((Button)v).getText().toString();
        if(Btn_text.equals("colorA"))
        {
            fragment = new colorA();
        }
        if(Btn_text.equals("colorB"))
        {
            fragment = new colorB();

        }
         if(Btn_text.equals("colorC"))
        {
            fragment = new colorC();

        }
        if(Btn_text.equals("colorD"))
        {
            fragment = new colorD();

        }
        if(Btn_text.equals("colorE"))
        {
            fragment = new colorF();

        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft =fm.beginTransaction();
        ft.replace(R.id.fr1,fragment);
        ft.commit();

    }
}
