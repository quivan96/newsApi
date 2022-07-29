package com.example.newsapi.data.repository.dataSourceImpl

import com.example.newsapi.BuildConfig
import com.example.newsapi.data.api.NewsApiService
import com.example.newsapi.data.model.APIResponse
import com.example.newsapi.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response
import retrofit2.http.Query

class NewsRemoteDataSourceImpl(
    private val newsApiService: NewsApiService,
    private val country: String,
    private val page: Int,
    private val apiKey: String = BuildConfig.API_KEY
) : NewsRemoteDataSource {

    override suspend fun getTopHeadlines(): Response<APIResponse> {
        return newsApiService.getTopHeadlines(country, page, apiKey)
    }

}