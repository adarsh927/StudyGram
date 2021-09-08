package com.ancreators.studygram;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpenerhb extends AppCompatActivity {
    PDFView myPDFViewer;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_f_openerhb);

        myPDFViewer = (PDFView) findViewById(R.id.pdfViewer);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("Paper-1")){

            myPDFViewer.fromAsset("B1.pdf").load();
        }

        if (getItem.equals("Paper-2")){
            myPDFViewer.fromAsset("B2.pdf").load();
        }
        if (getItem.equals("Paper-3")){
            myPDFViewer.fromAsset("B3.pdf").load();
        }
        if (getItem.equals("Paper-4")){
            myPDFViewer.fromAsset("B4.pdf").load();
        }
        if (getItem.equals("Paper-5")){
            myPDFViewer.fromAsset("B5.pdf").load();
        }
        if (getItem.equals("Paper-6")){
            myPDFViewer.fromAsset("B6.pdf").load();
        }
        if (getItem.equals("Paper-7")){
            myPDFViewer.fromAsset("B7.pdf").load();
        }
        if (getItem.equals("Paper-8")){
            myPDFViewer.fromAsset("B8.pdf").load();
        }
        if (getItem.equals("Paper-9")){
            myPDFViewer.fromAsset("B9.pdf").load();
        }
        if (getItem.equals("Paper-10")){
            myPDFViewer.fromAsset("B10.pdf").load();
        }
        if (getItem.equals("Paper-11")){
            myPDFViewer.fromAsset("B11.pdf").load();
        }
        if (getItem.equals("Paper-12")){
            myPDFViewer.fromAsset("B12.pdf").load();
        }
        if (getItem.equals("Paper-13")){
            myPDFViewer.fromAsset("B13.pdf").load();
        }

        if (getItem.equals("Paper-14")){
            myPDFViewer.fromAsset("B14.pdf").load();
        }
        if (getItem.equals("Paper-15")){
            myPDFViewer.fromAsset("B15.pdf").load();
        }



    }
}