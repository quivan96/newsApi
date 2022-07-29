package com.example.newsapi.data.repository.dataSource

import com.example.newsapi.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {

    suspend fun getTopHeadlines(): Response<APIResponse>
}