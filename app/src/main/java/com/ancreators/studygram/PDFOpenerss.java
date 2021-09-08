package com.ancreators.studygram;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpenerss extends AppCompatActivity {
    PDFView myPDFViewer;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_f_openerss);

        myPDFViewer = (PDFView) findViewById(R.id.pdfViewer);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if (getItem.equals("Paper-1")){

            myPDFViewer.fromAsset("SS1.pdf").load();
        }

        if (getItem.equals("Paper-2")){
            myPDFViewer.fromAsset("SS2.pdf").load();
        }
        if (getItem.equals("Paper-3")){
            myPDFViewer.fromAsset("SS3.pdf").load();
        }
        if (getItem.equals("Paper-4")){
            myPDFViewer.fromAsset("SS4.pdf").load();
        }
        if (getItem.equals("Paper-5")){
            myPDFViewer.fromAsset("SS5.pdf").load();
        }
        if (getItem.equals("Paper-6")){
            myPDFViewer.fromAsset("SS6.pdf").load();
        }
        if (getItem.equals("Paper-7")){
            myPDFViewer.fromAsset("SS7.pdf").load();
        }
        if (getItem.equals("Paper-8")){
            myPDFViewer.fromAsset("SS8.pdf").load();
        }
        if (getItem.equals("Paper-9")){
            myPDFViewer.fromAsset("SS9.pdf").load();
        }
        if (getItem.equals("Paper-10")){
            myPDFViewer.fromAsset("SS10.pdf").load();
        }
        if (getItem.equals("Paper-11")){
            myPDFViewer.fromAsset("SS11.pdf").load();
        }
        if (getItem.equals("Paper-12")){
            myPDFViewer.fromAsset("SS12.pdf").load();
        }
        if (getItem.equals("Paper-13")){
            myPDFViewer.fromAsset("SS13.pdf").load();
        }

        if (getItem.equals("Paper-14")){
            myPDFViewer.fromAsset("SS14.pdf").load();
        }
        if (getItem.equals("Paper-15")){
            myPDFViewer.fromAsset("SS15.pdf").load();
        }



    }
}