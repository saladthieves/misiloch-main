package com.gebeya.misiloch.about

import android.os.Bundle
import com.gebeya.framework.base.BaseActivity
import com.gebeya.misiloch.R

class AboutActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        loadData()
    }

    private fun loadData() {
        // TODO: Add loading logic
    }
}