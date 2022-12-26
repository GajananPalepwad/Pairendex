package com.example.pairendex;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;


public class GamePlay extends AppCompatActivity {
    ImageView i11, i12, i13, i14, i15, i21, i22, i23, i24, i25, i31, i32, i33, i34, i35, i41, i42, i43, i44, i45, i51, i52, i53, i54, i55, i61, i62, i63, i64, i65, i71, i72, i73, i74, i75, i81, i82, i83, i84, i85;
    TextView t1, t2;
    Integer[] cardArray = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220};
                        int i101, i102, i103, i104, i105, i106, i107, i108, i109, i110, i111, i112, i113, i114, i115, i116, i117, i118, i119, i120, i201, i202, i203, i204, i205, i206, i207, i208, i209, i210, i211, i212, i213, i214, i215, i216, i217, i218, i219, i220;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;




    private int sec = 0;
    private boolean isRunning;
    private boolean wasRunning;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);


        if (savedInstanceState != null)
        {

            sec = savedInstanceState.getInt("seconds");
            isRunning = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
        startTimer();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("seconds", sec);
        savedInstanceState.putBoolean("running", isRunning);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }


    @Override
    protected void onPause()
    {
        super.onPause();
        wasRunning = isRunning;
        isRunning = false;
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        if (wasRunning) {
            isRunning = true;
        }
    }

    public void Start()
    {
        isRunning = true;
    }


    public void Stop()
    {
        isRunning = false;
    }

    public void Reset()
    {
        isRunning = false;
        sec = 0;
    }

    private void startTimer()
    {
        final TextView timer = (TextView)findViewById(R.id.timer);

        final Handler hd = new Handler();

        hd.post(new Runnable() {
            @Override

            public void run()
            {
                int hours_var = sec / 3600;
                int minutes_var = (sec % 3600) / 60;
                int secs_var = sec % 60;

                String time_value = String.format(Locale.getDefault(),
                        "%d:%02d:%02d", hours_var, minutes_var, secs_var);

                timer.setText(time_value);

                if (isRunning)
                {
                    sec++;
                }

                hd.postDelayed(this, 1000);
            }
        });
        Start();

























                i11 = findViewById(R.id.imageView11);
                i12 = findViewById(R.id.imageView12);
                i13 = findViewById(R.id.imageView13);
                i14 = findViewById(R.id.imageView14);
                i15 = findViewById(R.id.imageView15);
                i21 = findViewById(R.id.imageView21);
                i22 = findViewById(R.id.imageView22);
                i23 = findViewById(R.id.imageView23);
                i24 = findViewById(R.id.imageView24);
                i25 = findViewById(R.id.imageView25);
                i31 = findViewById(R.id.imageView31);
                i32 = findViewById(R.id.imageView32);
                i33 = findViewById(R.id.imageView33);
                i34 = findViewById(R.id.imageView34);
                i35 = findViewById(R.id.imageView35);
                i41 = findViewById(R.id.imageView41);
                i42 = findViewById(R.id.imageView42);
                i43 = findViewById(R.id.imageView43);
                i44 = findViewById(R.id.imageView44);
                i45 = findViewById(R.id.imageView45);
                i51 = findViewById(R.id.imageView51);
                i52 = findViewById(R.id.imageView52);
                i53 = findViewById(R.id.imageView53);
                i54 = findViewById(R.id.imageView54);
                i55 = findViewById(R.id.imageView55);
                i61 = findViewById(R.id.imageView61);
                i62 = findViewById(R.id.imageView62);
                i63 = findViewById(R.id.imageView63);
                i64 = findViewById(R.id.imageView64);
                i65 = findViewById(R.id.imageView65);
                i71 = findViewById(R.id.imageView71);
                i72 = findViewById(R.id.imageView72);
                i73 = findViewById(R.id.imageView73);
                i74 = findViewById(R.id.imageView74);
                i75 = findViewById(R.id.imageView75);
                i81 = findViewById(R.id.imageView81);
                i82 = findViewById(R.id.imageView82);
                i83 = findViewById(R.id.imageView83);
                i84 = findViewById(R.id.imageView84);
                i85 = findViewById(R.id.imageView85);



            i11.setTag(0);
            i12.setTag(1);
            i13.setTag(2);
            i14.setTag(3);
            i15.setTag(4);
            i21.setTag(5);
            i22.setTag(6);
            i23.setTag(7);
            i24.setTag(8);
            i25.setTag(9);
            i31.setTag(10);
            i32.setTag(11);
            i33.setTag(12);
            i34.setTag(13);
            i35.setTag(14);
            i41.setTag(15);
            i42.setTag(16);
            i43.setTag(17);
            i44.setTag(19);
            i45.setTag(18);
            i51.setTag(20);
            i52.setTag(21);
            i53.setTag(22);
            i54.setTag(23);
            i55.setTag(24);
            i61.setTag(25);
            i62.setTag(26);
            i63.setTag(27);
            i64.setTag(28);
            i65.setTag(29);
            i71.setTag(30);
            i72.setTag(31);
            i73.setTag(32);
            i74.setTag(33);
            i75.setTag(34);
            i81.setTag(35);
            i82.setTag(36);
            i83.setTag(37);
            i84.setTag(38);
            i85.setTag(39);


            frontOfCardResources();

            Collections.shuffle(Arrays.asList(cardArray));


        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i11, theCard);

            }
        });

        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i12, theCard);

            }
        });

        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i13, theCard);

            }
        });

        i14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i14, theCard);

            }
        });

        i15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i15, theCard);

            }
        });

        i21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i21, theCard);

            }
        });

        i22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i22, theCard);

            }
        });

        i23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i23, theCard);

            }
        });

        i24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i24, theCard);

            }
        });

        i25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i25, theCard);

            }
        });

        i31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i31, theCard);

            }
        });

        i32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i32, theCard);

            }
        });

        i33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i33, theCard);

            }
        });

        i34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i34, theCard);

            }
        });

        i35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i35, theCard);

            }
        });

        i41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i41, theCard);

            }
        });

        i42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i42, theCard);

            }
        });

        i43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i43, theCard);

            }
        });

        i44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i44, theCard);

            }
        });

        i45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i45, theCard);

            }
        });

        i51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i51, theCard);

            }
        });

        i52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i52, theCard);

            }
        });

        i53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i53, theCard);

            }
        });

        i54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i54, theCard);

            }
        });

        i55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i55, theCard);

            }
        });

        i61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i61, theCard);

            }
        });

        i62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i62, theCard);

            }
        });

        i63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i63, theCard);

            }
        });

        i64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i64, theCard);

            }
        });

        i65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i65, theCard);

            }
        });

        i71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i71, theCard);

            }
        });

        i72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i72, theCard);

            }
        });

        i73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i73, theCard);

            }
        });

        i74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i74, theCard);

            }
        });

        i75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i75, theCard);

            }
        });

        i81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i81, theCard);

            }
        });

        i82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i82, theCard);

            }
        });

        i83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i83, theCard);

            }
        });

        i84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i84, theCard);

            }
        });

        i85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt(view.getTag().toString());
                doStuff(i85, theCard);

            }
        });
    }

    private void doStuff(ImageView iv, int card){

        if(cardArray[card] == 101){
            iv.setImageResource(i101);
        } else if(cardArray[card] == 102){
            iv.setImageResource(i102);
        }else if(cardArray[card] == 103){
            iv.setImageResource(i103);
        }else if(cardArray[card] == 104){
            iv.setImageResource(i104);
        }else if(cardArray[card] == 105){
            iv.setImageResource(i105);
        }else if(cardArray[card] == 106){
            iv.setImageResource(i106);
        } else if(cardArray[card] == 107){
            iv.setImageResource(i107);
        }else if(cardArray[card] == 108){
            iv.setImageResource(i107);
        }else if(cardArray[card] == 109){
            iv.setImageResource(i109);
        }else if(cardArray[card] == 110){
            iv.setImageResource(i110);
        }else if(cardArray[card] == 111){
            iv.setImageResource(i111);
        } else if(cardArray[card] == 112){
            iv.setImageResource(i112);
        }else if(cardArray[card] == 113){
            iv.setImageResource(i113);
        }else if(cardArray[card] == 114){
            iv.setImageResource(i114);
        }else if(cardArray[card] == 115){
            iv.setImageResource(i115);
        }else if(cardArray[card] == 116){
            iv.setImageResource(i116);
        } else if(cardArray[card] == 117){
            iv.setImageResource(i117);
        }else if(cardArray[card] == 118){
            iv.setImageResource(i118);
        }else if(cardArray[card] == 119){
            iv.setImageResource(i119);
        }else if(cardArray[card] == 120){
            iv.setImageResource(i120);
        }else if(cardArray[card] == 201){
            iv.setImageResource(i201);
        } else if(cardArray[card] == 202){
            iv.setImageResource(i202);
        }else if(cardArray[card] == 203){
            iv.setImageResource(i203);
        }else if(cardArray[card] == 204){
            iv.setImageResource(i204);
        }else if(cardArray[card] == 205){
            iv.setImageResource(i205);
        }else if(cardArray[card] == 206){
            iv.setImageResource(i206);
        } else if(cardArray[card] == 207){
            iv.setImageResource(i207);
        }else if(cardArray[card] == 208){
            iv.setImageResource(i208);
        }else if(cardArray[card] == 209){
            iv.setImageResource(i209);
        }else if(cardArray[card] == 210){
            iv.setImageResource(i210);
        }else if(cardArray[card] == 211){
            iv.setImageResource(i211);
        } else if(cardArray[card] == 212){
            iv.setImageResource(i212);
        }else if(cardArray[card] == 213){
            iv.setImageResource(i213);
        }else if(cardArray[card] == 214){
            iv.setImageResource(i214);
        }else if(cardArray[card] == 215){
            iv.setImageResource(i215);
        }else if(cardArray[card] == 216){
            iv.setImageResource(i216);
        } else if(cardArray[card] == 217){
            iv.setImageResource(i217);
        }else if(cardArray[card] == 218){
            iv.setImageResource(i218);
        }else if(cardArray[card] == 219){
            iv.setImageResource(i219);
        }else if(cardArray[card] == 220){
            iv.setImageResource(i220);
        }

        if(cardNumber == 1){
            firstCard = cardArray[card];
            if(firstCard > 200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;
            iv.setEnabled(false);
        } else if(cardNumber == 2){
            secondCard = cardArray[card];
            if(secondCard > 200){
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            i11.setEnabled(false);
            i12.setEnabled(false);
            i13.setEnabled(false);
            i14.setEnabled(false);
            i15.setEnabled(false);
            i21.setEnabled(false);
            i22.setEnabled(false);
            i23.setEnabled(false);
            i24.setEnabled(false);
            i25.setEnabled(false);
            i31.setEnabled(false);
            i32.setEnabled(false);
            i33.setEnabled(false);
            i34.setEnabled(false);
            i35.setEnabled(false);
            i41.setEnabled(false);
            i42.setEnabled(false);
            i43.setEnabled(false);
            i44.setEnabled(false);
            i45.setEnabled(false);
            i51.setEnabled(false);
            i52.setEnabled(false);
            i53.setEnabled(false);
            i54.setEnabled(false);
            i55.setEnabled(false);
            i61.setEnabled(false);
            i62.setEnabled(false);
            i63.setEnabled(false);
            i64.setEnabled(false);
            i65.setEnabled(false);
            i71.setEnabled(false);
            i72.setEnabled(false);
            i73.setEnabled(false);
            i74.setEnabled(false);
            i75.setEnabled(false);
            i81.setEnabled(false);
            i82.setEnabled(false);
            i83.setEnabled(false);
            i84.setEnabled(false);
            i85.setEnabled(false);

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            };
            Handler handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(runnable, 700);

        }

    }

    private void calculate(){

        if(firstCard == secondCard){
            if(clickedFirst == 0){
                i11.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 1){
                i12.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 2){
                i13.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 3){
                i14.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 4){
                i15.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 5){
                i21.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 6){
                i22.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 7){
                i23.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 8){
                i24.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 9){
                i25.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 10){
                i31.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 11){
                i32.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 12){
                i33.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 13){
                i34.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 14){
                i35.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 15){
                i41.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 16){
                i42.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 17){
                i43.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 18){
                i44.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 19){
                i45.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 20){
                i51.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 21){
                i52.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 22){
                i53.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 23){
                i54.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 24){
                i55.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 25){
                i61.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 26){
                i62.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 27){
                i63.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 28){
                i64.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 29){
                i65.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 30){
                i71.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 31){
                i72.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 32){
                i73.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 33){
                i74.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 34){
                i75.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 35){
                i81.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 36){
                i82.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 37){
                i83.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 38){
                i84.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 39){
                i85.setVisibility(View.INVISIBLE);
            }

            if(clickedSecond == 0){
                i11.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 1){
                i12.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 2){
                i13.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 3){
                i14.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 4){
                i15.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 5){
                i21.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 6){
                i22.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 7){
                i23.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 8){
                i24.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 9){
                i25.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 10){
                i31.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 11){
                i32.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 12){
                i33.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 13){
                i34.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 14){
                i35.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 15){
                i41.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 16){
                i42.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 17){
                i43.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 18){
                i44.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 19){
                i45.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 20){
                i51.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 21){
                i52.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 22){
                i53.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 23){
                i54.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 24){
                i55.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 25){
                i61.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 26){
                i62.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 27){
                i63.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 28){
                i64.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 29){
                i65.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 30){
                i71.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 31){
                i72.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 32){
                i73.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 33){
                i74.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 34){
                i75.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 35){
                i81.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 36){
                i82.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 37){
                i83.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 38){
                i84.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 39){
                i85.setVisibility(View.INVISIBLE);
            }

        } else {
            i11.setImageResource(R.drawable.card_min);
            i12.setImageResource(R.drawable.card_min);
            i13.setImageResource(R.drawable.card_min);
            i14.setImageResource(R.drawable.card_min);
            i15.setImageResource(R.drawable.card_min);
            i21.setImageResource(R.drawable.card_min);
            i22.setImageResource(R.drawable.card_min);
            i23.setImageResource(R.drawable.card_min);
            i24.setImageResource(R.drawable.card_min);
            i25.setImageResource(R.drawable.card_min);
            i31.setImageResource(R.drawable.card_min);
            i32.setImageResource(R.drawable.card_min);
            i33.setImageResource(R.drawable.card_min);
            i34.setImageResource(R.drawable.card_min);
            i35.setImageResource(R.drawable.card_min);
            i41.setImageResource(R.drawable.card_min);
            i42.setImageResource(R.drawable.card_min);
            i43.setImageResource(R.drawable.card_min);
            i44.setImageResource(R.drawable.card_min);
            i45.setImageResource(R.drawable.card_min);
            i51.setImageResource(R.drawable.card_min);
            i52.setImageResource(R.drawable.card_min);
            i53.setImageResource(R.drawable.card_min);
            i54.setImageResource(R.drawable.card_min);
            i55.setImageResource(R.drawable.card_min);
            i61.setImageResource(R.drawable.card_min);
            i62.setImageResource(R.drawable.card_min);
            i63.setImageResource(R.drawable.card_min);
            i64.setImageResource(R.drawable.card_min);
            i65.setImageResource(R.drawable.card_min);
            i71.setImageResource(R.drawable.card_min);
            i72.setImageResource(R.drawable.card_min);
            i73.setImageResource(R.drawable.card_min);
            i74.setImageResource(R.drawable.card_min);
            i75.setImageResource(R.drawable.card_min);
            i81.setImageResource(R.drawable.card_min);
            i82.setImageResource(R.drawable.card_min);
            i83.setImageResource(R.drawable.card_min);
            i84.setImageResource(R.drawable.card_min);
            i85.setImageResource(R.drawable.card_min);


        }

        i11.setEnabled(true);
        i12.setEnabled(true);
        i13.setEnabled(true);
        i14.setEnabled(true);
        i15.setEnabled(true);
        i21.setEnabled(true);
        i22.setEnabled(true);
        i23.setEnabled(true);
        i24.setEnabled(true);
        i25.setEnabled(true);
        i31.setEnabled(true);
        i32.setEnabled(true);
        i33.setEnabled(true);
        i34.setEnabled(true);
        i35.setEnabled(true);
        i41.setEnabled(true);
        i42.setEnabled(true);
        i43.setEnabled(true);
        i44.setEnabled(true);
        i45.setEnabled(true);
        i51.setEnabled(true);
        i52.setEnabled(true);
        i53.setEnabled(true);
        i54.setEnabled(true);
        i55.setEnabled(true);
        i61.setEnabled(true);
        i62.setEnabled(true);
        i63.setEnabled(true);
        i64.setEnabled(true);
        i65.setEnabled(true);
        i71.setEnabled(true);
        i72.setEnabled(true);
        i73.setEnabled(true);
        i74.setEnabled(true);
        i75.setEnabled(true);
        i81.setEnabled(true);
        i82.setEnabled(true);
        i83.setEnabled(true);
        i84.setEnabled(true);
        i85.setEnabled(true);

        //checkEnd();
    }

    private void checkEnd(){
        if (i11.getVisibility() == View.INVISIBLE &&
                i11.getVisibility() == View.INVISIBLE &&
                i12.getVisibility() == View.INVISIBLE &&
                i13.getVisibility() == View.INVISIBLE &&
                i14.getVisibility() == View.INVISIBLE &&
                i15.getVisibility() == View.INVISIBLE &&
                i21.getVisibility() == View.INVISIBLE &&
                i22.getVisibility() == View.INVISIBLE &&
                i23.getVisibility() == View.INVISIBLE &&
                i24.getVisibility() == View.INVISIBLE &&
                i25.getVisibility() == View.INVISIBLE &&
                i31.getVisibility() == View.INVISIBLE &&
                i32.getVisibility() == View.INVISIBLE &&
                i33.getVisibility() == View.INVISIBLE &&
                i34.getVisibility() == View.INVISIBLE &&
                i35.getVisibility() == View.INVISIBLE &&
                i41.getVisibility() == View.INVISIBLE &&
                i42.getVisibility() == View.INVISIBLE &&
                i43.getVisibility() == View.INVISIBLE &&
                i44.getVisibility() == View.INVISIBLE &&
                i45.getVisibility() == View.INVISIBLE &&
                i51.getVisibility() == View.INVISIBLE &&
                i52.getVisibility() == View.INVISIBLE &&
                i53.getVisibility() == View.INVISIBLE &&
                i54.getVisibility() == View.INVISIBLE &&
                i55.getVisibility() == View.INVISIBLE &&
                i61.getVisibility() == View.INVISIBLE &&
                i62.getVisibility() == View.INVISIBLE &&
                i63.getVisibility() == View.INVISIBLE &&
                i64.getVisibility() == View.INVISIBLE &&
                i65.getVisibility() == View.INVISIBLE &&
                i71.getVisibility() == View.INVISIBLE &&
                i72.getVisibility() == View.INVISIBLE &&
                i73.getVisibility() == View.INVISIBLE &&
                i74.getVisibility() == View.INVISIBLE &&
                i75.getVisibility() == View.INVISIBLE &&
                i81.getVisibility() == View.INVISIBLE &&
                i82.getVisibility() == View.INVISIBLE &&
                i83.getVisibility() == View.INVISIBLE &&
                i84.getVisibility() == View.INVISIBLE &&
                i85.getVisibility() == View.INVISIBLE){

            Stop();

        }




    }

    private void frontOfCardResources(){
        i101 = R.drawable.component_15;
                i102= R.drawable.component_16;
        i103= R.drawable.component_17;
                i104= R.drawable.component_18;
        i105= R.drawable.component_19;
                i106= R.drawable.component_20;
        i107= R.drawable.component_21;
                i108= R.drawable.component_22;
        i109= R.drawable.component_23;
                i110= R.drawable.component_24;
        i111= R.drawable.component_25;
                i112= R.drawable.component_26;
        i113= R.drawable.component_27;
                i114= R.drawable.component_28;
        i115= R.drawable.component_29;
                i116= R.drawable.component_30;
        i117= R.drawable.component_31;
                i118= R.drawable.component_32;
        i119= R.drawable.component_33;
                i120= R.drawable.component_34;
        i201= R.drawable.component_15___copy;
                i202= R.drawable.component_16___copy;
        i203= R.drawable.component_17___copy;
                i204= R.drawable.component_18___copy;
        i205= R.drawable.component_19___copy;
                i206= R.drawable.component_20___copy;
        i207= R.drawable.component_21___copy;
                i208= R.drawable.component_22___copy;
        i209= R.drawable.component_23___copy;
                i210= R.drawable.component_24___copy;
        i211= R.drawable.component_25___copy;
                 i212= R.drawable.component_26___copy;
                 i213= R.drawable.component_27___copy;
        i214= R.drawable.component_28___copy;
        i215 = R.drawable.component_29___copy;
                i216= R.drawable.component_30___copy;
        i217= R.drawable.component_31___copy;
                i218= R.drawable.component_32___copy;
        i219= R.drawable.component_33___copy;
                i220= R.drawable.component_34___copy;



    }


}