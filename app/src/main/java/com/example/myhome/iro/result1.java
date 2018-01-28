package com.example.myhome.iro;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class result1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        List palette1 = Arrays.asList( "black", "lightyellow", "yellow", "red");
        List palette2 = Arrays.asList("pink", "lightyellow", "brown");
        List palette3 = Arrays.asList("violet", "blue", "yellow");
        List palette4 = Arrays.asList("violet", "blue");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        String success = "They match!";
        String failure = "They don't match :(";
        setSupportActionBar(toolbar);
        Bundle bundle = getIntent().getExtras();
        final String color2 = bundle.getString("some_key");
        final String color1 = bundle.getString("other_key");
        System.out.println(color1);
        System.out.println(color2);
        if( palette1.contains(color1) ) {
            if(palette1.contains(color2)) {
                TextView textViewToChange = (TextView) findViewById(R.id.textView2);
                textViewToChange.setText(success);

            }
        }
        else {
            TextView textViewToChange = (TextView) findViewById(R.id.textView2);
            textViewToChange.setText(failure);
        }
        if( palette2.contains(color1) ) {
            if(palette2.contains(color2)) {
                TextView textViewToChange = (TextView) findViewById(R.id.textView2);
                textViewToChange.setText(success);

            }
        }
        else {
            final TextView textViewToChange = (TextView) findViewById(R.id.textView2);
            textViewToChange.setText(failure);
        }
        if( palette3.contains(color1) ) {
            if(palette3.contains(color2)) {
                final TextView textViewToChange = (TextView) findViewById(R.id.textView2);
                textViewToChange.setText(success);

            }
        }
        else {
            final TextView textViewToChange = (TextView) findViewById(R.id.textView2);
            textViewToChange.setText(failure);
        }
        if( palette4.contains(color1) ) {
            if(palette4.contains(color2)) {
                final TextView textViewToChange = (TextView) findViewById(R.id.textView2);
                textViewToChange.setText(success);

            }
        }
        else {
            final TextView textViewToChange = (TextView) findViewById(R.id.textView2);
            textViewToChange.setText(failure);
        }


    }

}
