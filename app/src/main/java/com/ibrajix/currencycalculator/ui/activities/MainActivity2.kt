package com.ibrajix.currencycalculator.ui.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.ibrajix.currencycalculator.R

class MainActivity2 : AppCompatActivity() {


    private var SPLASH_SCREEN_TIME: Long=3500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main2)

        Handler(Looper.myLooper()!!).postDelayed({
           startActivity(Intent(this, MainActivity3::class.java))

            finish()

        },SPLASH_SCREEN_TIME)
    }

}