package com.example.rikuwaapp.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.rikuwaapp.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class PdfEstadoadmin extends AppCompatActivity {
    PDFView testpdf3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_estadoadmin);

        testpdf3 = findViewById(R.id.pdfviewer3);
        testpdf3.fromAsset("medidaspreventivas.pdf")
                .defaultPage(0)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(2)
                .load();
    }
}