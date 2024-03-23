package com.ozcanfatihcan.todosapp.data.repo

import com.ozcanfatihcan.todosapp.data.datasource.TodoDataSource
import com.ozcanfatihcan.todosapp.data.entity.Completed

class CompletedRepository(var completedDataSource: TodoDataSource) {
    suspend fun getCompleted():List<Completed> = completedDataSource.getCompleted()

    suspend fun saveCompleted(todo_name:String,todo_detail:String,todo_time:String)=completedDataSource.saveCompleted(todo_name,todo_detail,todo_time)

    suspend fun deleteCompleted(todo_id:Int)=completedDataSource.deleteCompleted(todo_id)

    //suspend fun searchCompleted(searchWord:String):List<Completed> = completedDataSource.searchCompleted(searchWord)
}