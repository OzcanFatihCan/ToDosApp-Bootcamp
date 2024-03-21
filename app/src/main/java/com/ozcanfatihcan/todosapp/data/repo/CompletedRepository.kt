package com.ozcanfatihcan.todosapp.data.repo

import com.ozcanfatihcan.todosapp.data.datasource.TodoDataSource

class CompletedRepository(var completedDataSource: TodoDataSource) {
    //suspend fun getCompleted():List<Todos> = completedDataSource.getCompleted()

    //suspend fun searchCompleted(searchWord:String):List<Todos> = completedDataSource.searchCompleted(searchWord)
}