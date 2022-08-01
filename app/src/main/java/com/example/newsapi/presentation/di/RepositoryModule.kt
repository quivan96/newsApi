package com.example.newsapi.presentation.di

import com.example.newsapi.data.repository.NewsRepositoryImpl
import com.example.newsapi.data.repository.dataSource.NewsRemoteDataSource
import com.example.newsapi.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import com.example.newsapi.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(newsRemoteDataSource: NewsRemoteDataSource): NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource)
    }
}