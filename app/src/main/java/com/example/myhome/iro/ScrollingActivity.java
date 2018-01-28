package com.example.myhome.iro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Arrays;
import java.util.List;

public class ScrollingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton redButton = (ImageButton) findViewById(R.id.imageButton8);

        // Capture button clicks
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ScrollingActivity.this,
                        colorchosen.class);
                myIntent.putExtra("some_key", "red");
                startActivity(myIntent);
            }

        });

        ImageButton yellowButton = (ImageButton) findViewById(R.id.imageButton9);

        // Capture button clicks
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ScrollingActivity.this,
                        colorchosen.class);
                myIntent.putExtra("some_key", "yellow");
                startActivity(myIntent);
            }

        });

        ImageButton lightyellowButton = (ImageButton) findViewById(R.id.imageButton1);

        // Capture button clicks
        lightyellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ScrollingActivity.this,
                        colorchosen.class);
                myIntent.putExtra("some_key", "lightyellow");
                startActivity(myIntent);
            }

        });

        ImageButton blackButton = (ImageButton) findViewById(R.id.imageButton2);

        // Capture button clicks
        blackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ScrollingActivity.this,
                        colorchosen.class);
                myIntent.putExtra("some_key", "black");
                startActivity(myIntent);
            }

        });
        ImageButton blueButton = (ImageButton) findViewById(R.id.imageButton3);

        // Capture button clicks
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ScrollingActivity.this,
                        colorchosen.class);
                myIntent.putExtra("some_key", "blue");
                startActivity(myIntent);
            }

        });
        ImageButton brownButton = (ImageButton) findViewById(R.id.imageButton4);

        // Capture button clicks
        brownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ScrollingActivity.this,
                        colorchosen.class);
                myIntent.putExtra("some_key", "brown");
                startActivity(myIntent);
            }

        });
        ImageButton greenButton = (ImageButton) findViewById(R.id.imageButton5);

        // Capture button clicks
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ScrollingActivity.this,
                        colorchosen.class);
                myIntent.putExtra("some_key", "green");
                startActivity(myIntent);
            }

        });
        ImageButton pinkButton = (ImageButton) findViewById(R.id.imageButton6);

        // Capture button clicks
        pinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ScrollingActivity.this,
                        colorchosen.class);
                myIntent.putExtra("some_key", "pink");
                startActivity(myIntent);
            }

        });
        ImageButton violetButton = (ImageButton) findViewById(R.id.imageButton7);

        // Capture button clicks
        violetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ScrollingActivity.this,
                        colorchosen.class);
                myIntent.putExtra("some_key", "violet");
                startActivity(myIntent);
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
