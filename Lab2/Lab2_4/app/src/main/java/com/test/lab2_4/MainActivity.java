package com.test.lab2_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txt = findViewById(R.id.txt);
        final EditText text_editor = findViewById(R.id.text_editor);
        Button english_button = findViewById(R.id.english_button);
        Button sverige_button = findViewById(R.id.sverige_button);
        Button suomeksi_button = findViewById(R.id.suomeksi_button);
        Button surprise_button = findViewById(R.id.surprise_button);

        english_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("Hello " + text_editor.getText());
            }
        });
        sverige_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("Hejsan " + text_editor.getText());
            }
        });
        suomeksi_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("Terve " + text_editor.getText());
            }
        });
        surprise_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("Hola " + text_editor.getText());
            }
        });
    }
    }

