package com.gebeya.misiloch.splash

import android.os.Bundle
import android.os.Handler
import com.gebeya.framework.base.BaseActivity
import com.gebeya.framework.util.action
import com.gebeya.misiloch.R

class SplashActivity : BaseActivity() {
    private val fragment = SplashFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportFragmentManager.action {
            add(R.id.splashFragmentContainer, fragment)
        }

        /*
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.add(R.id.splashFragmentContainer, fragment)
        transaction.commit()
        */
    }

    fun removeFragment() {
        val handler = Handler()
        handler.postDelayed({
            supportFragmentManager
                .beginTransaction()
                .remove(fragment)
                .commit()
        }, 3000)
    }
}