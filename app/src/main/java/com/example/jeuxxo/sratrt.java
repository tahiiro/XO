package com.example.jeuxxo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sratrt extends AppCompatActivity {
        private Button play;
        private Button playmob;

        public void open(){
        Intent inte=new Intent(this,MainActivity.class);
        startActivities(new Intent[]{inte});
    }
        public void open2(){
        Intent inte=new Intent(this,mobil2.class);
        startActivities(new Intent[]{inte});
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sratrt);



        play=(Button)findViewById(R.id.play);
        playmob=(Button)findViewById(R.id.playmob);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open();
            }
        });
        playmob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open2();
            }
        });

    }


}
