package com.example.pairendex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlayOption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_option);
    }
    public void gotomainmenu(View view){
        Intent intent = new Intent(PlayOption.this,MainActivity.class);
        startActivity(intent);
    }

    public void gotoplayoffline(View view){
        Intent intent = new Intent(PlayOption.this,GamePlay.class);
        startActivity(intent);
    }
}