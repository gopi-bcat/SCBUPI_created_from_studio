package com.scbupi.android.login_register.extented_classes;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.scbupi.android.R;
import com.scbupi.android.common.Constants;
import com.scbupi.android.common.MyTypeface;

/**
 * Created by Tanveer on 04-12-2017.
 */

public class MyTextSliderView extends BaseSliderView{

    private Context context;
    private MyTypeface tf;

    public MyTextSliderView(Context context) {

        super(context);
        this.context = context;
        tf = new MyTypeface((Activity) context);
    }

    @Override
    public View getView() {
        View v = LayoutInflater.from(getContext()).inflate(com.daimajia.slider.library.R.layout.render_type_text,null);
        ImageView target = (ImageView)v.findViewById(com.daimajia.slider.library.R.id.daimajia_slider_image);
        TextView description = (TextView)v.findViewById(com.daimajia.slider.library.R.id.description);
        description.setText(getDescription());

        //gopi
        description.setBackgroundColor(ContextCompat.getColor(context, android.R.color.transparent));
        description.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(900, 900);
        params.gravity = Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL;
        description.setLayoutParams(params);

        tf.setTextViewTypeface(description, Constants.SC_SANS_APP_LIGHT);
        description.setLineSpacing(0,1.5f);
        description.setTextSize(16);
        /*description.setLineSpacing(0,context.getResources().getDimension(R.dimen.commonLineSpacing));
        description.setTextSize(context.getResources().getDimension(R.dimen.commonTextSize));*/



        bindEventAndShow(v, target);
        return v;
    }
}
