package com.first.pairendex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.first.pairendex.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {

    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }
    public void gotoplaypage(View view){
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.music);
        mediaPlayer.start();
        Intent intent = new Intent(MainActivity.this,GamePlay.class);
        startActivity(intent);
    }

    public void gotoleaderboard(View view){
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.music);
        mediaPlayer.start();
        Intent intent = new Intent(MainActivity.this,LeaderBoard.class);
        startActivity(intent);
    }

    public void gotohelp(View view){
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.music);
        mediaPlayer.start();
        Intent intent = new Intent(MainActivity.this,Help.class);
        startActivity(intent);
    }

    public void gotosetting(View view){
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.music);
        mediaPlayer.start();
        Intent intent = new Intent(MainActivity.this,Settings.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {}
}