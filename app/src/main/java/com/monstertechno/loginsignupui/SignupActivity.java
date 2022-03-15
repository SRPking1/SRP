package com.monstertechno.loginsignupui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_main);


//        TextView welcm_txt = (TextView) findViewById(R.id.wlcm_indilive);
//        TextView quickLoginMobile_txt = (TextView) findViewById(R.id.quick_login_mobile);
//        TextView phoneNumberTxt = (TextView) findViewById(R.id.phn_num_txt);
//        TextView otherQuickSigin = (TextView) findViewById(R.id.otherQuickSignin);

 //       Typeface face_bold_oswald = ResourcesCompat.getFont(this,R.font.oswald_regular);
//        Typeface face_normal_caviar = ResourcesCompat.getFont(this,R.font.caviar_dreams);
//        Typeface face_bold_caviar = ResourcesCompat.getFont(this,R.font.caviar_dreams_bold);

//        welcm_txt.setTypeface(face_bold_oswald);
//        quickLoginMobile_txt.setTypeface(face_bold_oswald);
//        phoneNumberTxt.setTypeface(face_bold_oswald);
//        otherQuickSigin.setTypeface(face_bold_oswald);


    }
}
