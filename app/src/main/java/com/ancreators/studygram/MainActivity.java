package com.ancreators.studygram;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void science(View view) {
        Intent intent = new Intent(this,Science.class);
        startActivity(intent);
    }

    public void maths(View view) {
        Intent intent1 = new Intent(this, Maths.class);
        startActivity(intent1);
    }

    public void Social(View view) {
        Intent intent2= new Intent(this,Social.class);
        startActivity(intent2);
    }

    public void english(View view) {
        Intent intent3 = new Intent(this,English.class);
        startActivity(intent3);
    }

    public void sanskrit(View view) {
        Intent intent4 = new Intent(this, Sanskrit.class);
        startActivity(intent4);
    }

    public void hindiMain(View view) {
        Intent intent5 = new Intent(this, HindiMain.class);
        startActivity(intent5);
    }

    public void marathi(View view) {
        Intent intent6 = new Intent(this,Marathi.class);
        startActivity(intent6);
    }
}