package com.chiclaim.play.android.source

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by chiclaim@google.com
 */
object Api {

    private val client = OkHttpClient.Builder()
        .addInterceptor(CookieInterceptor())
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://www.wanandroid.com")
        .client(client)
        .addCallAdapterFactory(LiveDataCallAdapterFactory2())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> create(clazz: Class<T>): T = retrofit.create(clazz)

}