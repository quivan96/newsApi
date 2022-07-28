package com.example.newsapi.domain.usecase

import com.example.newsapi.data.model.APIResponse
import com.example.newsapi.data.model.Article
import com.example.newsapi.data.utils.Resource
import com.example.newsapi.domain.repository.NewsRepository

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(article: Article) = newsRepository.saveNews(article)

}