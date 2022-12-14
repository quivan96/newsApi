package com.example.newsapi.domain.usecase

import com.example.newsapi.data.model.APIResponse
import com.example.newsapi.data.utils.Resource
import com.example.newsapi.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(country: String, page: Int): Resource<APIResponse> {
        return newsRepository.getNewsHeadlines(country, page)
    }
}