package com.geektech.quizapp_gt_4_2.splashscreen;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.geektech.quizapp_gt_4_2.R;
import com.geektech.quizapp_gt_4_2.main.MainActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        timerForSplashActivity();
    }

    private void timerForSplashActivity() {
        int delayMillis = 1000;

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                selectMethod();
            }
        }, delayMillis);
    }

    private void selectMethod() {
        MainActivity.start(this);
        finish();
    }
}
