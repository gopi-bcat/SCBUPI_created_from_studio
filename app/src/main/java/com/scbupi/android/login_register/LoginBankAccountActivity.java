package com.scbupi.android.login_register;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.scbupi.android.R;
import com.scbupi.android.common.CommonMethods;
import com.scbupi.android.common.Constants;
import com.scbupi.android.common.MyTypeface;
import com.scbupi.android.common.SharedPreferenceManager;

public class LoginBankAccountActivity extends AppCompatActivity {

    private String TAG = LoginBankAccountActivity.this.getClass().getSimpleName();
    private Activity context = LoginBankAccountActivity.this;
    private MyTypeface tf;
    private CommonMethods cm;

    private EditText etUnm,etPwd;
    private TextView tvActivityHeading,tvMainInstruction,
            tvIUnderstand,tvTermsOfUse,tvForgotPassword;

    private ImageView ivTerms;

    private Button btnLogin;



    private SharedPreferenceManager sp;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_bank_account);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setNavigationBarColor(ContextCompat.getColor(context,R.color.softKeysBackgroundColor));
        }

        tf = new MyTypeface(context);
        cm = new CommonMethods(context);

        cm.setNotificationPanelData();



        tvActivityHeading = (TextView) findViewById(R.id.tvActivityHeading);
        tvMainInstruction = (TextView) findViewById(R.id.tvMainInstruction);
        tvIUnderstand = (TextView) findViewById(R.id.tvIUnderstand);
        tvTermsOfUse = (TextView) findViewById(R.id.tvTermsOfUse);
        tvForgotPassword = (TextView) findViewById(R.id.tvForgotPassword);

        etUnm = (EditText) findViewById(R.id.etUnm);
        etPwd = (EditText) findViewById(R.id.etPwd);

        ivTerms = (ImageView) findViewById(R.id.ivTerms);

        btnLogin = (Button) findViewById(R.id.btnLogin);

        tf.setTextViewTypeface(tvActivityHeading, Constants.SC_SANS_APP_REGULAR);
        tf.setTextViewTypeface(tvMainInstruction, Constants.SC_SANS_APP_LIGHT);
        tf.setTextViewTypeface(tvIUnderstand, Constants.SC_SANS_APP_LIGHT);
        tf.setTextViewTypeface(tvTermsOfUse, Constants.SC_SANS_APP_LIGHT);
        tf.setTextViewTypeface(tvForgotPassword, Constants.SC_SANS_APP_LIGHT);


        tf.setEditTextTypeface(etUnm, Constants.SC_SANS_APP_THIN);
        tf.setEditTextTypeface(etPwd, Constants.SC_SANS_APP_THIN);


        tf.setButtonTypeface(btnLogin, Constants.SC_SANS_APP_LIGHT);


        sp = new SharedPreferenceManager(context);
        setTermsSelectedImageValue();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(context,RegisterUserDetailsActivity.class));
            }
        });

        ivTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                updateTermsSelectedValue();
            }
        });
    }

    private void setTermsSelectedImageValue() {

        sp.connectDB();
        if (sp.getBoolean(Constants.TERMS_ACCEPTED)){

            ivTerms.setImageResource(R.drawable.ic_cb_selected);

        }else {
            ivTerms.setImageResource(R.drawable.ic_cb_not_selected);
        }
        sp.closeDB();
    }

    private void updateTermsSelectedValue() {

        sp.connectDB();
        if (sp.getBoolean(Constants.TERMS_ACCEPTED)){

            sp.setBoolean(Constants.TERMS_ACCEPTED,false);
            ivTerms.setImageResource(R.drawable.ic_cb_not_selected);

        }else {
            sp.setBoolean(Constants.TERMS_ACCEPTED,true);
            ivTerms.setImageResource(R.drawable.ic_cb_selected);
        }
        sp.closeDB();
    }
}
