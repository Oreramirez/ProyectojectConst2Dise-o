package com.example.rikuwaapp.Vista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rikuwaapp.R;
import com.example.rikuwaapp.Vista.Fragment.PdfViewCliente;

public class ManualActivity extends AppCompatActivity {
    Button button;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
        button = findViewById(R.id.gotopdfbtn2);
        button3 = findViewById(R.id.gotopdfbtn3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext() , PdfViewCliente.class);
                startActivity(i);
            }
        });

    }
}

