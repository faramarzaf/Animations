package com.faramarz.tictacdev.animatios;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Animation2Activity extends AppCompatActivity implements View.OnClickListener {

    TextView txtMessage;
    Button btnFadeIn, btnBounce, btnZoomIn, btnZoomOut, btnSequential, btnTogether;
    Animation animFadein, animBounce, zoomIn, zoomOut, sequential, together;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation2);
        initView();
        initListeners();
        loadAnimations();
    }

    private void initView() {
        txtMessage = findViewById(R.id.text);
        btnFadeIn = findViewById(R.id.btnFadeIn);
        btnBounce = findViewById(R.id.btnBounce);
        btnZoomIn = findViewById(R.id.btnZoomIn);
        btnZoomOut = findViewById(R.id.btnZoomOut);
        btnSequential = findViewById(R.id.btnSequential);
        btnTogether = findViewById(R.id.btnTogether);
    }

    private void initListeners() {
        btnFadeIn.setOnClickListener(this);
        btnBounce.setOnClickListener(this);
        btnZoomIn.setOnClickListener(this);
        btnZoomOut.setOnClickListener(this);
        btnSequential.setOnClickListener(this);
        btnTogether.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnFadeIn:
                txtMessage.setVisibility(View.VISIBLE);
                txtMessage.startAnimation(animFadein);
                break;

            case R.id.btnBounce:
                txtMessage.setVisibility(View.VISIBLE);
                txtMessage.startAnimation(animBounce);
                break;

            case R.id.btnZoomIn:
                txtMessage.setVisibility(View.VISIBLE);
                txtMessage.startAnimation(zoomIn);
                break;

            case R.id.btnZoomOut:
                txtMessage.setVisibility(View.VISIBLE);
                txtMessage.startAnimation(zoomOut);
                break;

            case R.id.btnSequential:
                txtMessage.setVisibility(View.VISIBLE);
                txtMessage.startAnimation(sequential);
                break;

            case R.id.btnTogether:
                txtMessage.setVisibility(View.VISIBLE);
                txtMessage.startAnimation(together);
                break;
        }

    }

    private void loadAnimations() {
        animFadein = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        animBounce = AnimationUtils.loadAnimation(this, R.anim.bounce);
        zoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
        zoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out);
        together = AnimationUtils.loadAnimation(this, R.anim.together);
        sequential = AnimationUtils.loadAnimation(this, R.anim.sequential);
    }

}
