package com.example.newsapi.domain.usecase

import com.example.newsapi.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {
}