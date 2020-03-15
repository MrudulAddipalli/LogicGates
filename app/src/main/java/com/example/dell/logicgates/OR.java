package com.example.dell.logicgates;

import android.annotation.SuppressLint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;


public class OR extends AppCompatActivity {
    Switch S1,S2;
    ImageView I;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_and);
        S1 = (Switch) findViewById(R.id.switch1);
        S2 = (Switch) findViewById(R.id.switch2);
        I = (ImageView)findViewById(R.id.imageView);
        if(S1.isChecked() || S2.isChecked()){

            I.setBackgroundColor(getColor(R.color.gold));
        }
        else
        {
            I.setBackgroundColor(getColor(R.color.white));
        }
        S1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(S1.isChecked() || S2.isChecked()){

                    I.setBackgroundColor(getColor(R.color.gold));
                }
                else
                {
                    I.setBackgroundColor(getColor(R.color.white));
                }
            }
        });
        S2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(S1.isChecked() || S2.isChecked()){

                    I.setBackgroundColor(getColor(R.color.gold));
                }
                else
                {
                    I.setBackgroundColor(getColor(R.color.white));
                }
            }
        });

    }
}
