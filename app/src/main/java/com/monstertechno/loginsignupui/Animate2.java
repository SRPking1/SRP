package com.monstertechno.loginsignupui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;

public class Animate2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animate2);
        EditText editText = (EditText) findViewById(R.id.start_text);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.send);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().trim().length()==1)
                {

                  appCompatImageView.setVisibility(View.VISIBLE);
                }
                else
                {
                    appCompatImageView.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.inbox);
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_right);
                appCompatImageView.startAnimation(animation);

                AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById(R.id.more);
                Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_right);
                appCompatImageView2.startAnimation(animation2);
            }
        });
    }
}