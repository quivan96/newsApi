package com.example.newsapi.domain.repository

import com.example.newsapi.data.model.APIResponse
import com.example.newsapi.data.model.Article
import com.example.newsapi.data.utils.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun getNewsHeadlines(country: String, page: Int): Resource<APIResponse>
    suspend fun getSearchedNews(searchQuery: String): Resource<APIResponse>
    suspend fun saveNews(article:Article)
    suspend fun deleteNews(article:Article)
    fun getSavedNews(): Flow<List<Article>>

}