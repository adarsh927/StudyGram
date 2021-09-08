package com.ancreators.studygram;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Maths extends AppCompatActivity {

    ListView pdfListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);
        pdfListView= (ListView) findViewById(R.id.myPDFList2);

        String[] pdfFiles = {"Paper-1","Paper-2","Paper-3","Paper-4","Paper-5","Paper-6","Paper-7","Paper-8","Paper-9","Paper-10","Paper-11","Paper-12","Paper-13"};


        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pdfFiles){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text1);
                return view;
            }
        };

        pdfListView.setAdapter(adapter);

        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                String item = pdfListView.getItemAtPosition(i).toString();

                Intent start = new Intent(getApplicationContext(),PDFOpenerm.class);
                start.putExtra("pdfFileName", item);
                startActivity(start);


            }
        });


    }
}