package com.example.newsapi.domain.usecase

import com.example.newsapi.data.model.Article
import com.example.newsapi.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(article: Article) = newsRepository.deleteNews(article)

}