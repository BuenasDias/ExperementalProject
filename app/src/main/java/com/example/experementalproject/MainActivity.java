package com.example.experementalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Animation topAnim, botAnim;
    ImageView imageView;
    Button btnStart;
    TextView txtStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        botAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);

        btnStart.setAnimation(botAnim);

        txtStart = (TextView) findViewById(R.id.txtNameProject);
        txtStart.setAnimation(topAnim);



    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btnStart:
                intent = new Intent(this, WeatherActivity.class);
                startActivity(intent);
                break;

        }
    }
}
