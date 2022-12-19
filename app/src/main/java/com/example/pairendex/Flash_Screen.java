package com.example.pairendex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Flash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_screen);

        Thread thread = new Thread() {

            public void run() {
                try {
                    sleep(2500);

                } catch (Exception e) {
                        e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Flash_Screen.this,MainActivity.class);
                    startActivity(intent);

                }
            }
        };thread.start();
    }
}