package com.svhgraphic.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


private const val SPLASH_TIME: Long = 3000

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

      Handler().postDelayed({
startActivity(Intent (this,MainActivity::class.java))
          finish()


               }, SPLASH_TIME)
        }
       }