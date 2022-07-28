package com.example.newsapi.domain.usecase

import com.example.newsapi.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
}