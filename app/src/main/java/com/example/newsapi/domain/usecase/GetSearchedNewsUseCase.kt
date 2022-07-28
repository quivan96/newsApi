package com.example.newsapi.domain.usecase

import com.example.newsapi.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
}