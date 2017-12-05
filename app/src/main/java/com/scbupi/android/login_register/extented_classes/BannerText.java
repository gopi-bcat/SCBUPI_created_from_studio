package com.scbupi.android.login_register.extented_classes;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.LinearLayout;

import com.daimajia.slider.library.Animations.BaseAnimationInterface;

/**
 * Created by Tanveer on 04-12-2017.
 */

public class BannerText implements BaseAnimationInterface {

    private String TAG = BannerText.this.getClass().getSimpleName();

    Activity context;

    LinearLayout.LayoutParams params;


    public BannerText (Activity context){
        this.context = context;



        /*button.setLayoutParams(params);

        params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        //params.weight = 1.0f;
        params.gravity = Gravity.TOP;*/
    }

    @Override
    public void onPrepareCurrentItemLeaveScreen(View current) {
        View descriptionLayout = current.findViewById(com.daimajia.slider.library.R.id.description_layout);
        if(descriptionLayout!=null){
            current.findViewById(com.daimajia.slider.library.R.id.description_layout);
            descriptionLayout.setBackgroundColor(ContextCompat.getColor(context, android.R.color.transparent));
        }
    }

    @Override
    public void onPrepareNextItemShowInScreen(View next) {

        View descriptionLayout = next.findViewById(com.daimajia.slider.library.R.id.description_layout);
        if(descriptionLayout!=null){
            next.findViewById(com.daimajia.slider.library.R.id.description_layout);
            descriptionLayout.setBackgroundColor(ContextCompat.getColor(context, android.R.color.transparent));
        }
    }

    @Override
    public void onCurrentItemDisappear(View view) {

    }

    @Override
    public void onNextItemAppear(View view) {

    }
}
