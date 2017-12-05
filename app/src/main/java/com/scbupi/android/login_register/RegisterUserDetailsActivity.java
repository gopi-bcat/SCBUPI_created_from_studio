package com.scbupi.android.login_register;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.scbupi.android.R;
import com.scbupi.android.common.CommonMethods;
import com.scbupi.android.common.Constants;
import com.scbupi.android.common.MyTypeface;

public class RegisterUserDetailsActivity extends AppCompatActivity {

    private String TAG = RegisterUserDetailsActivity.this.getClass().getSimpleName();
    private Activity context = RegisterUserDetailsActivity.this;
    private MyTypeface tf;
    private CommonMethods cm;

    private TextView tvMainInstruction,tvGender,tvMale,tvFemale,tvTitleDOB,tvDOB,tvMyMobTitle,tvRegisteredMobNo;
    private EditText etFName,etLName,etEmailId;
    private LinearLayout llMale,llFemale,llMyMobNo;
    private AutoCompleteTextView actLocation;
    private Button btnProceed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user_details);

        tf = new MyTypeface(context);
        cm = new CommonMethods(context);

        tvMainInstruction = (TextView) findViewById(R.id.tvMainInstruction);
        tvGender = (TextView) findViewById(R.id.tvGender);
        tvMale = (TextView) findViewById(R.id.tvMale);
        tvFemale = (TextView) findViewById(R.id.tvFemale);
        tvTitleDOB = (TextView) findViewById(R.id.tvTitleDOB);
        tvDOB = (TextView) findViewById(R.id.tvDOB);
        tvRegisteredMobNo = (TextView) findViewById(R.id.tvRegisteredMobNo);
        tvMyMobTitle = (TextView) findViewById(R.id.tvMyMobTitle);
        btnProceed = (Button) findViewById(R.id.btnProceed);

        actLocation = (AutoCompleteTextView) findViewById(R.id.actLocation);


        etFName = (EditText) findViewById(R.id.etFName);
        etLName = (EditText) findViewById(R.id.etLName);
        etEmailId = (EditText) findViewById(R.id.etEmailId);

        llMale = (LinearLayout) findViewById(R.id.llMale);
        llFemale = (LinearLayout) findViewById(R.id.llFemale);
        llMyMobNo = (LinearLayout) findViewById(R.id.llMyMobNo);


        tf.setTextViewTypeface(tvMainInstruction, Constants.SC_SANS_APP_LIGHT);
        tf.setTextViewTypeface(tvGender, Constants.SC_SANS_APP_THIN);
        tf.setTextViewTypeface(tvMale, Constants.SC_SANS_APP_THIN);
        tf.setTextViewTypeface(tvFemale, Constants.SC_SANS_APP_THIN);
        tf.setTextViewTypeface(tvTitleDOB, Constants.SC_SANS_APP_THIN);
        tf.setTextViewTypeface(tvDOB, Constants.SC_SANS_APP_THIN);
        tf.setTextViewTypeface(tvRegisteredMobNo, Constants.SC_SANS_APP_THIN);
        tf.setTextViewTypeface(tvMyMobTitle,Constants.SC_SANS_APP_THIN);

        //gopi autocomplete textview
        tf.setTextViewTypeface(actLocation, Constants.SC_SANS_APP_THIN);

        tf.setEditTextTypeface(etFName, Constants.SC_SANS_APP_THIN);
        tf.setEditTextTypeface(etLName, Constants.SC_SANS_APP_THIN);
        tf.setEditTextTypeface(etEmailId, Constants.SC_SANS_APP_THIN);

        tf.setButtonTypeface(btnProceed, Constants.SC_SANS_APP_LIGHT);


    }
}
