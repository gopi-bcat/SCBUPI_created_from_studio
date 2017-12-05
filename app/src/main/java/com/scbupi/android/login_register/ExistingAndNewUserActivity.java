package com.scbupi.android.login_register;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.scbupi.android.R;
import com.scbupi.android.common.CommonMethods;
import com.scbupi.android.common.Constants;
import com.scbupi.android.common.MyTypeface;
import com.scbupi.android.login_register.extented_classes.BannerText;
import com.scbupi.android.login_register.extented_classes.MyTextSliderView;
import com.scbupi.android.login_register.object.BannerObject;

import java.util.ArrayList;
import java.util.List;


public class ExistingAndNewUserActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener,
        ViewPagerEx.OnPageChangeListener{

    private String TAG = ExistingAndNewUserActivity.this.getClass().getSimpleName();
    private Activity context = ExistingAndNewUserActivity.this;
    private MyTypeface tf;
    private CommonMethods cm;

    private Window window;

    private LinearLayout llExistingUser,llNewUser;
    private TextView tvBannerText,tvExistingUserHeading,tvExistingUserSubText,
            tvNewUserHeading,tvNewUserSubText;



    private SliderLayout slider;
    private List<BannerObject> listBannerObject;

    private PagerIndicator pagerIndicator;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existing_and_new_user);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setNavigationBarColor(ContextCompat.getColor(context,R.color.softKeysBackgroundColor));
        }

        tf = new MyTypeface(context);
        cm = new CommonMethods(context);

        cm.setNotificationPanelData();


        llExistingUser = (LinearLayout) findViewById(R.id.llExistingUser);
        llNewUser = (LinearLayout) findViewById(R.id.llNewUser);

        tvExistingUserHeading = (TextView) findViewById(R.id.tvExistingUserHeading);
        tvExistingUserSubText = (TextView) findViewById(R.id.tvExistingUserSubText);
        tvNewUserHeading = (TextView) findViewById(R.id.tvNewUserHeading);
        tvNewUserSubText = (TextView) findViewById(R.id.tvNewUserSubText);

        tf.setTextViewTypeface(tvExistingUserHeading, Constants.SC_SANS_APP_LIGHT);
        tf.setTextViewTypeface(tvExistingUserSubText, Constants.SC_SANS_APP_THIN);
        tf.setTextViewTypeface(tvNewUserHeading, Constants.SC_SANS_APP_LIGHT);
        tf.setTextViewTypeface(tvNewUserSubText, Constants.SC_SANS_APP_THIN);

        slider = (SliderLayout) findViewById(R.id.slider);
        pagerIndicator = (PagerIndicator) findViewById(R.id.pagerIndicator);

        //gopi filling list temporarily
        listBannerObject = new ArrayList<>();
        for (int i =0; i< 4; i++){
            BannerObject bannerObject = new BannerObject();
            bannerObject.setText(getResources().getString(R.string.advText));
            bannerObject.setDrawableId(R.drawable.adv_image_one);
            listBannerObject.add(bannerObject);
        }

        for (int i=0; i<listBannerObject.size(); i++){

            MyTextSliderView myTextSliderView = new MyTextSliderView(this);
            // initialize a SliderLayout
            myTextSliderView
                    .description(listBannerObject.get(i).getText())
                    .image(listBannerObject.get(i).getDrawableId())
                    .setScaleType(BaseSliderView.ScaleType.CenterCrop)
                    .setOnSliderClickListener(this);

            //add your extra information
            myTextSliderView.bundle(new Bundle());
            myTextSliderView.getBundle().putString("extra",listBannerObject.get(i).getText());

            slider.addSlider(myTextSliderView);

            TextSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
           /* textSliderView
                    .description(listBannerObject.get(i).getText())
                    .image(listBannerObject.get(i).getDrawableId())
                    .setScaleType(BaseSliderView.ScaleType.CenterCrop)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle().putString("extra",listBannerObject.get(i).getText());

            slider.addSlider(textSliderView);*/

        }

        slider.setCustomIndicator(pagerIndicator);

        slider.setPresetTransformer(SliderLayout.Transformer.Default);
        //slider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        slider.setCustomAnimation(new BannerText(context));
        slider.setDuration(2000);
        slider.addOnPageChangeListener(this);


        llExistingUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context,LoginBankAccountActivity.class));
            }
        });

        llNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context,SocialMediaLoginActivity.class));
            }
        });
    }

    @Override
    protected void onStop() {
        // To prevent a memory leak on rotation, make sure to call stopAutoCycle() on the slider before activity or fragment is destroyed
        slider.stopAutoCycle();
        super.onStop();
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {
        Toast.makeText(this,slider.getBundle().get("extra") + "",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

    @Override
    public void onPageSelected(int position) {
        Log.e("Slider Demo", "Page Changed: " + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {}
}
