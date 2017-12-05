package com.scbupi.android.common;

import android.app.Activity;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.scbupi.android.common.Constants.*;

/**
 * Created by Tanveer on 01-12-2017.
 */

public class MyTypeface {

    private Activity context;

    public MyTypeface(Activity context){
        this.context = context;
    }

    public void setTextViewTypeface(TextView textView, String typefaceName){

        switch (typefaceName){

            case Constants.SC_SANS_APP_BOLD_ITALIC:
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Bold Italic.ttf"));
                break;
            case Constants.SC_SANS_APP_BOLD:
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Bold.ttf"));
                break;
            case Constants.SC_SANS_APP_ITALIC:
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Italic.ttf"));
                break;
            case Constants.SC_SANS_APP_LIGHT_ITALIC:
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Light Italic.ttf"));
                break;
            case Constants.SC_SANS_APP_LIGHT:
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Light.ttf"));
                break;
            case Constants.SC_SANS_APP_REGULAR:
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Regular.ttf"));
                break;
            case Constants.SC_SANS_APP_THIN_ITALIC:
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Thin Italic.ttf"));
                break;
            case Constants.SC_SANS_APP_THIN:
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Thin.ttf"));
                break;
            case Constants.SC_SANS_APP_ULTRA_THIN_ITALIC:
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Ultra Thin Italic.ttf"));
                break;
            case Constants.SC_SANS_APP_ULTRA_THIN:
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Ultra Thin.ttf"));
                break;
        }
    }

    public void setEditTextTypeface(EditText editText, String typefaceName){

        switch (typefaceName){

            case Constants.SC_SANS_APP_BOLD_ITALIC:
                editText.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Bold Italic.ttf"));
                break;
            case Constants.SC_SANS_APP_BOLD:
                editText.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Bold.ttf"));
                break;
            case Constants.SC_SANS_APP_ITALIC:
                editText.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Italic.ttf"));
                break;
            case Constants.SC_SANS_APP_LIGHT_ITALIC:
                editText.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Light Italic.ttf"));
                break;
            case Constants.SC_SANS_APP_LIGHT:
                editText.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Light.ttf"));
                break;
            case Constants.SC_SANS_APP_REGULAR:
                editText.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Regular.ttf"));
                break;
            case Constants.SC_SANS_APP_THIN_ITALIC:
                editText.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Thin Italic.ttf"));
                break;
            case Constants.SC_SANS_APP_THIN:
                editText.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Thin.ttf"));
                break;
            case Constants.SC_SANS_APP_ULTRA_THIN_ITALIC:
                editText.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Ultra Thin Italic.ttf"));
                break;
            case Constants.SC_SANS_APP_ULTRA_THIN:
                editText.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Ultra Thin.ttf"));
                break;
        }
    }

    public void setButtonTypeface(Button button, String typefaceName){

        switch (typefaceName){

            case Constants.SC_SANS_APP_BOLD_ITALIC:
                button.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Bold Italic.ttf"));
                break;
            case Constants.SC_SANS_APP_BOLD:
                button.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Bold.ttf"));
                break;
            case Constants.SC_SANS_APP_ITALIC:
                button.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Italic.ttf"));
                break;
            case Constants.SC_SANS_APP_LIGHT_ITALIC:
                button.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Light Italic.ttf"));
                break;
            case Constants.SC_SANS_APP_LIGHT:
                button.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Light.ttf"));
                break;
            case Constants.SC_SANS_APP_REGULAR:
                button.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Regular.ttf"));
                break;
            case Constants.SC_SANS_APP_THIN_ITALIC:
                button.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Thin Italic.ttf"));
                break;
            case Constants.SC_SANS_APP_THIN:
                button.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Thin.ttf"));
                break;
            case Constants.SC_SANS_APP_ULTRA_THIN_ITALIC:
                button.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Ultra Thin Italic.ttf"));
                break;
            case Constants.SC_SANS_APP_ULTRA_THIN:
                button.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/SC Sans App-Ultra Thin.ttf"));
                break;
        }
    }

}
