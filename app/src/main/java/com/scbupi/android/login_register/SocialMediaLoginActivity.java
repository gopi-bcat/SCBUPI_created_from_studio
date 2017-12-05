package com.scbupi.android.login_register;

import android.animation.Animator;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.scbupi.android.R;
import com.scbupi.android.common.CommonMethods;
import com.scbupi.android.common.Constants;
import com.scbupi.android.common.MyTypeface;

public class SocialMediaLoginActivity extends AppCompatActivity {

    private String TAG = SocialMediaLoginActivity.this.getClass().getSimpleName();
    private Activity context = SocialMediaLoginActivity.this;
    private MyTypeface tf;
    private CommonMethods cm;

    private TextView tvLoginInstruction,tvOr;
    private Button btnRegisterDirectly;
    private ImageView ivClose;
    private LinearLayout ll;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media_login);

        tf = new MyTypeface(context);
        cm = new CommonMethods(context);

        ll = (LinearLayout) findViewById(R.id.ll);
        tvLoginInstruction = (TextView) findViewById(R.id.tvLoginInstruction);
        tvOr = (TextView) findViewById(R.id.tvOr);

        btnRegisterDirectly = (Button) findViewById(R.id.btnRegisterDirectly);

        ivClose = (ImageView) findViewById(R.id.ivClose);


        tf.setTextViewTypeface(tvLoginInstruction, Constants.SC_SANS_APP_THIN);
        tf.setTextViewTypeface(tvOr, Constants.SC_SANS_APP_THIN);

        tf.setButtonTypeface(btnRegisterDirectly, Constants.SC_SANS_APP_LIGHT);

        //gopi animate
//        overridePendingTransition(R.anim.do_not_move, R.anim.do_not_move);
//        animateActivity(savedInstanceState);

        btnRegisterDirectly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context,RegisterUserDetailsActivity.class));
                finish();
            }
        });

        ivClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    /*private void animateActivity(Bundle savedInstanceState) {

        if (savedInstanceState == null) {
            ll.setVisibility(View.INVISIBLE);

            ViewTreeObserver viewTreeObserver = ll.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                    @Override
                    public void onGlobalLayout() {
                        circularRevealActivity();
                        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
                            ll.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        } else {
                            ll.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        }
                    }
                });
            }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void circularRevealActivity() {

        int cx = ll.getWidth() / 2;
        int cy = ll.getHeight() / 2;

        float finalRadius = Math.max(ll.getWidth(), ll.getHeight());

        // create the animator or this view (the start radius is zero)
        Animator circularReveal = ViewAnimationUtils.createCircularReveal(ll, cx, cy, 0, finalRadius);
        circularReveal.setDuration(1000);

        // make the view visible and start the animation
        ll.setVisibility(View.VISIBLE);
        circularReveal.start();
    }*/
}
