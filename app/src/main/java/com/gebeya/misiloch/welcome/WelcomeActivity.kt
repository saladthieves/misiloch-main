package com.gebeya.misiloch.welcome

import android.os.Bundle
import android.os.Handler
import androidx.core.os.postDelayed
import androidx.viewpager.widget.ViewPager
import com.gebeya.framework.base.BaseActivity
import com.gebeya.misiloch.R
import kotlinx.android.synthetic.main.activity_welcome.*
import java.util.*

const val PAGE_COUNT = 3

class WelcomeActivity : BaseActivity(), ViewPager.OnPageChangeListener {

    private lateinit var titles: Array<String>
    private lateinit var descriptions: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        titles = resources.getStringArray(R.array.welcome_titles)
        descriptions = resources.getStringArray(R.array.welcome_descriptions)

        val images = arrayOf(
            R.drawable.welcome_camera_icon,
            R.drawable.welcome_favorite_icon,
            R.drawable.welcome_share_icon
        )

        welcomeViewPager.adapter = WelcomePagerAdapter(
            supportFragmentManager, images
        )

        welcomeViewPager.addOnPageChangeListener(this)

/*
        val handler = Handler()
        val task = object: Runnable {
            override fun run() {
                moveNext()
                handler.postDelayed(this, 3000)
            }
        }
        handler.postDelayed(task, 3000)
*/
    }

    // Timer class

    fun moveNext() {
        val position = welcomeViewPager.currentItem
        val next = if (position == PAGE_COUNT - 1) {
            0
        } else {
            position + 1
        }

        welcomeViewPager.currentItem = next
    }

    override fun onPageScrollStateChanged(state: Int) = Unit

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

    }

    override fun onPageSelected(position: Int) {
        val title = titles[position]
        val description = descriptions[position]

        welcomeTitleLabel.text = title
        welcomeDescriptionLabel.text = description
    }
}
