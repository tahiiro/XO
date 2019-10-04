package com.example.jeuxxo;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton b1;
    private ImageButton b2;
    private ImageButton b3;
    private ImageButton b4;
    private ImageButton b5;
    private ImageButton b6;
    private ImageButton b7;
    private ImageButton b8;
    private ImageButton b9;
    private Button restart;
    private Button again;
    int xo=1;
    String []cb=new String[10];
    String tst;


    public void open2(){                                                    // set action for  restart the game
        Intent inte=new Intent(this,MainActivity.class);
        startActivities(new Intent[]{inte});
    }
    public void open1(){                                                    // set action pour return au debut
        Intent inte=new Intent(this,sratrt.class);
        startActivities(new Intent[]{inte});
    }

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



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

        for(int i=1;i<10;i++){
            cb[i]="";
        }


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xo>0) {
                    cb[1] = "x";
                    tst="x";
                }
                else{
                    cb[1]="o";
                    tst="o";
                }

                play(b1);
                pb1();
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xo>0) {
                    cb[2] = "x";
                    tst="x";
                }
                else{
                    cb[2]="o";
                    tst="o";
                }
                play(b2);
                pb2();
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xo>0) {
                    cb[3] = "x";
                    tst="x";
                }
                else{
                    cb[3]="o";
                    tst="o";
                }
                play(b3);
                pb3();
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xo>0) {
                    cb[4] = "x";
                    tst="x";
                }
                else{
                    cb[4]="o";
                    tst="o";
                }
                play(b4);
                pb4();
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xo>0) {
                    cb[5] = "x";
                    tst="x";
                }
                else{
                    cb[5]="o";
                    tst="o";
                }
                play(b5);
                pb5();
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xo>0) {
                    cb[6] = "x";
                    tst="x";
                }
                else{
                    cb[6]="o";
                    tst="o";
                }
                play(b6);
                pb6();
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xo>0) {
                    cb[7] = "x";
                    tst="x";
                }
                else{
                    cb[7]="o";
                    tst="o";
                }
                    play(b7);
                pb7();
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xo>0) {
                    cb[8] = "x";
                    tst="x";
                }
                else{
                    cb[8]="o";
                    tst="o";
                }
                play(b8);
                pb8();
            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xo>0) {
                    cb[9] = "x";
                    tst="x";
                }
                else{
                    cb[9]="o";
                    tst="o";
                }
                play(b9);
                pb9();
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


    void play(ImageButton b){
        if(xo>0){
            b.setImageResource(R.drawable.imgxmdpi);

        }
        else{
            b.setImageResource(R.drawable.imgomdpi);
        }
        xo=-xo;
        b.setEnabled(false);
    }


    void pb1 (){

        if((cb[2]==tst)&&(cb[3]==tst)){
            if(tst=="x"){
                AffMessage(tst);
            }
            else{
                AffMessage(tst);
            }

        }
        else{
            if((cb[4]==tst)&&(cb[7]==tst)){
                AffMessage(tst);
            }
            else{
                if((cb[5]==tst)&&(cb[9]==tst)){
                    AffMessage(tst);
                }
            }

        }
    }
    void pb2 (){
        if(cb[1]==tst&&cb[3]==tst){
            AffMessage(tst);
        }
        else{
            if(cb[5]==tst&&cb[8]==tst){
                AffMessage(tst);
            }
        }
    }
    void pb3(){
        if(cb[1]==tst&&cb[2]==tst){
            AffMessage(tst);
        }
        else{
            if(cb[6]==tst&&cb[9]==tst){
                AffMessage(tst);
            }
            else{
                if(cb[5]==tst&&cb[7]==tst){
                    AffMessage(tst);
                }
            }
        }
    }
    void pb4 (){
        if(cb[1]==tst&&cb[7]==tst){
            AffMessage(tst);
        }
        else{
            if (cb[5]==tst&&cb[6]==tst) {
                AffMessage(tst);
            }
        }
    }
    void pb5 (){
        if (cb[4]==tst&&cb[6]==tst) {
            AffMessage(tst);
        }
        else{
            if (cb[2]==tst&&cb[8]==tst) {
                AffMessage(tst);
            }
            else{
                if (cb[1] == tst && cb[9]==tst) {
                    AffMessage(tst);
                }
                else{
                    if (cb[3]==tst&&cb[7]==tst) {
                        AffMessage(tst);
                    }
                }
            }
        }
    }
    void pb6 (){
        if (cb[3]==tst&&cb[9]==tst) {
            AffMessage(tst);
        }
        else{
            if (cb[4] == tst && cb[5]==tst) {
                AffMessage(tst);
            }
        }
    }
    void pb7(){
        if (cb[1]==tst&&cb[4]==tst) {
            AffMessage(tst);
        }
        else{
            if (cb[8]==tst&&cb[9]==tst) {
                AffMessage(tst);
            }
            else{
                if (cb[5]==tst&&cb[3]==tst) {
                    AffMessage(tst);
                }
            }
        }
    }
    void pb8 (){
        if (cb[7] == tst && cb[9]==tst) {
            AffMessage(tst);
        }
        else
        {
            if(cb[2]==tst&&cb[5]==tst){
                AffMessage(tst);
            }
        }

    }
    void pb9 (){
        if (cb[3] == tst && cb[6]==tst) {
            AffMessage(tst);
        }
        else{
            if(cb[1]==tst&&cb[5]==tst){
                AffMessage(tst);
            }
            else{
                if(cb[7]==tst&&cb[8]==tst){
                    AffMessage(tst);
                }
            }
        }
    }
    public void AffMessage(String tst){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);



        builder.setTitle("Winner !!");
        if(tst=="x") {
            builder.setMessage("Player one winn");
        }
        else{
            builder.setMessage("Player two winn");
        }
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        builder.show();
    }


}
