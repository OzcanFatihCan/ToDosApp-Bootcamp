package com.ozcanfatihcan.todosapp.data.repo

import com.ozcanfatihcan.todosapp.data.datasource.TodoDataSource
import com.ozcanfatihcan.todosapp.data.entity.Todos

class TodoRepository(var todoDataSource: TodoDataSource) {
    suspend fun saveTodo(todo_name:String,todo_detail:String,todo_time:String)=todoDataSource.saveTodo(todo_name,todo_detail,todo_time)

    suspend fun updateTodo(todo_id:Int,todo_name:String,todo_detail:String,todo_time:String)=todoDataSource.updateTodo(todo_id,todo_name,todo_detail,todo_time)

    suspend fun deleteTodo(todo_id:Int)=todoDataSource.deleteTodo(todo_id)

    suspend fun getTodo():List<Todos> = todoDataSource.getTodo()

    //suspend fun searchTodo(searchWord:String):List<Todos> = todoDataSource.searchTodo(searchWord)
}