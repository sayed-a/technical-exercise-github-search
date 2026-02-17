package com.entelect.technicalexercise.gitsearchapp.network

import com.entelect.technicalexercise.gitsearchapp.models.GithubSearchResult
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitClient {

    companion object {

        private const val BASE_URL = "https://api.github.com"

        fun create(): RetrofitClient {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(RetrofitClient::class.java)
        }
    }

    @GET("/search/repositories")
    suspend fun search(@Query("q") query: String): GithubSearchResult
}