package com.ozcanfatihcan.todosapp.di

import android.content.Context
import androidx.room.Room
import com.ozcanfatihcan.todosapp.data.datasource.TodoDataSource
import com.ozcanfatihcan.todosapp.data.repo.CompletedRepository
import com.ozcanfatihcan.todosapp.data.repo.TodoRepository
import com.ozcanfatihcan.todosapp.room.CompletedDao
import com.ozcanfatihcan.todosapp.room.DatabaseTodos
import com.ozcanfatihcan.todosapp.room.TodosDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideTodoDataSource(tDao:TodosDao,cDao:CompletedDao):TodoDataSource{
        return TodoDataSource(tDao,cDao)
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
    @Provides
    @Singleton
    fun provideTodosDao(@ApplicationContext context: Context): TodosDao{
        val vt= Room.databaseBuilder(context,DatabaseTodos::class.java,"TodoDB.sqlite")
            .createFromAsset("TodoDB.sqlite")
            .build()
        return vt.getTodosDao()
    }
    @Provides
    @Singleton
    fun provideCompletedDao(@ApplicationContext context: Context): CompletedDao{
        val vtC= Room.databaseBuilder(context,DatabaseTodos::class.java,"TodoDB.sqlite")
            .createFromAsset("TodoDB.sqlite")
            .build()
        return vtC.getCompletedDao()
    }


}