package com.example.newsapi.domain.usecase

import com.example.newsapi.domain.repository.NewsRepository

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
}