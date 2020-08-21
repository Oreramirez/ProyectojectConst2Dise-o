package com.example.rikuwaapp.Vista.Fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.rikuwaapp.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class PdfViewCliente extends AppCompatActivity {
    PDFView testpdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view_cliente);

        testpdf = findViewById(R.id.pdfviewer2);
        testpdf.fromAsset("pdfcliente.pdf")
                .defaultPage(0)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(2)
                .load();

    }
}