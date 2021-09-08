package com.ancreators.studygram;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpeners extends AppCompatActivity {
    PDFView myPDFViewer;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_f_openers);

        myPDFViewer = (PDFView) findViewById(R.id.pdfViewer);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("Paper-1")){

            myPDFViewer.fromAsset("S1.pdf").load();
        }

        if (getItem.equals("Paper-2")){
            myPDFViewer.fromAsset("S2.pdf").load();
        }
        if (getItem.equals("Paper-3")){
            myPDFViewer.fromAsset("S3.pdf").load();
        }
        if (getItem.equals("Paper-4")){
            myPDFViewer.fromAsset("S4.pdf").load();
        }
        if (getItem.equals("Paper-5")){
            myPDFViewer.fromAsset("S5.pdf").load();
        }

    }
}