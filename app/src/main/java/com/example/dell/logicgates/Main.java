package com.example.dell.logicgates;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static android.content.Intent.ACTION_VIEW;

public class Main extends AppCompatActivity {
Button B1,B2,B3,B4,B5,B6,B7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1=(Button)findViewById(R.id.button);
        B2=(Button)findViewById(R.id.button2);
        B3=(Button)findViewById(R.id.button3);
        B4=(Button)findViewById(R.id.button4);
        B5=(Button)findViewById(R.id.button5);
        B6=(Button)findViewById(R.id.button6);
        B7=(Button)findViewById(R.id.button7);
    }

    public void AND(View view) {
        Intent intent1 = new Intent(Main.this,AND.class);
        startActivity(intent1);
    }

    public void OR(View view) {
        Intent intent2 = new Intent(Main.this,OR.class);
        startActivity(intent2);
    }

    public void NOT(View view) {
        Intent intent3 = new Intent(Main.this,NOT.class);
        startActivity(intent3);
    }

    public void NAND(View view) {
        Intent intent4 = new Intent(Main.this,NAND.class);
        startActivity(intent4);
    }

    public void NOR(View view) {
        Intent intent5 = new Intent(Main.this,NOR.class);
        startActivity(intent5);
    }

    public void EOR(View view) {
        Intent intent6 = new Intent(Main.this,EOR.class);
        startActivity(intent6);
    }

    public void ENOR(View view) {
        Intent intent7 = new Intent(Main.this,ENOR.class);
        startActivity(intent7);
    }

}
