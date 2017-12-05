package com.scbupi.android.common;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.WindowManager;

/**
 * Created by Tanveer on 01-12-2017.
 */

public class CommonMethods {

    private Activity context;

    public CommonMethods(Activity context){
        this.context = context;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void setNotificationPanelData(){

        //
       /* window = ExistingAndNewUserActivity.this.getWindow();
        window.setNavigationBarColor(ExistingAndNewUserActivity.this.getResources().getColor(android.R.color.transparent));
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ExistingAndNewUserActivity.this.getResources().getColor(android.R.color.transparent));*/

        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            context.getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
            context.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            context.getWindow().setNavigationBarColor(Color.BLACK);
            //getWindow().setStatusBarColor(Color.WHITE);

        }*/
    }
}
