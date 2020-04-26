package com.test.lab3_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private SoundPool soundPool;
    public ImageView bear1, elephant1, lamb1, wolf1, huuhkaja1, peippo1, peukaloinen1, punatulkku1;
    public int bear, elephant, lamb, wolf, huuhkaja, peippo, peukaloinen, punatulkku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bear1 = findViewById(R.id.bear1);
        elephant1 = findViewById(R.id.elephant1);
        lamb1 = findViewById(R.id.lamb1);
        wolf1 = findViewById(R.id.wolf1);
        huuhkaja1 = findViewById(R.id.huuhkaja1);
        peippo1 = findViewById(R.id.peippo1);
        peukaloinen1 = findViewById(R.id.peukaloinen1);
        punatulkku1 = findViewById(R.id.punatulkku1);


        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        soundPool = new SoundPool.Builder()
                .setMaxStreams(1)
                .setAudioAttributes(audioAttributes)
                .build();

        bear = soundPool.load( this, R.raw.bear, 1);
        elephant = soundPool.load( this, R.raw.elephant, 1);
        lamb = soundPool.load( this, R.raw.lamb, 1);
        wolf = soundPool.load( this, R.raw.wolf, 1);
        huuhkaja = soundPool.load( this, R.raw.huuhkaja_norther_eagle_owl, 1);
        peippo = soundPool.load( this, R.raw.peippo_chaffinch, 1);
        peukaloinen = soundPool.load( this, R.raw.peukaloinen_wren, 1);
        punatulkku = soundPool.load( this, R.raw.punatulkku_northern_bullfinch, 1);
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.mammals1) {
            setContentView(R.layout.layout3);
        }else if(item.getItemId() == R.id.birds1) {
           setContentView(R.layout.layout2);
        }else{
            return super.onOptionsItemSelected(item);
        }
        return true;
    }

    public void play(View v) {
        switch (v.getId()) {
            case R.id.bear1:
                soundPool.play(bear, 1, 1, 0, 0, 1);
                break;
            case R.id.elephant1:
                soundPool.play(elephant, 1, 1, 0, 0, 1);
                break;
            case R.id.lamb1:
                soundPool.play(lamb, 1, 1, 0, 0, 1);
                break;
            case R.id.wolf1:
                soundPool.play(wolf, 1, 1, 0, 0, 1);
                break;
            case R.id.huuhkaja1:
                soundPool.play(huuhkaja, 1, 1, 0, 0, 1);
                break;
            case R.id.peippo1:
                soundPool.play(peippo, 1, 1, 0, 0, 1);
                break;
            case R.id.peukaloinen1:
                soundPool.play(peukaloinen, 1, 1, 0, 0, 1);
                break;
            case R.id.punatulkku1:
                soundPool.play(punatulkku, 1, 1, 0, 0, 1);
                break;
        }
        }

        @Override
    protected void onDestroy() {
    super.onDestroy();
    soundPool.release();
    soundPool = null;
    }
    }


