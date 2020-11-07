package com.gebeya.misiloch.about

import android.content.res.Resources
import android.os.Bundle
import com.gebeya.framework.base.BaseActivity
import com.gebeya.framework.util.Api
import com.gebeya.framework.util.BASE_URL
import com.gebeya.misiloch.R
import kotlinx.android.synthetic.main.activity_about.*
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AboutActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        loadData()
    }

    private fun loadData() {
        val retrofit = Api.getRetrofit()
        val service = retrofit.create(ApiStatusService::class.java)
        service.getStatus().enqueue(object : Callback<ApiStatus> {
            override fun onFailure(call: Call<ApiStatus>, t: Throwable) {
                TODO("Not yet implemented")

            }
            override fun onResponse(call: Call<ApiStatus>, response: Response<ApiStatus>) {
                val status = response.body() ?: return
                updateData(status)
            }
        })
    }

    fun updateData(data: ApiStatus) {
        val (author, _, status) = data

        aboutAuthorLabel.text = getString(R.string.about_author_label, author)
        aboutStatusLabel.text = getString(R.string.about_status_label, status)
    }
}