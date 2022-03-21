package com.monstertechno.loginsignupui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView


class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.send_message_animate)


        val editText = findViewById<View>(R.id.start_text) as EditText
        val appCompatImageView3 = findViewById<View>(R.id.send) as AppCompatImageView
        val appCompatImageView1 = findViewById<View>(R.id.inbox) as AppCompatImageView
        val appCompatImageView2 = findViewById<View>(R.id.more) as AppCompatImageView

        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                appCompatImageView3.visibility = View.GONE
                appCompatImageView2.visibility = View.VISIBLE
                appCompatImageView1.visibility = View.VISIBLE

            }
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if (s.toString().trim { it <= ' ' }.length >=1) {

//                        val animation = AnimationUtils.loadAnimation(
//                            applicationContext, R.anim.move_right
//                        )
//                        appCompatImageView1.startAnimation(animation)
//
//                        val animation2 = AnimationUtils.loadAnimation(
//                            applicationContext, R.anim.move_right
//                        )
//                        appCompatImageView2.startAnimation(animation2)

                    appCompatImageView3.visibility = View.VISIBLE
                    appCompatImageView2.visibility = View.GONE
                    appCompatImageView1.visibility = View.GONE

                }
                else{
                    appCompatImageView3.setVisibility(View.GONE)
                    appCompatImageView2.visibility = View.VISIBLE
                    appCompatImageView1.visibility = View.VISIBLE
                }
            }

            override fun afterTextChanged(editable: Editable) {}
        })




        editText.setOnClickListener(View.OnClickListener {
            val appCompatImageView = findViewById<View>(R.id.inbox) as AppCompatImageView
            val animation = AnimationUtils.loadAnimation(
                applicationContext, R.anim.move_right
            )
            appCompatImageView.startAnimation(animation)
            val appCompatImageView2 = findViewById<View>(R.id.more) as AppCompatImageView
            val animation2 = AnimationUtils.loadAnimation(
                applicationContext, R.anim.move_right
            )
            appCompatImageView2.startAnimation(animation2)
        })

    }
}