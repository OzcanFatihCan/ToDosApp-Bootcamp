package com.ozcanfatihcan.todosapp.di

import com.ozcanfatihcan.todosapp.data.datasource.TodoDataSource
import com.ozcanfatihcan.todosapp.data.repo.CompletedRepository
import com.ozcanfatihcan.todosapp.data.repo.TodoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideTodoDataSource():TodoDataSource{
        return TodoDataSource()
    }
    @Provides
    @Singleton
    fun provideTodoRepository(todoDataSource: TodoDataSource):TodoRepository{
        return TodoRepository(todoDataSource)
    }
    @Provides
    @Singleton
    fun provideCompletedRepository(todoDataSource: TodoDataSource):CompletedRepository{
        return CompletedRepository(todoDataSource)
    }
}