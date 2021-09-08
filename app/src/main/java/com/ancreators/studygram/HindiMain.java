package com.ancreators.studygram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HindiMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_main);
    }

    public void hindia(View view) {
        Intent intent = new Intent(this, HindiA.class);
        startActivity(intent);
    }

    public void hindib(View view) {
        Intent intent1 = new Intent(this,HindiB.class);
        startActivity(intent1);
    }
}