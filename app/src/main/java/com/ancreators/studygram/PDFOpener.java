package com.ancreators.studygram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {
    PDFView myPDFViewer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_f_opener);

        myPDFViewer=(PDFView) findViewById(R.id.pdfViewer);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("Paper-1")){

            myPDFViewer.fromAsset("1.pdf").load();
        }

        if (getItem.equals("Paper-2")){
            myPDFViewer.fromAsset("2.pdf").load();
        }
        if (getItem.equals("Paper-3")){
            myPDFViewer.fromAsset("3.pdf").load();
        }
        if (getItem.equals("Paper-4")){
            myPDFViewer.fromAsset("4.pdf").load();
        }
        if (getItem.equals("Paper-5")){
            myPDFViewer.fromAsset("5.pdf").load();
        }
        if (getItem.equals("Paper-6")){
            myPDFViewer.fromAsset("6.pdf").load();
        }
        if (getItem.equals("Paper-7")){
            myPDFViewer.fromAsset("7.pdf").load();
        }
        if (getItem.equals("Paper-8")){
            myPDFViewer.fromAsset("8.pdf").load();
        }
        if (getItem.equals("Paper-9")){
            myPDFViewer.fromAsset("9.pdf").load();
        }
        if (getItem.equals("Paper-10")){
            myPDFViewer.fromAsset("10.pdf").load();
        }
        if (getItem.equals("Paper-11")){
            myPDFViewer.fromAsset("11.pdf").load();
        }
        if (getItem.equals("Paper-12")){
            myPDFViewer.fromAsset("12.pdf").load();
        }
        if (getItem.equals("Paper-13")){
            myPDFViewer.fromAsset("13.pdf").load();
        }
        if (getItem.equals("Paper-14")){
            myPDFViewer.fromAsset("14.pdf").load();
        }
        if (getItem.equals("Paper-15")){
            myPDFViewer.fromAsset("15.pdf").load();
        }



    }
}