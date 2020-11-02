package com.gebeya.misiloch.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.gebeya.framework.base.BaseFragment
import com.gebeya.misiloch.R
import kotlinx.android.synthetic.main.fragment_welcome.*

const val KEY_IMAGE = "IMAGE"

class WelcomeFragment : BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        inflate(R.layout.fragment_welcome, container)
        return root
    }

    // After Activity.onCreate() has been called
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    // After onCreateView() has been called
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args = arguments ?: return

        // We are sure that args is not null
        val image = args.getInt(KEY_IMAGE)
        welcomeFragmentIcon.setImageResource(image)
    }
}