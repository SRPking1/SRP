package com.monstertechno.loginsignupui

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.smarteist.autoimageslider.DefaultSliderView
import com.smarteist.autoimageslider.IndicatorAnimations
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderLayout


class SignupActivity : AppCompatActivity() {
    var sliderLayout: SliderLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)
        sliderLayout = findViewById(R.id.imageSlider)
        sliderLayout?.setIndicatorAnimation(IndicatorAnimations.SWAP) //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderLayout?.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION)
        sliderLayout?.setScrollTimeInSec(1) //set scroll delay in seconds :
        setSliderViews()
    }

    private fun setSliderViews() {
        for (i in 0..2) {
            val sliderView = DefaultSliderView(this)
            when (i) {
                0 -> sliderView.imageUrl =
                    "https://images.pexels.com/photos/747964/pexels-photo-747964.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"
                1 -> sliderView.imageUrl =
                    "https://images.pexels.com/photos/747964/pexels-photo-747964.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"
                2 -> sliderView.imageUrl =
                    "https://images.pexels.com/photos/929778/pexels-photo-929778.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP)
            sliderView.description = """
                The quick brown fox jumps over the lazy dog.
                Jackdaws love my big sphinx of quartz. ${i + 1}
                """.trimIndent()
            sliderView.setOnSliderClickListener {
                Toast.makeText(
                    this@SignupActivity,
                    "This is slider " + (i + 1),
                    Toast.LENGTH_SHORT
                ).show()
            }

            //at last add this view in your layout :
            sliderLayout!!.addSliderView(sliderView)
        }
    }
}