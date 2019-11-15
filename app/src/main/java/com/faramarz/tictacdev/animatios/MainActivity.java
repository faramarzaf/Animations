package com.faramarz.tictacdev.animatios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.faramarz.tictacdev.animatios.sample3.Animation3Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                startActivity(new Intent(this, Animation1Activity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(this, Animation2Activity.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(this, Animation3Activity.class));
                break;

            case R.id.btn4:
                startActivity(new Intent(this, SecondActivity.class));
                overridePendingTransition(R.anim.enter_activity, R.anim.exit_activity);
                break;


        }


    }


}
