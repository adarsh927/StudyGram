package com.ancreators.studygram;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpernere extends AppCompatActivity {
    PDFView myPDFViewer;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_f_openerss);

        myPDFViewer = (PDFView) findViewById(R.id.pdfViewer);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("Paper-1")){

            myPDFViewer.fromAsset("E1.pdf").load();
        }

        if (getItem.equals("Paper-2")){
            myPDFViewer.fromAsset("E2.pdf").load();
        }
        if (getItem.equals("Paper-3")){
            myPDFViewer.fromAsset("E3.pdf").load();
        }
        if (getItem.equals("Paper-4")){
            myPDFViewer.fromAsset("E4.pdf").load();
        }
        if (getItem.equals("Paper-5")){
            myPDFViewer.fromAsset("E5.pdf").load();
        }
        if (getItem.equals("Paper-6")){
            myPDFViewer.fromAsset("E6.pdf").load();
        }
        if (getItem.equals("Paper-7")){
            myPDFViewer.fromAsset("E7.pdf").load();
        }
        if (getItem.equals("Paper-8")){
            myPDFViewer.fromAsset("E8.pdf").load();
        }
        if (getItem.equals("Paper-9")){
            myPDFViewer.fromAsset("E9.pdf").load();
        }
        if (getItem.equals("Paper-10")){
            myPDFViewer.fromAsset("E10.pdf").load();
        }
        if (getItem.equals("Paper-11")){
            myPDFViewer.fromAsset("E11.pdf").load();
        }
        if (getItem.equals("Paper-12")){
            myPDFViewer.fromAsset("E12.pdf").load();
        }
        if (getItem.equals("Paper-13")){
            myPDFViewer.fromAsset("E13.pdf").load();
        }

        if (getItem.equals("Paper-14")){
            myPDFViewer.fromAsset("E14.pdf").load();
        }
        if (getItem.equals("Paper-15")){
            myPDFViewer.fromAsset("E15.pdf").load();
        }



    }
}