package com.ancreators.studygram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpenerm extends AppCompatActivity {
    PDFView myPDFViewer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_f_openerm);

        myPDFViewer=(PDFView) findViewById(R.id.pdfViewer);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("Paper-1")){

            myPDFViewer.fromAsset("M1.pdf").load();
        }

        if (getItem.equals("Paper-2")){
            myPDFViewer.fromAsset("M2.pdf").load();
        }
        if (getItem.equals("Paper-3")){
            myPDFViewer.fromAsset("M3.pdf").load();
        }
        if (getItem.equals("Paper-4")){
            myPDFViewer.fromAsset("M4.pdf").load();
        }
        if (getItem.equals("Paper-5")){
            myPDFViewer.fromAsset("M5.pdf").load();
        }
        if (getItem.equals("Paper-6")){
            myPDFViewer.fromAsset("M6.pdf").load();
        }
        if (getItem.equals("Paper-7")){
            myPDFViewer.fromAsset("M7.pdf").load();
        }
        if (getItem.equals("Paper-8")){
            myPDFViewer.fromAsset("M8.pdf").load();
        }
        if (getItem.equals("Paper-9")){
            myPDFViewer.fromAsset("M9.pdf").load();
        }
        if (getItem.equals("Paper-10")){
            myPDFViewer.fromAsset("M10.pdf").load();
        }
        if (getItem.equals("Paper-11")){
            myPDFViewer.fromAsset("M11.pdf").load();
        }
        if (getItem.equals("Paper-12")){
            myPDFViewer.fromAsset("M12.pdf").load();
        }
        if (getItem.equals("Paper-13")){
            myPDFViewer.fromAsset("M13.pdf").load();
        }



    }
}