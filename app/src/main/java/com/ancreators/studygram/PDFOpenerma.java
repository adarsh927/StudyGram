package com.ancreators.studygram;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpenerma extends AppCompatActivity {
    PDFView myPDFViewer;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_f_openers);

        myPDFViewer = (PDFView) findViewById(R.id.pdfViewer);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("Paper-1")){

            myPDFViewer.fromAsset("Marathi.pdf").load();
        }



    }
}