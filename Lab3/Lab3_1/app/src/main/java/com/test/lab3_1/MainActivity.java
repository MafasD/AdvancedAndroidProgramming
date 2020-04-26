package com.test.lab3_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    View view;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = this.getWindow().getDecorView();
        txt = findViewById(R.id.txt);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.red) {
           view.setBackgroundResource(R.color.red);
           txt.setText("Red");
        }else if(item.getItemId() == R.id.green) {
            view.setBackgroundResource(R.color.green);
            txt.setText("Green");
        }else if(item.getItemId() == R.id.blue) {
            view.setBackgroundResource(R.color.blue);
            txt.setText("Blue");
        }else if(item.getItemId() == R.id.yellow) {
            view.setBackgroundResource(R.color.yellow);
            txt.setText("Yellow");
        }else{
            return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
