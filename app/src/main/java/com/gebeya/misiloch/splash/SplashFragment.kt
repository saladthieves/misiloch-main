package com.gebeya.misiloch.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gebeya.framework.base.BaseFragment
import com.gebeya.misiloch.R

class SplashFragment : BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,  // RelativeLayout
        savedInstanceState: Bundle?
    ): View? {

        val arguments = arguments
        inflate(R.layout.fragment_splash, container)

        return root
    }
}