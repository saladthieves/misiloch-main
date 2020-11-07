package com.gebeya.misiloch.about

import com.google.gson.annotations.SerializedName
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiStatusService {
    @GET("status")
    fun getStatus() : Call<ApiStatus>

    @POST("login")
    fun login(@Body request: LoginRequest) : Call<LoginResponse>
}

data class ApiStatus(
    val author: String,
    val version: String,
    val status: String
)

data class LoginRequest(
    val username: String,
    val password: String
)

data class LoginResponse(val token: String)