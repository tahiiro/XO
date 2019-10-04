package com.example.jeuxxo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mobil2 extends AppCompatActivity {
    private ImageButton b1;
    private ImageButton b2;
    private ImageButton b3;
    private ImageButton b4;
    private ImageButton b5;
    private ImageButton b6;
    private ImageButton b7;
    private ImageButton b8;
    private ImageButton b9;
    Button restart;
    Button again;
    String []cb=new String[10];
    int premj=1;
    int tst3;


    public void open1(){
        Intent inte=new Intent(this,sratrt.class);
        startActivities(new Intent[]{inte});
    }
    public void open2(){                                                    // set action for  restart the game
        Intent inte=new Intent(this,mobil2.class);
        startActivities(new Intent[]{inte});
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobil2);

        b1=(ImageButton)findViewById(R.id.b1);
        b2=(ImageButton)findViewById(R.id.b2);
        b3=(ImageButton)findViewById(R.id.b3);
        b4=(ImageButton)findViewById(R.id.b4);
        b5=(ImageButton)findViewById(R.id.b5);
        b6=(ImageButton)findViewById(R.id.b6);
        b7=(ImageButton)findViewById(R.id.b7);
        b8=(ImageButton)findViewById(R.id.b8);
        b9=(ImageButton)findViewById(R.id.b9);
        restart=(Button)findViewById(R.id.restart);
        again=(Button)findViewById(R.id.again);

        for(int i=0;i<10;i++){
            cb[i]="";
        }


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setImageResource(R.drawable.imgxmdpi);
                cb[1]="x";

                if(premj==1){
                    b5.setImageResource(R.drawable.imgomdpi);
                    b5.setEnabled(false);
                    cb[5]="o";
                }
                else{
                    if(premj==2){
                            if(cb[2]=="x"){
                                b3.setImageResource(R.drawable.imgomdpi);
                                b3.setEnabled(false);
                                cb[3]="o";
                                tst3=1;
                            }
                            else{
                                if(cb[3]=="x"){
                                    b2.setImageResource(R.drawable.imgomdpi);
                                    b2.setEnabled(false);
                                    cb[2]="o";
                                    tst3=2;
                                }

                                else{
                                    if(cb[4]=="x"){
                                        b7.setImageResource(R.drawable.imgomdpi);
                                        b7.setEnabled(false);
                                        cb[7]="o";
                                        tst3=3;
                                    }
                                    else{
                                        if(cb[6]=="x"){
                                            b3.setImageResource(R.drawable.imgomdpi);
                                            b3.setEnabled(false);
                                            cb[3]="o";
                                            tst3=4;
                                        }
                                        else{
                                            if(cb[7]=="x"){
                                                b4.setImageResource(R.drawable.imgomdpi);
                                                b4.setEnabled(false);
                                                cb[4]="o";
                                                tst3=5;
                                            }
                                            else{
                                                if(cb[8]=="x"){
                                                    b7.setImageResource(R.drawable.imgomdpi);
                                                    b7.setEnabled(false);
                                                    cb[7]="o";
                                                    tst3=6;
                                                }
                                                else{
                                                    if(cb[9]=="x"){
                                                        if(Math.random()<0.5){
                                                            b6.setImageResource(R.drawable.imgomdpi);
                                                            b6.setEnabled(false);
                                                            cb[6]="o";
                                                            tst3=7;
                                                        }
                                                        else{
                                                            b4.setImageResource(R.drawable.imgomdpi);
                                                            b4.setEnabled(false);
                                                            cb[4]="o";
                                                            tst3=8;
                                                        }
                                                    }
                                                    else{
                                                        if(cb[5]=="x"){
                                                            if(cb[9]=="o"){
                                                                if(Math.random()<0.5){
                                                                    b3.setImageResource(R.drawable.imgomdpi);
                                                                    b3.setEnabled(false);
                                                                    cb[3]="o";
                                                                    tst3=9;
                                                                }
                                                                else{
                                                                    b7.setImageResource(R.drawable.imgomdpi);
                                                                    b7.setEnabled(false);
                                                                    cb[7]="o";
                                                                    tst3=10;
                                                                }
                                                            }
                                                            else {
                                                                b9.setImageResource(R.drawable.imgomdpi);
                                                                b9.setEnabled(false);
                                                                cb[9] = "o";
                                                                tst3=11;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                        }
                    }
                    else{
                        if(premj==3){

                        }
                    }

                }
                premj=premj+1;
                b1.setEnabled(false);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2.setImageResource(R.drawable.imgxmdpi);
                cb[2]="x";
                if(premj==1){
                    b5.setImageResource(R.drawable.imgomdpi);
                    b5.setEnabled(false);
                    cb[5]="o";
                }
                else{
                    if(premj==2){
                        if(cb[1]=="x"){
                            b3.setImageResource(R.drawable.imgomdpi);
                            b3.setEnabled(false);
                            cb[3]="o";
                            tst3=12;
                        }
                        else{
                            if(cb[3]=="x"){
                                b1.setImageResource(R.drawable.imgomdpi);
                                b1.setEnabled(false);
                                cb[1]="o";
                                tst3=13;
                            }
                            else{
                                if(cb[5]=="x"){
                                    b8.setImageResource(R.drawable.imgomdpi);
                                    b8.setEnabled(false);
                                    cb[8]="o";
                                    tst3=14;
                                }
                                else{
                                    if(cb[4]=="x"){
                                        b1.setImageResource(R.drawable.imgomdpi);
                                        b1.setEnabled(false);
                                        cb[1]="o";
                                        tst3=15;
                                    }
                                    else{
                                        if(cb[6]=="x"){
                                            b3.setImageResource(R.drawable.imgomdpi);
                                            b3.setEnabled(false);
                                            cb[3]="o";
                                            tst3=16;
                                        }
                                        else{
                                            if(cb[7]=="x"){
                                                b3.setImageResource(R.drawable.imgomdpi);
                                                b3.setEnabled(false);
                                                cb[3]="o";
                                                tst3=17;
                                            }
                                            else {
                                                if(cb[8]=="x"){
                                                    if(Math.random()>0.5) {
                                                        if (Math.random() > 0.5) {
                                                            b3.setImageResource(R.drawable.imgomdpi);
                                                            b3.setEnabled(false);
                                                            cb[3] = "o";
                                                            tst3=18;
                                                        } else {
                                                            b1.setImageResource(R.drawable.imgomdpi);
                                                            b1.setEnabled(false);
                                                            cb[1] = "o";
                                                            tst3=19;
                                                        }
                                                    }
                                                    else{
                                                        if (Math.random()>0.5) {
                                                            b4.setImageResource(R.drawable.imgomdpi);
                                                            b4.setEnabled(false);
                                                            cb[4]="o";
                                                            tst3=20;
                                                        }
                                                        else{
                                                            b6.setImageResource(R.drawable.imgomdpi);
                                                            b6.setEnabled(false);
                                                            cb[6]="o";
                                                            tst3=21;
                                                        }
                                                    }
                                                }
                                                else{
                                                    if (cb[9]=="x"){
                                                        b1.setImageResource(R.drawable.imgomdpi);
                                                        b1.setEnabled(false);
                                                        cb[1]="o";
                                                        tst3=22;
                                                    }

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                premj=premj+1;
                b2.setEnabled(false);
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3.setImageResource(R.drawable.imgxmdpi);
                cb[3]="x";
                if(premj==1){
                    b5.setImageResource(R.drawable.imgomdpi);
                    b5.setEnabled(false);
                    cb[5]="o";

                }
                else{
                    if(premj==2) {
                        if (cb[1] == "x") {
                            b2.setImageResource(R.drawable.imgomdpi);
                            b2.setEnabled(false);
                            cb[2] = "o";
                            tst3=23;
                        } else {
                            if (cb[2] == "x") {
                                b1.setImageResource(R.drawable.imgomdpi);
                                b1.setEnabled(false);
                                cb[1] = "o";
                                tst3=24;
                            } else {
                                if (cb[4]=="x"){
                                    b1.setImageResource(R.drawable.imgomdpi);
                                    b1.setEnabled(false);
                                    cb[1]="o";
                                    tst3=25;
                                }
                                if(cb[5]=="x"){
                                    if(cb[7]=="o"){
                                        if(Math.random()>0.5) {
                                            b9.setImageResource(R.drawable.imgomdpi);
                                            b9.setEnabled(false);
                                            cb[9] = "o";
                                            tst3=26;
                                        }
                                        else{
                                            b1.setImageResource(R.drawable.imgomdpi);
                                            b1.setEnabled(false);
                                            cb[1]="o";
                                            tst3=27;
                                        }
                                    }
                                    else{
                                        if(cb[1]=="o"){
                                            b7.setImageResource(R.drawable.imgomdpi);
                                            b7.setEnabled(false);
                                            cb[7]="o";
                                            tst3=28;
                                        }
                                        if (cb[9]=="o"){
                                            b7.setImageResource(R.drawable.imgomdpi);
                                            b7.setEnabled(false);
                                            cb[7]="o";
                                            tst3=29;
                                        }
                                    }

                                }
                                else{
                                    if(cb[6]=="x"){
                                        b9.setImageResource(R.drawable.imgomdpi);
                                        b9.setEnabled(false);
                                        cb[9]="o";
                                        tst3=30;
                                    }
                                    else{
                                        if(cb[7]=="x"){
                                            if(Math.random()>0.5){
                                                b4.setImageResource(R.drawable.imgomdpi);
                                                b4.setEnabled(false);
                                                cb[4]="o";
                                                tst3=31;
                                            }
                                            else{
                                                b6.setImageResource(R.drawable.imgomdpi);
                                                b6.setEnabled(false);
                                                cb[6]="o";
                                                tst3=32;
                                            }
                                        }
                                        else{
                                            if (cb[8]=="x"){
                                                b9.setImageResource(R.drawable.imgomdpi);
                                                b9.setEnabled(false);
                                                cb[9]="o";
                                                tst3=33;
                                            }
                                            else{
                                                if (cb[9]=="x"){
                                                    b6.setImageResource(R.drawable.imgomdpi);
                                                    b6.setEnabled(false);
                                                    cb[6]="o";
                                                    tst3=34;
                                                }
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
                premj=premj+1;
                b3.setEnabled(false);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4.setImageResource(R.drawable.imgxmdpi);
                cb[4]="x";
                if(premj==1){
                    b5.setImageResource(R.drawable.imgomdpi);
                    b5.setEnabled(false);
                    cb[5]="o";

                }
                else {

                    if (premj == 2) {

                        if(cb[1]=="x"){
                            b7.setImageResource(R.drawable.imgomdpi);
                            b7.setEnabled(false);
                            cb[7]="o";
                            tst3=35;
                        }
                        else{
                            if(cb[2]=="x"){
                                b1.setImageResource(R.drawable.imgomdpi);
                                b1.setEnabled(false);
                                cb[1]="o";
                                tst3=36;
                            }
                            else{
                                if(cb[3]=="x"){
                                    if(Math.random()>0.5){
                                        if (Math.random()>0.5){
                                            b1.setImageResource(R.drawable.imgomdpi);
                                            b1.setEnabled(false);
                                            cb[1]="o";
                                            tst3=37;
                                        }
                                        else{
                                            b2.setImageResource(R.drawable.imgomdpi);
                                            b2.setEnabled(false);
                                            cb[2]="o";
                                            tst3=38;
                                        }
                                    }
                                    else{
                                        b8.setImageResource(R.drawable.imgomdpi);
                                        b8.setEnabled(false);
                                        cb[8]="o";
                                        tst3=39;
                                    }
                                }
                                else{
                                    if(cb[5]=="x"){
                                        b6.setImageResource(R.drawable.imgomdpi);
                                        b6.setEnabled(false);
                                        cb[6]="o";
                                        tst3=40;
                                    }
                                    else{
                                        if(cb[6]=="x"){
                                            if(Math.random()>0.5){
                                                if(Math.random()>0.5){
                                                    if (Math.random()>0.5){
                                                        b1.setImageResource(R.drawable.imgomdpi);
                                                        b1.setEnabled(false);
                                                        cb[1]="o";
                                                        tst3=41;
                                                    }
                                                    else{
                                                        b2.setImageResource(R.drawable.imgomdpi);
                                                        b2.setEnabled(false);
                                                        cb[2]="o";
                                                        tst3=42;
                                                    }
                                                }
                                                else{
                                                    b3.setImageResource(R.drawable.imgomdpi);
                                                    b3.setEnabled(false);
                                                    cb[3]="o";
                                                    tst3=43;
                                                }
                                            }
                                            else{
                                                if(Math.random()>0.5){
                                                    if(Math.random()>0.5){
                                                        b7.setImageResource(R.drawable.imgomdpi);
                                                        b7.setEnabled(false);
                                                        cb[7]="o";
                                                        tst3=44;
                                                    }
                                                    else{
                                                        b8.setImageResource(R.drawable.imgomdpi);
                                                        b8.setEnabled(false);
                                                        cb[8]="o";
                                                        tst3=45;
                                                    }
                                                }
                                                else{
                                                    b9.setImageResource(R.drawable.imgomdpi);
                                                    b9.setEnabled(false);
                                                    cb[9]="o";
                                                    tst3=46;
                                                }
                                            }
                                        }
                                        else{
                                            if (cb[7]=="x"){
                                                b1.setImageResource(R.drawable.imgomdpi);
                                                b1.setEnabled(false);
                                                cb[1]="o";
                                                tst3=47;
                                            }
                                            else{
                                                if(cb[8]=="x"){
                                                    b7.setImageResource(R.drawable.imgomdpi);
                                                    b7.setEnabled(false);
                                                    cb[7]="o";
                                                    tst3=48;
                                                }
                                                else{
                                                    if(cb[9]=="x"){
                                                        b7.setImageResource(R.drawable.imgomdpi);
                                                        b7.setEnabled(false);
                                                        cb[7]="o";
                                                        tst3=49;
                                                    }
                                                }
                                            }

                                        }
                                    }
                                }
                            }
                        }

                    }
                }
                premj=premj+1;
                b4.setEnabled(false);
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5.setImageResource(R.drawable.imgxmdpi);
                cb[5]="x";
                double rando=Math.random();
                if(rando>0.25&&rando<0.45){
                    b1.setImageResource(R.drawable.imgomdpi);
                    cb[1]="o";
                    b1.setEnabled(false);
                }
                else{
                    if(rando>=0.45&&rando<0.65){
                        b3.setImageResource(R.drawable.imgomdpi);
                        cb[3]="o";
                        b3.setEnabled(false);
                    }
                    else{
                        if(rando>=0.65&&rando<0.80){
                            b7.setImageResource(R.drawable.imgomdpi);
                            cb[7]="o";
                            b7.setEnabled(false);
                        }
                        else{
                            b9.setImageResource(R.drawable.imgomdpi);
                            cb[9]="o";
                            b9.setEnabled(false);
                        }
                    }
                }
                b5.setEnabled(false);
                premj=premj+1;
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6.setImageResource(R.drawable.imgxmdpi);
                cb[6]="x";
                if(premj==1){
                    b5.setImageResource(R.drawable.imgomdpi);
                    cb[5]="o";
                    b5.setEnabled(false);

                }
                if (premj==2){
                    if(cb[1]=="x"){
                        b3.setImageResource(R.drawable.imgomdpi);
                        b3.setEnabled(false);
                        cb[3]="o";
                        tst3=50;
                    }
                    else{
                        if(cb[2]=="x"){
                            b3.setImageResource(R.drawable.imgomdpi);
                            b3.setEnabled(false);
                            cb[3]="o";
                            tst3=51;
                        }
                        else{
                            if(cb[3]=="x"){
                                b9.setImageResource(R.drawable.imgomdpi);
                                b9.setEnabled(false);
                                cb[9]="o";
                                tst3=52;
                            }
                            else{
                                if (cb[4]=="x"){
                                    if(Math.random()>0.5){
                                        b7.setImageResource(R.drawable.imgomdpi);
                                        b7.setEnabled(false);
                                        cb[7]="o";
                                        tst3=53;
                                    }
                                    else{
                                        b9.setImageResource(R.drawable.imgomdpi);
                                        b9.setEnabled(false);
                                        cb[9]="o";
                                        tst3=54;
                                    }

                                }
                                else{
                                    if (cb[5]=="x"){
                                        b4.setImageResource(R.drawable.imgomdpi);
                                        b4.setEnabled(false);
                                        cb[4]="o";
                                        tst3=55;
                                    }
                                    else{
                                        if(cb[7]=="x"){
                                            b8.setImageResource(R.drawable.imgomdpi);
                                            b8.setEnabled(false);
                                            cb[8]="o";
                                            tst3=56;
                                        }
                                        else{
                                            if(cb[8]=="x"){
                                                b9.setImageResource(R.drawable.imgomdpi);
                                                b9.setEnabled(false);
                                                cb[9]="o";
                                                tst3=57;
                                            }
                                            else{
                                                if(cb[9]=="x"){
                                                    b3.setImageResource(R.drawable.imgomdpi);
                                                    b3.setEnabled(false);
                                                    cb[3]="o";
                                                    tst3=58;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                premj=premj+1;
                b6.setEnabled(false);
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7.setImageResource(R.drawable.imgxmdpi);
                cb[7]="x";
                if(premj==1){
                    b5.setImageResource(R.drawable.imgomdpi);
                    cb[5]="o";
                    b5.setEnabled(false);

                }
                else{
                    if(premj==2){
                        if(cb[1]=="x"){
                            b4.setImageResource(R.drawable.imgomdpi);
                            b4.setEnabled(false);
                            cb[4]="o";
                            tst3=59;
                        }
                        else{
                            if(cb[2]=="x"){
                                if(Math.random()>0.5){
                                    b4.setImageResource(R.drawable.imgomdpi);
                                    b4.setEnabled(false);
                                    cb[4]="o";
                                    tst3=60;
                                }
                                else{
                                    b6.setImageResource(R.drawable.imgomdpi);
                                    b6.setEnabled(false);
                                    cb[6]="o";
                                    tst3=61;

                                }
                            }
                            else{
                                if(cb[3]=="x"){
                                    if(Math.random()>0.5){
                                        b4.setImageResource(R.drawable.imgomdpi);
                                        b4.setEnabled(false);
                                        cb[4]="o";
                                        tst3=62;
                                    }
                                    else{
                                        b6.setImageResource(R.drawable.imgomdpi);
                                        b6.setEnabled(false);
                                        cb[6]="o";
                                        tst3=63;
                                    }
                            }
                                if(cb[4]=="x"){
                                    b1.setImageResource(R.drawable.imgomdpi);
                                    b1.setEnabled(false);
                                    cb[1]="o";
                                    tst3=64;
                                }
                                else{
                                    if(cb[5]=="x"){
                                        if (cb[3]=="o"){
                                            b1.setImageResource(R.drawable.imgomdpi);
                                            b1.setEnabled(false);
                                            cb[1]="o";
                                            tst3=65;
                                        }
                                        else{
                                            b3.setImageResource(R.drawable.imgomdpi);
                                            b3.setEnabled(false);
                                            cb[3]="o";
                                            tst3=66;
                                        }
                                    }
                                    else{
                                        if(cb[6]=="x"){
                                            b9.setImageResource(R.drawable.imgomdpi);
                                            b9.setEnabled(false);
                                            cb[9]="o";
                                            tst3=67;
                                        }
                                        else{
                                            if(cb[8]=="x"){
                                                b9.setImageResource(R.drawable.imgomdpi);
                                                b9.setEnabled(false);
                                                cb[9]="o";
                                                tst3=68;
                                            }
                                            else{
                                                if(cb[9]=="x"){
                                                    b8.setImageResource(R.drawable.imgomdpi);
                                                    b8.setEnabled(false);
                                                    cb[8]="o";
                                                    tst3=69;
                                                }
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
                premj=premj+1;
                b7.setEnabled(false);
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b8.setImageResource(R.drawable.imgxmdpi);
                cb[8]="x";
                if(premj==1){
                    b5.setImageResource(R.drawable.imgomdpi);
                    cb[5]="o";
                    b5.setEnabled(false);

                }
                else{
                    if(premj==2){
                        if(cb[1]=="x"){
                            if(Math.random()>0.5){
                                b4.setImageResource(R.drawable.imgomdpi);
                                b4.setEnabled(false);
                                cb[4]="o";
                                tst3=70;
                            }
                            else{
                                b6.setImageResource(R.drawable.imgomdpi);
                                b6.setEnabled(false);
                                cb[6]="o";
                                tst3=71;
                            }
                        }
                        else{
                            if(cb[2]=="x"){
                                if(Math.random()>0.5){
                                    b1.setImageResource(R.drawable.imgomdpi);
                                    b1.setEnabled(false);
                                    cb[1]="o";
                                    tst3=72;
                                }
                                else{
                                    b3.setImageResource(R.drawable.imgomdpi);
                                    b3.setEnabled(false);
                                    cb[3]="o";
                                    tst3=73;
                                }
                            }
                            else{
                                if(cb[3]=="x"){
                                    b6.setImageResource(R.drawable.imgomdpi);
                                    b6.setEnabled(false);
                                    cb[6]="o";
                                    tst3=74;
                                }
                                else{
                                    if (cb[4]=="4"){
                                        b7.setImageResource(R.drawable.imgomdpi);
                                        b7.setEnabled(false);
                                        cb[7]="o";
                                        tst3=75;
                                    }
                                    else{
                                        if (cb[5]=="x"){
                                            b2.setImageResource(R.drawable.imgomdpi);
                                            b2.setEnabled(false);
                                            cb[2]="o";
                                            tst3=76;
                                        }
                                        else{
                                            if (cb[6]=="x"){
                                                b9.setImageResource(R.drawable.imgomdpi);
                                                b9.setEnabled(false);
                                                cb[9]="o";
                                                tst3=77;
                                            }
                                            else{
                                                if(cb[7]=="x"){
                                                    b9.setImageResource(R.drawable.imgomdpi);
                                                    b9.setEnabled(false);
                                                    cb[9]="o";
                                                    tst3=78;
                                                }
                                                else{
                                                    if(cb[9]=="x"){
                                                        b7.setImageResource(R.drawable.imgomdpi);
                                                        b7.setEnabled(false);
                                                        cb[7]="o";
                                                        tst3=79;
                                                    }
                                                }

                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                premj=premj+1;
                b8.setEnabled(false);
            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b9.setImageResource(R.drawable.imgxmdpi);
                cb[9]="x";
                if(premj==1){
                    b5.setImageResource(R.drawable.imgomdpi);
                    cb[5]="o";
                    b5.setEnabled(false);
                }
                else {
                    if(premj==2){
                        if(cb[1]=="x"){
                            if(Math.random()>0.5){
                                b4.setImageResource(R.drawable.imgomdpi);
                                b4.setEnabled(false);
                                cb[4]="o";
                                tst3=80;
                            }
                            else{
                                b6.setImageResource(R.drawable.imgomdpi);
                                b6.setEnabled(false);
                                cb[6]="o";
                                tst3=81;
                            }
                        }
                        else{
                            if (cb[2]=="x"){
                                b3.setImageResource(R.drawable.imgomdpi);
                                b3.setEnabled(false);
                                cb[3]="o";
                                tst3=82;
                            }
                            else{
                                if(cb[3]=="x"){
                                    b6.setImageResource(R.drawable.imgomdpi);
                                    b6.setEnabled(false);
                                    cb[6]="o";
                                    tst3=83;
                                }
                                else{
                                    if(cb[4]=="x"){
                                        b7.setImageResource(R.drawable.imgomdpi);
                                        b7.setEnabled(false);
                                        cb[7]="o";
                                        tst3=84;
                                    }
                                    else{
                                        if(cb[5]=="x"){
                                            if (cb[1]=="o") {
                                                if(Math.random()>0.5){
                                                    b3.setImageResource(R.drawable.imgomdpi);
                                                    b3.setEnabled(false);
                                                    cb[3]="o";
                                                    tst3=85;
                                                }
                                                else{
                                                    b7.setImageResource(R.drawable.imgomdpi);
                                                    b7.setEnabled(false);
                                                    cb[7]="o";
                                                    tst3=86;
                                                }
                                            }
                                            else{
                                                b1.setImageResource(R.drawable.imgomdpi);
                                                b1.setEnabled(false);
                                                cb[1]="o";
                                                tst3=87;
                                            }
                                        }
                                        else{
                                            if(cb[6]=="x"){
                                                b3.setImageResource(R.drawable.imgomdpi);
                                                b3.setEnabled(false);
                                                cb[3]="o";
                                                tst3=88;
                                            }
                                            else{
                                                if(cb[7]=="x"){
                                                    b8.setImageResource(R.drawable.imgomdpi);
                                                    b8.setEnabled(false);
                                                    cb[8]="o";
                                                    tst3=89;
                                                }
                                                else{
                                                    if(cb[8]=="x"){
                                                        b7.setImageResource(R.drawable.imgomdpi);
                                                        b7.setEnabled(false);
                                                        cb[7]="o";
                                                        tst3=90;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                premj=premj+1;
                b9.setEnabled(false);
            }
        });



        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open1();

            }
        });
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open2();

            }
        });



    }
}