package com.example.myhome.iro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class colorchosen extends AppCompatActivity {

    //


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle bundle = getIntent().getExtras();
        final String color1 = bundle.getString("some_key");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colorchosen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(color1);
        final TextView textViewToChange = (TextView) findViewById(R.id.textView);
        textViewToChange.setText(color1);
        setSupportActionBar(toolbar);


        ImageButton redButton = (ImageButton) findViewById(R.id.imageButton8);

        // Capture button clicks
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(colorchosen.this,
                        result1.class);
                myIntent.putExtra("some_key", "red");
                myIntent.putExtra("other_key", color1);
                startActivity(myIntent);
            }

        });

        ImageButton yellowButton = (ImageButton) findViewById(R.id.imageButton9);

        // Capture button clicks
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(colorchosen.this,
                        result1.class);
                myIntent.putExtra("some_key", "yellow");
                myIntent.putExtra("other_key", color1);
                startActivity(myIntent);
            }

        });

        ImageButton lightyellowButton = (ImageButton) findViewById(R.id.imageButton1);

        // Capture button clicks
        lightyellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(colorchosen.this,
                        result1.class);
                myIntent.putExtra("some_key", "lightyellow");
                myIntent.putExtra("other_key", color1);
                startActivity(myIntent);
            }

        });

        ImageButton blackButton = (ImageButton) findViewById(R.id.imageButton2);

        // Capture button clicks
        blackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(colorchosen.this,
                        result1.class);
                myIntent.putExtra("some_key", "black");
                myIntent.putExtra("other_key", color1);
                startActivity(myIntent);
            }

        });
        ImageButton blueButton = (ImageButton) findViewById(R.id.imageButton3);

        // Capture button clicks
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(colorchosen.this,
                        result1.class);
                myIntent.putExtra("some_key", "blue");
                myIntent.putExtra("other_key", color1);
                startActivity(myIntent);
            }

        });
        ImageButton brownButton = (ImageButton) findViewById(R.id.imageButton4);

        // Capture button clicks
        brownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(colorchosen.this,
                        result1.class);
                myIntent.putExtra("some_key", "brown");
                myIntent.putExtra("other_key", color1);
                startActivity(myIntent);
            }

        });
        ImageButton greenButton = (ImageButton) findViewById(R.id.imageButton5);

        // Capture button clicks
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(colorchosen.this,
                        result1.class);
                myIntent.putExtra("some_key", "green");
                myIntent.putExtra("other_key", color1);
                startActivity(myIntent);
            }

        });
        ImageButton pinkButton = (ImageButton) findViewById(R.id.imageButton6);

        // Capture button clicks
        pinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(colorchosen.this,
                        result1.class);
                myIntent.putExtra("some_key", "pink");
                myIntent.putExtra("other_key", color1);
                startActivity(myIntent);
            }

        });
        ImageButton violetButton = (ImageButton) findViewById(R.id.imageButton7);

        // Capture button clicks
        violetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(colorchosen.this,
                        result1.class);
                myIntent.putExtra("some_key", "violet");
                myIntent.putExtra("other_key", color1);
                startActivity(myIntent);
            }

        });
    }
}
