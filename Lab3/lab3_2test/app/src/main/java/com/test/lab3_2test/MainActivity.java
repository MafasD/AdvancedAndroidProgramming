package com.test.lab3_2test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void action(View view)
    {
        EditText url = findViewById(R.id.url);

        if(view.getId()==R.id.map)
        {
            Uri location = Uri.parse("geo:0,0?q=OAMK, Kotkantie1, Oulu, ammattikorkeakoulu");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
            startActivity(mapIntent);
        }
        if(view.getId()==R.id.call)
        {
            Uri number = Uri.parse("tel:+358 20 6110200");
            Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
            startActivity(callIntent);
        }
        if(view.getId()==R.id.go)
        {
            Uri webpage = Uri.parse(url.getText().toString());
            Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(webIntent);
        }
    }
}
