package com.example.rikuwaapp.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rikuwaapp.R;
import com.example.rikuwaapp.Vista.Fragment.PdfViewCliente;

public class ProtocoloActivity extends AppCompatActivity {

    Button button,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protocolo);
        button = findViewById(R.id.gotopdfbtn);
        button3 = findViewById(R.id.gotopdfbtn3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext() , PdfViewActivity.class);
                startActivity(i);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext() , PdfEstadoadmin.class);
                startActivity(i);
            }
        });

    }
}

