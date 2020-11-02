package com.gebeya.misiloch.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.gebeya.framework.base.BaseActivity
import com.gebeya.framework.util.action
import com.gebeya.misiloch.R
import com.gebeya.misiloch.welcome.WelcomeActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : BaseActivity() {
    private val fragment = SplashFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportFragmentManager.action {
            add(R.id.splashFragmentContainer, fragment)
        }

        splashFragmentContainer.setOnClickListener {
            startActivity(Intent(this, WelcomeActivity::class.java))
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