package com.test.lab2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Button gameButton = new Button(this); gameButton.setText("Hello, I'm the button");

        setContentView(gameButton);
        gameButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter++;
                gameButton.setText("You have clicked the button " + String.valueOf(counter) + " times.");
            }
        });
    }
}
