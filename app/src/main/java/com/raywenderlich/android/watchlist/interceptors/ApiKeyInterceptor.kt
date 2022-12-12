package com.raywenderlich.android.watchlist.interceptors

import com.raywenderlich.android.watchlist.BuildConfig
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class ApiKeyInterceptor:Interceptor {
    private val apiKeyQueryParameterKey = "api_key"

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest: Request = chain.request()
        val originalUrl: HttpUrl = originalRequest.url

        val url: HttpUrl = originalUrl.newBuilder()
            .addQueryParameter(apiKeyQueryParameterKey, BuildConfig.THE_MOVIE_DB_API_TOKEN)
            .build()

        val newRequest = originalRequest.newBuilder()
            .url(url)
            .build()

        return chain.proceed(newRequest)
    }
}