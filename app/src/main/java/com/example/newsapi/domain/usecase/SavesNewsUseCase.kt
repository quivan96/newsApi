package com.example.newsapi.domain.usecase

import com.example.newsapi.domain.repository.NewsRepository

class SavesNewsUseCase(private val newsRepository: NewsRepository) {
}