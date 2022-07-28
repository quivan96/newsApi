package com.example.newsapi.domain.usecase

import com.example.newsapi.data.model.Article
import com.example.newsapi.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class SavesNewsUseCase(private val newsRepository: NewsRepository) {

    fun execute(): Flow<List<Article>> = newsRepository.getSavedNews()

}