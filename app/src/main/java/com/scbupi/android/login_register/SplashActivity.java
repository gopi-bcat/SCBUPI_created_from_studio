package com.scbupi.android.login_register;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.scbupi.android.R;
import com.scbupi.android.common.CommonMethods;
import com.scbupi.android.common.MyTypeface;

public class SplashActivity extends AppCompatActivity {

    private String TAG = SplashActivity.this.getClass().getSimpleName();
    private Activity context = SplashActivity.this;
    private MyTypeface tf;
    private CommonMethods cm;

    private Intent ExistingAndNewUserActivityIntent;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //remove Title
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setNavigationBarColor(ContextCompat.getColor(context,R.color.softKeysBackgroundColor));
        }

        /*Window w = getWindow(); // in Activity's onCreate() for instance
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);*/

//        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            Window window = getWindow();
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            //window.setStatusBarColor(Color.TRANSPARENT);
//            window.setNavigationBarColor(Color.WHITE);
//        }*/

        ExistingAndNewUserActivityIntent = new Intent(context, ExistingAndNewUserActivity.class);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                startActivity(ExistingAndNewUserActivityIntent);
                finish();
            }
        }, 3000);

    }
}
