package com.example.pairendex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GamePlay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);
    }

    public void gotobackplayoption(View view){
        Intent intent = new Intent(GamePlay.this,PlayOption.class);
        startActivity(intent);
    }
}