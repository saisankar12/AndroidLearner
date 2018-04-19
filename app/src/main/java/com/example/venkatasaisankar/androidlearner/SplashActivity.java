package com.example.venkatasaisankar.androidlearner;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class SplashActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       /* getSupportActionBar().hide();*/
       /* LinearLayout rl = (LinearLayout)findViewById(R.id.activity_splash);
        rl.setBackgroundColor(Color.RED);*/

        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);
        ImageView image=(ImageView)findViewById(R.id.imageView);

        image.setAnimation(animation);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },4000);



    }
}
