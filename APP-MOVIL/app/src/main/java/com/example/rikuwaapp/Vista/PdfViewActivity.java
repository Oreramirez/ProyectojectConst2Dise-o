package com.example.rikuwaapp.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

import com.example.rikuwaapp.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class PdfViewActivity extends AppCompatActivity {

    PDFView testpdf;
    PDFView testpdf2;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);

        testpdf = findViewById(R.id.pdfviewer);
        testpdf.fromAsset("pdfadministrador.pdf")
                .defaultPage(0)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(2)
                .load();
        testpdf = findViewById(R.id.pdfviewer2);

    }

    public void VisualizarPdf(){

    }
}